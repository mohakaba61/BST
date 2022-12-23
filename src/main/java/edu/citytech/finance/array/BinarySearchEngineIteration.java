package edu.citytech.finance.array;

import com.jbbwebsolutions.ds.other.AbstractSearchEngine;
import com.jbbwebsolutions.ds.other.SearchParameter;

import java.util.function.Consumer;

public class BinarySearchEngineIteration<T extends Comparable<T>> extends AbstractSearchEngine<T> {
    public BinarySearchEngineIteration(Consumer<T> consumer) {
    }
    @Override
    public Integer[] search(SearchParameter<T> parameter, Consumer<T> consumer){
        T [] data= parameter.getData();
        T searchFor= parameter.getSearchFor();
        int lo = 0, hi = parameter.getArraySize() - 1;

        // This below check covers all cases , so need to check
        // for mid=lo-(hi-lo)/2
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            var currentItem= data[mid];
            consumer.accept(currentItem);
            if (currentItem.compareTo(searchFor) < 0)
                lo = mid + 1;
            else
                hi = mid;
        }
        Integer[] results = new Integer[1];

        if (data[lo] == searchFor)
            results[0]=lo;
        else if (data[hi] == searchFor)
            results[0]=hi;
        else
            results= new Integer[0];

        return results;
    }
}
