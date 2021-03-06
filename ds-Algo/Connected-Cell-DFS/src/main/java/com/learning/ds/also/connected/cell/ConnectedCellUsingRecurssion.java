package com.learning.ds.also.connected.cell;

public class ConnectedCellUsingRecurssion {

	public static void main(String[] args) {
		ConnectedCellUsingRecurssion connectedCellUsingRecurssion = new ConnectedCellUsingRecurssion();
		
		int[][] matrix = {	{0,0,0,1,1,0,0},
							{0,1,0,0,1,1,0},
							{1,1,0,1,0,0,1},
							{0,0,0,0,0,1,0},
							{1,1,0,0,0,0,0},
							{0,0,0,1,0,0,0}};
		int connectedCellCount = connectedCellUsingRecurssion.getBiggestRegion(matrix);
		System.out.println("connectedCellCount : "+connectedCellCount);
		
	}
	
	int getBiggestRegion(int[][] matrix) {
		int maxRegion = 0;
		
		for(int row = 0 ; row < matrix.length ; row ++) {
			for(int column = 0 ; column < matrix[row].length ; column ++) {
				if(matrix[row][column]==1) {
					int size = getRegionSize(matrix,row,column);
					maxRegion = Math.max(maxRegion, size);
				}
				
			}
		}
		
		return maxRegion;
	}

	private int getRegionSize(int[][] matrix, int row, int column) {
		if(row <0||column<0||row>=matrix.length||column>=matrix[row].length)
			return 0;
		if(matrix[row][column]==0)
			return 0;
		matrix[row][column]=0;
		int size=1;
		for(int r = row-1 ; r <= row +1 ; r++) {
			for(int c = column-1 ; c <= column+1 ; c++) {
				if(r != row || c != column) {
					size +=getRegionSize(matrix, r, c);
				}
			}
		}
		return size;
	}

}
