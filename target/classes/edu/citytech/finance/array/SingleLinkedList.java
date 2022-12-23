package edu.citytech.finance.array;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.INumber;
import com.jbbwebsolutions.ds.facade.Pair;
import edu.citytech.finance.array.DynamicArray;

//import edu.citytech.finance.util.Node;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class SingleLinkedList <T extends Comparable <T>> implements IList<T> {

    protected Node<T> head= null;
    protected Node<T> tail=null;
    private final IntFunction<T[]> intFunction;
    protected int size;
    private Consumer<T> consumer= e -> {}; //lambda expression

    public SingleLinkedList(IntFunction<T[]> intFunction){
        this.intFunction= intFunction;
    }

    @Override
    public void setConsumer(Consumer<T> consumer) {
        this.consumer= consumer;
    }

    @Override
    public void insert(T currentItem) {

        Node<T> newNode= new Node<>(currentItem);

        if(head==null)
           head =tail=newNode;
        else{
            var temp= tail;
            temp.next=newNode;
            tail=newNode;

        }

        this.size= this.size()+1;

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int indexNo) {
        T value = getNodeAt(indexNo).data;
        return value;
    }
    Node<T> getNodeAt(int indexNo){
        if(indexNo==0)
            return head;
        Node<T> currentNode= head;
        int index= 0;
        while(currentNode!=null){
            currentNode=currentNode.next;
            consumer.accept(currentNode.data);
            index++;
            if(index==indexNo)
                return currentNode;
        }
        return null;
    }

    @Override
    public Integer[] findAll(T value) {
        DynamicArray<Integer> da= new DynamicArray<Integer>(Integer[]::new);
        if(size==0)
            return da.toArray();

        Node<T> currentNode= head;
        int index=0;

        do{
            T current =currentNode.data;
            if(current.compareTo(value)==0)
                da.insert(index);
            index++;
        }while((currentNode=currentNode.next)!=null);

        return da.toArray();
    }

    @Override
    public Pair<Integer, T>[] query(Predicate<T> predicate, long limit) {
        IList<Pair<Integer,T>> dynamicArray= new DynamicArray<>(30,Pair[]::new);


        if(size==0)
            return dynamicArray.toArray();

        Node<T> currentNode= head;
        int index=0;

        do{
            T current =currentNode.data;
            if(predicate.test(current)){
                Pair<Integer,T> pair= new Pair<>(index,currentNode.data);
                dynamicArray.insert(pair);
            }

            if(limit==index + 1)
                break;
            index++;

        }while((currentNode=currentNode.next)!=null);


        return dynamicArray.toArray();
    }

    @Override
    public Pair<Integer, T>[] query(Predicate<T> predicate) {

       return this.query(predicate, Long.MAX_VALUE);
    }

    @Override //O(1)
    public T getLastItem() {
        if(size==0)
            return null;
        return this.tail.data;
    }

    @Override
    public void removeLastItem() {

        if(size==1) {
            this.removeFirstItem();
        return;
        } else if (size==0)
            return;
        else{
            int nextToLastIndex=size-2;
            Node <T> nextToLastNode= getNodeAt(nextToLastIndex);
            tail=nextToLastNode;
            tail.next=null;
            --size;
        }
    }

    @Override
    public void removeAt(int deleteIndex) {
        if(deleteIndex==0) {
            removeFirstItem();
            return;
        }
        if(deleteIndex+ 1==size){
            removeLastItem();
            return;
        }
        Node<T> currentNode= this.getNodeAt(deleteIndex - 1);
        Node<T> temp=currentNode.next;
        currentNode.next=null;
        temp=null;
        size--;
    }



    @Override
    public boolean remove(T t) {
        return false;
    }

    @Override
    public void removeAll() {
    for(Node <T> currentNode= head; currentNode!=null;){
        Node<T> next = currentNode.next;
        currentNode.data=null;
        currentNode.next=null;
        currentNode=next;
    }
    head=tail=null;
    size=0;
    }

    @Override
    public T[] toArray() {
        T[] storedValues= this.intFunction.apply(size);

        Node<T> currentNode = this.head;

        int index=0;

        while(currentNode!=null){
            storedValues[index++] = currentNode.data;
            currentNode=currentNode.next;
        }


        return storedValues;
    }

    @Override
    public T getFirstItem() {
        return this.head.data;
    }

    @Override
    public void removeFirstItem() {

        if(size==1){
            this.head=this.tail=null;
            size--;
        }
        else if(size>1){
            Node<T> second = this.head.next;
            this.head=null;
            this.head=second;
            size--;
        }


    }

    private void getNodes(Consumer<Node<T>> consumer){
        Node <T> currentNode= this.head;
        while(currentNode!=null){
            consumer.accept(currentNode);
            currentNode=currentNode.next;
        }
    }

    private void getNodesR(Consumer<Node<T>> consumer){
        Node <T> currentNode= this.tail;
        while(currentNode!=null){
            consumer.accept(currentNode);
            currentNode=currentNode.previous;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder(this.getClass().getSimpleName());
        sb.append(" size= ");
        sb.append(size);
        sb.append(" { ");
        getNodes( e->{
            sb.append(e.data);
            sb.append(" ");


        });
        sb.append("}");
        sb.append(" tail= " + this.head.data);
        sb.append(" tail= " + this.tail.data);
        return sb.toString() ;
    }
    @Override
    public double sum() {

        double total=0;
        var node = this.head;
        for (int i = 0; i < size; i++) {
            T item= node.data;
            if(item instanceof Number number)
                total=total+ number.doubleValue();
            else if (item instanceof INumber number)
                total=total+ number.getNumber();

            node=node.next;
        }
        return total;

    }
    @Override
    public double max() {

        double max=0;
        var node = this.head;
        for (int i = 0; i < size; i++) {
            T item= node.data;
            if(item instanceof Number number)
                max=Math.max(max,number.doubleValue());
            else if (item instanceof INumber number)
                max=Math.max(max,number.getNumber());
            node=node.next;
        }
        return max;
    }

    @Override
    public double min() {
        double min=0;
        var node = this.head;
        for (int i = 0; i < size; i++) {
            T item= node.data;
            if(item instanceof Number number){
                if(min==0)
                min=Math.min(number.doubleValue(),number.doubleValue());
                min=Math.min(min,number.doubleValue());

            }
            else if (item instanceof INumber number)
                min=Math.min(min,number.getNumber());

            node=node.next;
        }
        return min;
    }

    @Override
    public double average() {
        return sum()/size;
    }

}
