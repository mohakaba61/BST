package edu.citytech.finance.array;


import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.INumber;
import com.jbbwebsolutions.ds.facade.Pair;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

import static edu.citytech.finance.array.SelectionSort.sort;

public class DynamicArray<T extends Comparable <T>> implements IList<T> {
    protected T [] items;
    private int size;
    private IntFunction<T[]> intFunction;
    protected Consumer<T> consumer= e -> {};

    public DynamicArray(IntFunction<T[]> intFunction){
        this(3, intFunction);
    }
    public DynamicArray(int length, IntFunction<T[] > intFunction){

        if(length<=0){
            length=1;
        }
        this.intFunction= intFunction;
        this.items= intFunction.apply(length);


    }

    @Override
    public void setConsumer(Consumer<T> consumer) {
        this.consumer=consumer;
    }
    @Override
    public void insert(T newItem) {
        //Check to see if the array is full
        if (items.length==size){

            T [] newItems =this.intFunction.apply(size*2);
            for(int i=0; i<size;i++){
                newItems[i]= items[i];
            }
            items=newItems;
        }
        this.items[size]= newItem;
        size++;

    }

    @Override
    public T [] toArray(){
        T [] storedValues= this.intFunction.apply(size);
        for(int i=0;i<storedValues.length;i++){
            storedValues[i]=items[i];
        }

        return storedValues;
    }

    /*
     * creating others methods, so it can be used by the T object
     */
    @Override

    public int size() {
        return this.size;
    }

    @Override
    public void removeAt(int deleteIndex) {
        if (deleteIndex <0 || deleteIndex >=size){
            String message ="Invalid number %s, current size of the index is %s"
                    + "the valid range is between 0 and %s";
            message = String.format(message, deleteIndex, size, size-1);

            throw new IllegalArgumentException(message);
        }

        for(int i= deleteIndex;i<size;i++){
            items[i] = items[i + 1];

        }
        size--;
    }

    @Override
    public Pair<Integer, T>[] query(Predicate<T> predicate) {
            IList<Pair<Integer, T>> dynamicArray= new DynamicArray<>(30,Pair[]::new);

        for (int i=0;i<size;i++){
            if(predicate.test(items[i])){
                Pair<Integer, T> pair = new Pair<>(i,items[i]);
                dynamicArray.insert(pair);
            }
        }
        return dynamicArray.toArray();

    }

    @Override public String toString(){
        T [] values= this.toArray();
        String message="Array values: ";
        for(T c: values){
            message+=c + " ";
        }
        return message;
    }
    @Override
    public Integer[] findAll(T searchValue) {
        DynamicArray <Integer> da = new DynamicArray<Integer>(size, Integer[]::new);

        for (int i=0;i<size;i++){
            consumer.accept(items[i]);
            if(items[i].compareTo(searchValue)==0){
                da.insert(i);
            }
        }
        return da.toArray();
    }

    @Override
    public Optional<T> findOne(T searchValue, Consumer<T> consumer) {
        T result = null;

        for(int i=0;i<size;i++){
            consumer.accept(items[i]);
            if(items[i].compareTo(searchValue)==0){
                result=items[i];
                break;
            }
        }
        return Optional.ofNullable(result);
    }

    @Override
    public boolean remove(T t) {
        return false;
    }
    @Override
    public void removeLastItem(){
        size--;
    }
    @Override
    public void removeAll(){
        size=0;
    }
    @Override
    public T get(int index) {
        if(index<0 || index>=size){
            String message= "Invalid number %s, current size of the index is %s "
                    + "the valid range is between 0 and %s";

            message= String.format(message, index, size, size-1);
        }

        return items[index];
    }
    @Override
    public T getLastItem(){
        return items[size-1];
    }

    @Override
    public double sum() {
        double total=0;

        for (int i = 0; i < size; i++) {
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
       sort(this.items,this.size);
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

        sort(this.items,this.size);
        T item= this.items[0];
        if (item instanceof Number number)
            resutls=number.doubleValue();
        else if (item instanceof INumber number)
            resutls=resutls+ number.getNumber();
        return resutls;
    }

    @Override
    public double average() {
        return sum()/size;
    }
}
