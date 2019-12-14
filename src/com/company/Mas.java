package com.company;

public class Mas {
    private int[] array;
    int len = 0;

    public Mas(int[] array){
        this.array = array;
    }

    public void conclusion(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("- весь массив");
    }
    //- функцию вывод количества элементов в массиве
    public int len(int[] array){
        len = array.length;
        return len;
    }

    //- добавление элемента в массив (в конец)
    public void addItems(int a, int[] array) {
        int[] array2 = new int[len+1];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array2[len] = a;
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("- вывод массива с добавлением в конец");
    }

    //- добавление элемента в массив (в определенную позицию)
    public void addItemsPos(int a, int pos, int[] array) {
        int[] array2 = new int[len+1];
        int position = pos-1;

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        for (int i = array2.length-1; i > position; --i) {
            array2[i] = array2[i-1];
        }
        array2[position] = a;

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("- вывод массива с элементом в определенной позиции");
    }

    //удаление
    public void delete(int pos, int[] array){
        int[] array2 = new int[len];
        int position = pos-1;
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }

        for (int i = position; i < array2.length-1; i++) {
            array2[i] = array2[i+1];
        }

        for (int i = 0; i < array2.length-1; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("- удалили 53");
    }
    //по возрастанию
    public void sortV(int[] array){
        int[] array2 = new int[len];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }

        for (int i = 0; i < array2.length-1; ++i) {
            int min = array2[i];
            int pos = i;

            for (int j = i + 1; j < array2.length; ++j) {
                if(min > array2[j]){
                    pos = j;
                    min = array2[j];
                }
            }
            int t = array2[i];
            array2[i] = array2[pos];
            array2[pos] = t;
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("- по возрастаню");
    }
    //по убыванию
    public void sortN(int[] array){
        int[] array2 = new int[len];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }

        for (int i = 0; i < array2.length-1; ++i) {
            int min = array2[i];
            int pos = i;

            for (int j = i + 1; j < array2.length; ++j) {
                if(min < array2[j]){
                    pos = j;
                    min = array2[j];
                }
            }
            int t = array2[i];
            array2[i] = array2[pos];
            array2[pos] = t;
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("- по убыванию");
    }

    // максим элемент
    public void max(int[] array){
        int[] array2 = new int[len];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] >= array2[0]){
                array2[0] = array2[i];
            }
        }
        System.out.println(array2[0] + " - максимальный");
    }
    // min элемент
    public void min(int[] array){
        int[] array2 = new int[len];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] <= array2[0]){
                array2[0] = array2[i];
            }
        }
        System.out.println(array2[0] + " - минимальный");
    }
    //одинаковые элементы
    public void odin(int od, int[] array){
        int[] array2 = new int[len];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = od;
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
