package com.learning.ds.algo.sortedarray.check;

public class SortedArrayCheckUsingRecursion {

	public static void main(String[] args) {
		SortedArrayCheckUsingRecursion sortedArrayCheckUsingRecursion = new  SortedArrayCheckUsingRecursion();
		int arrayLength = 5;
		int[] array = new int[arrayLength];
		for(int i = 0 ; i < arrayLength ; i++)
			array[i] = i;
		int result = sortedArrayCheckUsingRecursion.sortedArrayCheck(array, arrayLength);
		System.out.println("Array is sorted if resutl = 1 and not a sorted array if result = 0 -> result is "+result);
	}
	
	int sortedArrayCheck(int array[],int n) {
		if(n==1)
			return 1;
		int result = array[n-1]< array[n-2]?0:sortedArrayCheck(array, n-1);
		return result;
	}

}
