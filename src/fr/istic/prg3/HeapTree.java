/**
 * 
 */
package fr.istic.prg3;

import java.util.Objects;



/**
 * @version 1.0
 *
 */
public class HeapTree extends BinaryTreeAlmostComplete implements Heap {
	
	public HeapTree(int value) {
		// TODO
	}
	
	
	public HeapTree(int value, HeapTree parent) {
		// TODO
	}
	
	
	public HeapTree(int[] tab) {
		// TODO
	}
	
	
	
	public void addValue(int value) {
		// TODO
	}
	
	
	public int extractMax() {
		// TODO
	}
	
	
	public int getMax() {
		// TODO
	}
	
	
	public static int[] heapsort(int[] unsortedValues) {
		// TODO
	}
	
	
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("CONSTRUCTION");
		int[] treeValues = {109, 107, 111, 112, 103, 104, 110, 101, 106, 102, 108, 105};
		HeapTree myTree = new HeapTree(treeValues);
		System.out.println(myTree);
		System.out.println("\n");
		
		
		
	}

}
