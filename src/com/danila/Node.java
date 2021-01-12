package com.danila;

public class Node {
    private int data;
    private Node next, prev;

    public Node() {
        next = null;
        prev = null;
        data = 0;
    }

    public Node(int d, Node n, Node p) {
        data = d;
        next = n;
        prev = p;
    }

    public void setData(int d) {
        data = d;
    }

    public void setNext(Node n) {
        next = n;
    }

    public void setPrev(Node p) {
        prev = p;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }
}
