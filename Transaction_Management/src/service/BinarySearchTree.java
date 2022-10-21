package service;

public class BinarySearchTree 
{
	public Node root;

	Node prevNode = null;
	Node headNode = null;

	public class Node
	{
		public int key;
		public Node left;
		public Node right;
	}

	public Node newNode(int data) 
	{
		Node temp = new Node();

		temp.key = data;
		temp.left = null;
		temp.right = null;

		return temp;
	}

	public void skewedTreeGeneration(Node root) {
		if (root == null) 
		{
			return;
		}

		skewedTreeGeneration(root.left);

		Node rightNode = root.right;

		if (headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		skewedTreeGeneration(rightNode);
	}

	public void display() {

		if (headNode == null) 
		{
			return;
		}

		System.out.print(headNode.key + " ");
		headNode = headNode.right;
		display();
	}
}
