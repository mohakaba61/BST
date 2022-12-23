package edu.citytech.finance.array;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.INumber;
import com.jbbwebsolutions.ds.other.AbstractSearchEngine;
import com.jbbwebsolutions.ds.other.SearchEngine;
import com.jbbwebsolutions.ds.other.SearchParameter;

import java.util.function.IntFunction;
import static edu.citytech.finance.array.SelectionSort.sort;

public class SortedDynamicArray <T extends Comparable<T>>extends DynamicArray<T>{
    private AbstractSearchEngine<T> iSearchEngine = null;

    public SortedDynamicArray(IntFunction<T[]> intFunction) {
        super(intFunction);
    }

    public SortedDynamicArray(int length, IntFunction<T[]> intFunction) {
        super(length, intFunction);
    }

    public SortedDynamicArray(int length, IntFunction<T[]> intFunction, SearchEngine searchEngine) {
        super(length, intFunction);
        if(searchEngine==SearchEngine.LINEAR_SEARCH){
            this.iSearchEngine=null;
        } else if(searchEngine==SearchEngine.LINEAR_SORTED_SEARCH){
            this.iSearchEngine= new LinearSearchEngine<T>(this.consumer);
        } else if (searchEngine== SearchEngine.BINARY_SEARCH_ITERATION){
            this.iSearchEngine= new BinarySearchEngineIteration<T>(this.consumer);
        }
    }

    @Override
    public void insert(T currentItem){
        super.insert(currentItem);
        sort(items, this.size());
    }

    @Override
    public Integer[] findAll(T searchValue) {
        if(this.iSearchEngine==null){
          return super.findAll(searchValue);
        }

        var parameter= new SearchParameter<T>()
                .setData(items)
                .setArraySize(this.size())
                .setSearchFor(searchValue);

        return this.iSearchEngine.search(parameter, this.consumer);
    }

    @Override
    public double sum() {
        double total=0;

        for (int i = 0; i < this.size(); i++) {
            T item= this.items[i];
            if(item instanceof Number number)
                total=total+ number.doubleValue();
            else if (item instanceof INumber number)
                total=total+ number.getNumber();

        }
        return total;
    }

    @Override
    public double max() {
        double resutls=0;
        sort(this.items,this.size());
        T item= this.getLastItem();
        if (item instanceof Number number)
            resutls=number.doubleValue();
        else if (item instanceof INumber number)
            resutls=resutls+ number.getNumber();
        return resutls;
    }
    @Override
    public double min() {
        double resutls=0;

        sort(this.items,this.size());
        T item= this.items[0];
        if (item instanceof Number number)
            resutls=number.doubleValue();
        else if (item instanceof INumber number)
            resutls=resutls+ number.getNumber();
        return resutls;
    }
    @Override
    public double average() {
        return sum()/size();
    }


}
