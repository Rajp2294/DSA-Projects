package driver;

import service.BinarySearchTree;

public class Main {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.root = tree.newNode(50);
		tree.root.left = tree.newNode(30);
		tree.root.right = tree.newNode(60);
		tree.root.left.left = tree.newNode(10);
		tree.root.right.left = tree.newNode(55);
		
		tree.skewedTreeGeneration(tree.root);
		tree.display();
	}
}	