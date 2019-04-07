package com.lyj.sort.selectsort;

/*
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。*/
public class SelectionSort {

	public static void selectionSort(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i+1; j < array.length; j++) {
				if(array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			swap(array, minIndex, i);
		}
	}
	
	public static void swap(int[] array,int indexOne,int indexTwo) {
		
		int temp = array[indexOne];
		array[indexOne] = array[indexTwo];
		array[indexTwo] = temp;
		return ;
	}
	
	public static void listArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ,");
		}
	}
	
	public static void main(String[] args) {
		int[] array = {4,8,9,4,8,1,1,5,3,1};
		selectionSort(array);
		listArray(array);
		
	}
}
