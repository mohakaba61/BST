package edu.citytech.finance.binarysearchtree;
import static edu.citytech.finance.binarysearchtree.BinaryTreeNodeHelper.*;
public class AVLTree <T extends Comparable<T>>extends BinarySearchTree<T>{

    private int height=0;
    @Override
    public void insert ( T value) {
        super.incrementSizeBy1();
        super.root= insert(super.root, value);
        height=super.root.height;
    }

    @Override
    public int height() {
        return this.height;
    }

    private BinaryTreeNode<T> insert(BinaryTreeNode<T> node, T value){

        if(isEmpty(node))
            return new BinaryTreeNode<T>(value);
        if(lessThan(value,node.data))
            node.leftChild=insert(node.leftChild,value);
        else if (greatThan(value,node.data))
            node.rightChild=insert(node.rightChild,value);

        setHeight(node);

        if(isLeftHeavyAndAskew(node)){
            node.leftChild=leftRotate((node.leftChild));
            node= rightRotate(node);
        }
        else if(isRightHeavyAndAskew(node)){
            node.rightChild=rightRotate(node.rightChild);
            node=leftRotate(node);
        }
        else if (isLeftHeavy(node))
            node = rightRotate(node);
       else if(isRightHeavy(node))
           node = leftRotate(node);

        return node;
    }

    @Override
    public String toString(){
        return "AVLTree [height=" + height + ", size()=" + size() + "]";
    }


}


