package com.learning.ds.algo.binary.string;

public class PossibleBinaryString {

	public static void main(String[] args) {
		PossibleBinaryString possibleBinaryString = new  PossibleBinaryString();
		int arrayLength = 5;
		int arrayPrintLength = arrayLength;
		int[] array = new int[arrayLength];
		possibleBinaryString.checkAndPrintBinarysForArraySize(array, arrayLength,arrayPrintLength);
	}
	
	void checkAndPrintBinarysForArraySize(int array[],int arrayLength,int arrayPrintLength) {
		if(arrayLength < 1) {
			printArray(array, arrayPrintLength);
		}else {
			array[arrayLength-1]=0;
			checkAndPrintBinarysForArraySize(array, arrayLength-1,arrayPrintLength);
			array[arrayLength-1]=1;
			checkAndPrintBinarysForArraySize(array, arrayLength-1,arrayPrintLength);
		}
	}
	
	void printArray(int array[],int n) {
		for(int i = 0 ; i < n ; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
