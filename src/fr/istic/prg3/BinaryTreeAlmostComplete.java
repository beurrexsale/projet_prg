/**
 * 
 */
package fr.istic.prg3;

import java.util.Objects;



/**
 * @version 1.0
 *
 */
public class BinaryTreeAlmostComplete {
	
	protected int rootValue;
	protected BinaryTreeAlmostComplete left;
	protected BinaryTreeAlmostComplete right;
	protected BinaryTreeAlmostComplete up;
	protected int nbDescendants;
	
	
	public BinaryTreeAlmostComplete(int value) {
		this(value, null);
	}
	
	
	public BinaryTreeAlmostComplete(int[] values) {
		// TODO
	}
	
	
	public BinaryTreeAlmostComplete(int value, BinaryTreeAlmostComplete parent) {
		this.rootValue = value;
		this.left = null;
		this.right = null;
		this.up = parent;
		this.updateNumberOfDescendants();
	}
	
	
	
	
	
	
	public void addValue(int value) {
		if (Objects.isNull(this.left)) {
			this.left = new BinaryTreeAlmostComplete(value, this);
			this.updateNumberOfDescendants();
		}
		else {
			if (Objects.isNull(this.right)) {
				this.right = new BinaryTreeAlmostComplete(value, this);
				this.updateNumberOfDescendants();
			}
			else {
				// both left and right exist
				int nbDescLeft = this.left.nbDescendants;
				if (getLevels(nbDescLeft) == getLevels(nbDescLeft + 1)) {
					// the lowest level of left child is not full
					this.left.addValue(value);
				}
				else {
					// the lowest level of left child is full
					int nbDescRight = this.right.nbDescendants;
					if (nbDescLeft > nbDescRight) {
						// the lowest level of left child is full, AND the lowest level of right child is not full
						this.right.addValue(value);
					}
					else {
						// both left and right child are full and have the same level
						this.left.addValue(value);
					}
				}
			}
		}
	}
	
	
	
	protected static int getLevels(int n) {
		return (int)(Math.log(n + 1) / Math.log(2));
	}
	
	
	protected BinaryTreeAlmostComplete getRightmostLowestNode() {
		// TODO
	}
	
	
	
	
	public void siftDown() {
		// TODO
	}
	
	
	public void siftUp() {
		// TODO
	}
	
	
	
	public String toString() {
		return this.toString("");
	}
	
	
	public String toString(String offset) {
		// TODO
	}
	
	
	
	protected void updateNumberOfDescendants() {
		this.nbDescendants = 0;
		if (Objects.nonNull(this.left)) {
			this.nbDescendants += 1 + this.left.nbDescendants;
		}
		if (Objects.nonNull(this.right)) {
			this.nbDescendants += 1 + this.right.nbDescendants;
		}
		if (Objects.nonNull(this.up)) {
			up.updateNumberOfDescendants();
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO
	}

}
