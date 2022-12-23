package edu.citytech.finance.array;

 class Node <T extends Comparable<T>>{
    T data;
    Node<T> previous;
    Node<T> next;
    Node(T data){
        this.data=data;

    }

    @Override
    public String toString() {
        return "Node{" +
               // " previous=" + previous +
                "data=" + data +
             //   ", next=" + next +
                '}';
    }
}
