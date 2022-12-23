package edu.citytech.finance.array;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.other.AbstractSearchEngine;
import com.jbbwebsolutions.ds.other.SearchParameter;

import java.util.function.Consumer;

public class LinearSearchEngine<T extends Comparable<T>> extends AbstractSearchEngine <T>{
    public LinearSearchEngine(Consumer<T> consumer) {
        super(consumer);
    }

    @Override
    public Integer[] search(SearchParameter<T> parameter, Consumer<T> consumer) {

        var items =parameter.getData();
        var size= parameter.getArraySize();
        var searchValue= parameter.getSearchFor();

        IList<Integer> positionFound= new DynamicArray<Integer>(Integer[]::new);
        for (int i=0;i<size;i++){
            consumer.accept(items[i]);
            if(items[i].compareTo(searchValue)==0){
                positionFound.insert(i);
                break;
            }
        }

       return positionFound.toArray();

    }
}
