//package edu.citytech.finance.binarysearchtree;
//
//import com.jbbwebsolutions.ds.facade.IList;
//import com.jbbwebsolutions.ds.facade.INumber;
//import edu.citytech.finance.array.DynamicArray;
//
//import java.util.Optional;
//import java.util.function.Consumer;
//import java.util.function.IntFunction;
//
//import static edu.citytech.finance.binarysearchtree.BinaryTreeNodeHelper.*;
//
//public class BinarySearchTree1<T extends Comparable<T>> implements IList<T> {
//    protected BinaryTreeNode <T> root;
//    public BinarySearchTree1() {}
//    private int size=0;
//
//    public int incrementSizeBy1(){
//       return ++size;
//    }
//    public int getSize(){
//        return this.size;
//    }
//    @Override
//    public void insert(T value) {
//
//        var newNode =new  BinaryTreeNode<T>(value);
//        size++;
//
//        if(isEmpty(root)){
//            root=newNode;
//            return;
//        }
//        BinaryTreeNode<T> current= root;
//
//        while(true){
//            if(lessThan(value, current.data)){
//                if(isEmpty(current.leftChild)){
//                    current.leftChild=newNode;
//                    break;
//                }
//                current=current.leftChild;
//            }else {
//                if(isEmpty(current.rightChild)){
//                    current.rightChild=newNode;
//                    break;
//                }
//                current=current.rightChild;
//            }
//        }
//    }
//
//
//    @Override
//    public Optional<T> findOne(T searchValue, Consumer<T> consumer) {
//        var current = root;
//
//        while(current !=null){
//            consumer.accept(current.data);
//            if(lessThan(searchValue, current.data)){
//                current=current.leftChild;
//            } else if (greatThan(searchValue,current.data)) {
//                current=current.rightChild;
//            }
//            else
//                break;
//        }
//        if(current==null)
//            return Optional.empty();
//
//        return Optional.of(current.data);
//    }
//    private void printInOrder(){
//        printInOrder(root, e ->{});
//    }
//    private void printInOrder(BinaryTreeNode<T> node,Consumer<T> consumer){
//        if(isEmpty(node))
//          return;
//        printInOrder(node.leftChild, consumer);
//        printInOrder(node.rightChild,consumer);
//    }
//
//    double total=0;
//
//
//    @Override
//    public double sum() {
//
//        printInOrder();
//        return total;
//    }
//
//    @Override
//    public double average() {
//        return sum()/size;
//    }
//
//    @Override
//    public double max() {
//
//        var node= root;
//        double maxValue = 0;
//
//        while (node!=null){
//
//            if(node.data instanceof Number number)
//                maxValue= number.doubleValue();
//            if(node.data instanceof INumber number)
//                maxValue= number.getNumber();
//
//            node=node.rightChild;
//        }
//        return maxValue;
//    }
//
//
//
//    @Override
//    public double min() {
//
//        var node= root;
//        double minValue = 0;
//
//        while (node!=null){
//
//            if(node.data instanceof Number number)
//                minValue= number.doubleValue();
//            if(node.data instanceof INumber number)
//                minValue= number.getNumber();
//
//            node=node.leftChild;
//        }
//        return minValue;
//    }
//    @Override
//    public T[] toArray(IntFunction<T[]> intFunction) {
//        DynamicArray<T> da= new DynamicArray<T>(intFunction);
//        printInOrder(root, da::insert);
//        return da.toArray();
//    }
//
//    @Override
//    public T[] toArray() {
//        return null;
//    }
//
//    @Override
//    public int size() {
//        return this.size;
//    }
//
//}
//
//
