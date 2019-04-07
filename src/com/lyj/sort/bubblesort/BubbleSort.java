package com.lyj.sort.bubblesort;

public class BubbleSort {

    public static void bybbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }
    }

    //交换数组中两个元素的位置
    private static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    public static void listArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ,");
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 8, 9, 4, 8, 1, 1, 5, 3, 1};
        bybbleSort(array);
        listArray(array);
    }
}
