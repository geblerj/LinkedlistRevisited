package com.james;

public class GenericNode<T> {
    GenericNode next;
    private T data;
    GenericNode(T data){
        this.data = data;
    }
    public T getData()  { return this.data; }
}
