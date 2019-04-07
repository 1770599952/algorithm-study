package com.lyj.sort.insertsort;

public class InsertSort01 {
	// 插入排序优化
	private static void insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int element = array[i]; // 将这一轮要排序的元素保存起来
			int j;// j用来保存这一轮要排序的元素的正确位置
			for (j = i; j > 0; j--) {
				if (array[j - 1] > element) {
					// array[j-1]比这一轮要排序的元素大，那么将array[j-1]向后移动一个位置
					array[j] = array[j - 1];
					array[j - 1] = element;
				} else {
					// array[j-1]比这一轮要排序的元素小，那么当前位置j就是元素的正确位置
					break;
				}
			}
		}
	}

	public static void swap(int[] array, int indexOne, int indexTwo) {

		int temp = array[indexOne];
		array[indexOne] = array[indexTwo];
		array[indexTwo] = temp;
		return;
	}

	public static void listArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ,");
		}
	}

	public static void main(String[] args) {
		int[] array = { 4, 8, 9, 4, 8, 1, 1, 5, 3, 1 };
		insertSort(array);
		listArray(array);
	}
}
