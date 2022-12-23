package edu.citytech.finance.binarysearchtree;

public class BinaryTreeNodeHelper<T extends Comparable<T>>{


     public static <T  extends Comparable<T>> String isEmpty(BinaryTreeNode<T> node, String emptyMessage) {
        if(node == null){
            return emptyMessage;
        } else{
            return node.data.toString();
        }
     }

     public static <T extends Comparable<T>> boolean isEmpty(BinaryTreeNode<T> root) {
         return root==null?true:false;
     }

     public static <T extends Comparable <T>> boolean lessThan(T value, T data) {
         int status = value.compareTo(data);
         boolean bStatus = status < 0;
         return bStatus;
     }
     public static <T extends Comparable <T>> boolean greatThan(T value, T data) {
         int status = value.compareTo(data);
         boolean bStatus = status > 0;
         return bStatus;
     }
     public static <T extends Comparable <T>> boolean equal(T value, T data) {
         int status = value.compareTo(data);
         boolean bStatus = status ==0;
         return bStatus;
     }

     public static <T extends Comparable <T>> void setHeight(BinaryTreeNode<T> node){
        node.height=Math.max(height(node.leftChild),height(node.rightChild))+1;
     }
     private static <T extends Comparable <T>> int height(BinaryTreeNode<T> node){
        return (node==null ? -1 : node.height);
     }
     static <T extends Comparable <T>> int getBalanceFactor(BinaryTreeNode<T> node){
        return height(node.leftChild)-height(node.rightChild);
    }
   static   <T extends Comparable <T>> boolean isLeftHeavy(BinaryTreeNode<T> node){
        return getBalanceFactor(node)>1;
    }

    static   <T extends Comparable <T>> boolean isLeftHeavyAndAskew(BinaryTreeNode<T> node){
        return isLeftHeavy(node) && getBalanceFactor(node.leftChild)<0;
    }

    static   <T extends Comparable <T>> boolean isRightHeavyAndAskew(BinaryTreeNode<T> node){
        return isRightHeavy(node) && getBalanceFactor(node.rightChild) >0;
    }





    static   <T extends Comparable <T>> boolean isRightHeavy(BinaryTreeNode<T> node){
        return getBalanceFactor(node)< -1;
    }

    static <T extends Comparable <T>> BinaryTreeNode <T> leftRotate(BinaryTreeNode<T> node){
         var newRoot= node.rightChild;
         node.rightChild=newRoot.leftChild;
         newRoot.leftChild= node;

         setHeight(node);
         setHeight(newRoot);

         return newRoot;
    }
    static <T extends Comparable <T>> BinaryTreeNode <T>rightRotate(BinaryTreeNode<T> node){
        var newRoot= node.leftChild;
        node.leftChild = newRoot.rightChild;
        newRoot.rightChild= node;

        setHeight(node);
        setHeight(newRoot);

        return newRoot;
    }
 }
