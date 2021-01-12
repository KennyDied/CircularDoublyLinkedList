package com.danila;

public class MyLinkedList {
    protected Node head;
    protected Node tail;
    public int size;

    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void addToStart(int value) {
        Node nextNode = new Node(value, null, null);
        if (head == null) {
            nextNode.setNext(nextNode);
            nextNode.setPrev(nextNode);
            head = nextNode;
            tail = head;
        }
        else {
            nextNode.setPrev(tail);
            tail.setNext(nextNode);
            head.setPrev(nextNode);
            nextNode.setNext(head);
            head = nextNode;
        }
        size++ ;
    }

    public void addToEnd(int value) {
        Node nextNode = new Node(value, null, null);
        if (head == null) {
            nextNode.setNext(nextNode);
            nextNode.setPrev(nextNode);
            head = nextNode;
            tail = head;
        }
        else {
            nextNode.setPrev(tail);
            tail.setNext(nextNode);
            head.setPrev(nextNode);
            nextNode.setNext(head);
            tail = nextNode;
        }
        size++;
    }

    public void addByPosition(int value , int position) {
        Node nextNode = new Node(value, null, null);
        if (position == 1) {
            addToStart(value);
            return;
        }
        Node node = head;
        for (int i = 2; i <= size; i++) {
            if (i == position) {
                Node tmp = node.getNext();
                node.setNext(nextNode);
                nextNode.setPrev(node);
                nextNode.setNext(tmp);
                tmp.setPrev(nextNode);
            }
            node = node.getNext();
        }
        size++;
    }

    public void deleteByPosition(int position) {
        if (position == 1) {
            if (size == 1) {
                head = null;
                tail = null;
                size = 0;
                return;
            }
            head = head.getNext();
            head.setPrev(tail);
            tail.setNext(head);
            size--;
            return ;
        }
        if (position == size) {
            tail = tail.getPrev();
            tail.setNext(head);
            head.setPrev(tail);
            size-- ;
        }
        Node node = head.getNext();
        for (int i = 2; i <= size; i++) {
            if (i == position) {
                Node p = node.getPrev();
                Node n = node.getNext();

                p.setNext(n);
                n.setPrev(p);
                size--;
                return;
            }
            node = node.getNext();
        }
    }

    public String toString() {
        String str = "";
        str += "Список: ";
        Node ptr = head;
        if (size == 0) {
            str += "пусто";
            return str;
        }

        if (head.getNext() == head) { //1 элемент
            str += head.getData()+ " <--> " + ptr.getData()+ "\n";
            return str;
        }

        str += head.getData()+ " <--> ";
        ptr = head.getNext();
        while (ptr.getNext() != head) {
            str += ptr.getData()+ " <--> ";
            ptr = ptr.getNext();
        }
        str += ptr.getData()+ " <--> ";
        ptr = ptr.getNext();
        str += ptr.getData()+ "\n";
        return str;
    }
}