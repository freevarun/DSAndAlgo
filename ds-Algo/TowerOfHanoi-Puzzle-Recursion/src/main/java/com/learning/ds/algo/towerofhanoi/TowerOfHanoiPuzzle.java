/**
 * 
 */
package com.learning.ds.algo.towerofhanoi;

/**
 * @author freevarun
 *
 */
public class TowerOfHanoiPuzzle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Number Of Disks
		int n = 6;
		String source = "S";
		String destination = "D";
		String helper = "H";
		
		TowerOfHanoiPuzzle towerOfHanoiPuzzle = new TowerOfHanoiPuzzle();
		
		towerOfHanoiPuzzle.towerOfHanoiRecurssion(n, source, destination, helper);

	}
	
	public void towerOfHanoiRecurssion(int n,String source,String destination, String helper) {
		
		if(n == 1) {
			System.out.println("Moving Disk 1 from: "+source+" to: "+destination);
			return;
		}
		
		towerOfHanoiRecurssion(n-1, source, helper,destination);
		System.out.println("Moving Disk "+n+" from: "+source+" to: "+destination);
		towerOfHanoiRecurssion(n-1, helper, destination,source);
		
	}

}
