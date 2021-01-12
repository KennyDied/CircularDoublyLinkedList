package com.danila;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Добавление в начало:");
        Tests.addToStart();

        System.out.println("2. Добавление в конец:");
        Tests.addToEnd();

        System.out.println("3. Вставка по индексу:");
        Tests.addByIndex();

        System.out.println("4. Удаление по индексу:");
        Tests.deleteByIndex();

        System.out.println("5. Узнать размер:");
        Tests.checkSize();

        System.out.println("6. Проверка на наличие элементов:");
        Tests.checkIsEmpty();
    }
}