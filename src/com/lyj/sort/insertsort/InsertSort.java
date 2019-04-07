package com.lyj.sort.insertsort;

/*插入排序（以从小到大为例）：从index为1的元素开始（即数组里的第二个元素），依次向前判断，若该元素比前一个元素小，则将该元素与前一个元素交换位置，说明该元素已经处在了正确的位置（比前者大后者小），接着是从index为2的元素开始，以此类推*/
public class InsertSort {

	private static void insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if(array[j] < array[j-1]) {
					//如果array[j]比array[j-1]小，说明array[j]应该向前移动
					swap(array, j, j-1);
				}else {
				    //若array[j]比array[j-1]大说明array[j]已经在正确的位置，可以提前结束这次大循环
					break;
				}
			}
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
		insertSort(array);
		listArray(array);
	}
	
}
