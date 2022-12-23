package edu.citytech.finance.array;

//import edu.citytech.finance.util.Node;

import com.jbbwebsolutions.ds.facade.INumber;

import java.util.function.IntFunction;

public class DoubleLinkedList <T extends Comparable<T>> extends SingleLinkedList<T> {

    public DoubleLinkedList(IntFunction<T[]> intFunction) {
        super(intFunction);
    }

    @Override
    public void insert(T currentItem) {
        Node<T> newNode= new Node<T>(currentItem);
        size++;
        if (head == null) {
            tail=head=newNode;
            return;
        }else{
            var temp= tail;
            temp.next=newNode;
            tail=newNode;
            tail.previous=temp;
        }
    }

    @Override
    public void removeLastItem() {
        var newTail=tail.previous;
        newTail.next=null;
        tail= newTail;
        --size;
    }


}
