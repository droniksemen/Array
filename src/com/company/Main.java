package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{10,32,12,53,22};

        Mas array = new Mas(a);

        array.conclusion(a); // вывод массива
        System.out.println();

        System.out.println("Элементов в массиве = " + array.len(a));

        array.addItems(34, a); // в конец
        array.addItemsPos(34, 2, a);// во вторую позицию
        array.delete(4, a); //удаление 4 позиции
        array.sortV(a); // возраст
        array.sortN(a); //убывание
        array.max(a);//max
        array.min(a);//min
        array.odin(2, a);//одинаковые элементы

    }
}
