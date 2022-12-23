package edu.citytech.finance.binarysearchtree;
import static edu.citytech.finance.binarysearchtree.BinaryTreeNodeHelper.*;

import org.w3c.dom.Node;

public class BinaryTreeNode <T extends Comparable<T>>{
     public T data;
    BinaryTreeNode <T> leftChild, rightChild;
    int height;
    public BinaryTreeNode(T data){
        this.data=data;
    }

    @Override
    public String toString() {
        return "[height="+ height +", data=" + data +
                ", leftChild=" + isEmpty(leftChild, "* empty *") + //.data +
                ", rightChild=" + isEmpty(rightChild, "* empty * ") +
                "]";
    }

 }


