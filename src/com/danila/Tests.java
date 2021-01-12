package com.danila;

public class Tests {
    public static void addToStart() {
        MyLinkedList list = new MyLinkedList();
        list.addToStart(7);
        System.out.print(list.toString());

        list.addToStart(5);
        System.out.print(list.toString());

        list.addToStart(10);
        System.out.println(list.toString());
    }

    public static void addToEnd() {
        MyLinkedList list = new MyLinkedList();
        list.addToEnd(7);
        System.out.print(list.toString());

        list.addToEnd(5);
        System.out.print(list.toString());

        list.addToEnd(10);
        System.out.println(list.toString());
    }

    public static void addByIndex() {
        MyLinkedList list = new MyLinkedList();
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(4);
        list.addToEnd(5);
        System.out.print(list.toString());

        System.out.println("Добавляем по индексу");
        list.addByPosition(3, 3);
        System.out.println(list.toString());
    }

    public static void deleteByIndex() {
        MyLinkedList list = new MyLinkedList();
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        list.addToEnd(4);
        list.addToEnd(5);
        System.out.print(list.toString());

        System.out.println("Удаляем по индексу");
        list.deleteByPosition(3);
        System.out.println(list.toString());
    }

    public static void checkSize() {
        MyLinkedList list = new MyLinkedList();
        list.addToStart(12);
        list.addToStart(34);
        list.addToStart(56);
        System.out.print(list.toString());
        System.out.println("Размер списка: " + list.getSize());
        System.out.println();

        list.addToStart(78);
        list.addToStart(90);
        System.out.print(list.toString());
        System.out.println("Размер списка: " + list.getSize());
        System.out.println();
    }

    public static void checkIsEmpty() {
        MyLinkedList list = new MyLinkedList();

        System.out.println(list.toString());
        System.out.println("Список пустой? - " + list.isEmpty());
        System.out.println();

        list.addToStart(12);
        list.addToStart(3);
        list.addToStart(44);
        System.out.print(list.toString());
        System.out.println("Список пустой? - " + list.isEmpty());
    }
}
