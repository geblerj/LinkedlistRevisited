package com.james;

public class GenericLinkedList<T> {
    public GenericNode<T> head;

    public void printList() {
        GenericNode<T> node = head;
        while (node != null)
        {
            System.out.print(node.getData()+" ");
            node = node.next;
        }
    }

    public void push(T data) {
        GenericNode<T> temp = new GenericNode<T>(data);
        temp.next = head;
        head = temp;
    }
}
