package edu.citytech.finance.binarysearchtree;

import com.jbbwebsolutions.ds.facade.IList;
import com.jbbwebsolutions.ds.facade.INumber;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

import static edu.citytech.finance.binarysearchtree.BinaryTreeNodeHelper.*;
public class BinarySearchTree <T extends Comparable<T>> implements IList<T> {
    protected BinaryTreeNode <T> root;
    public BinarySearchTree () {}
    private int size=0;

    public int incrementSizeBy1(){
       return ++size;
    }
    public int getSize(){
        return this.size;
    }
    @Override
    public void insert(T value) {

        var newNode =new  BinaryTreeNode<T>(value);
        size++;

        if(isEmpty(root)){
            root=newNode;
            return;
        }
        BinaryTreeNode<T> current= root;

        while(true){
            if(lessThan(value, current.data)){
                if(isEmpty(current.leftChild)){
                    current.leftChild=newNode;
                    break;
                }
                current=current.leftChild;
            }else {
                if(isEmpty(current.rightChild)){
                    current.rightChild=newNode;
                    break;
                }
                current=current.rightChild;
            }
        }
    }


    @Override
    public Optional<T> findOne(T searchValue, Consumer<T> consumer) {
        var current = root;

        while(current !=null){
            consumer.accept(current.data);
            if(lessThan(searchValue, current.data)){
                current=current.leftChild;
            } else if (greatThan(searchValue,current.data)) {
                current=current.rightChild;
            }
            else
                break;
        }
        if(current==null)
            return Optional.empty();

        return Optional.of(current.data);
    }


    public void  traversePreOrder( ){
       traversePreOrder(root);
   }
    double total=0;
    private T traversePreOrder(BinaryTreeNode<T> node ){
        if(node==null)
            return null;

        var data= node.data;
        if(data instanceof Number number){
            total=total + number.doubleValue();
//            System.out.println(number.doubleValue());
        }
        else if (data instanceof INumber number){
            total=total+ number.getNumber();
//            System.out.println(number.getNumber());
        }
        traversePreOrder(node.leftChild);
        traversePreOrder(node.rightChild);

        return data;
    }

    @Override
    public double sum() {

        traversePreOrder();
//        System.out.println(total);
        return total;
    }

    @Override
    public double average() {
        return sum()/size;
    }

    @Override

    public double max() {
        AtomicReference<Double> max = new AtomicReference<>(0d);

        getAllData(root,e -> {
            double currentNumber = 0;
            if(e instanceof Number number){
                currentNumber = number.doubleValue();
            }
            else if(e instanceof INumber number){
                currentNumber = number.getNumber();
            }
            max.accumulateAndGet(currentNumber,(e1,e2)->Math.max(e1,e2));

        });
        return max.get();
    }




    @Override
    public double min() {
        AtomicReference<Double> min = new AtomicReference<>(max());

        getAllData(root,e -> {
            double currentNumber = 0;
            if(e instanceof Number number){
                currentNumber = number.doubleValue();
            }
            else if(e instanceof INumber number){
                currentNumber = number.getNumber();
            }
            min.accumulateAndGet(currentNumber,(e1,e2)->Math.min(e1,e2));

        });
        return min.get();
    }

    @Override
    public Optional<T> maxT() {

        var node= root;
        while (node.rightChild!=null){
            node=node.rightChild;
        }
        return Optional.of(node.data);
    }

    @Override
    public Optional<T> minT() {
        var node= root;
        while (node.leftChild!=null){
            node=node.leftChild;
        }
        return Optional.of(node.data);
    }
    @Override
    public T[] toArray() {
      return null;
    }

    @Override
    public int size() {
        return this.size;
    }
    public void getAllData(BinaryTreeNode<T>node, Consumer<T> c){
        if(isEmpty(node))
            return;

        c.accept(node.data);
        getAllData(node.leftChild, c);
        getAllData(node.rightChild, c);
    }


}



