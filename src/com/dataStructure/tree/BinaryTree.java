package com.dataStructure.tree;

public class BinaryTree {
	Node root, temp;
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.addBT(1);
		bt.addBT(2);
		bt.addBT(3);
		bt.addBT(4);
		bt.addBT(5);
		bt.addBT(6);
		bt.addBT(33);
		bt.addBT(11);
	}

	private void addBT(int data) {
		Node node = new Node(data);
		
		if(root == null) {
			root = node;
			return;
		}
		
		addBT(root, node);
	}
	
	private void addBT(Node root, Node newNode) {
		if(root.left == null) {
			root.left = newNode;
			return;
		} else if(root.right == null) {
			root.right = newNode;
			return;
		}
		if(root.left != null) {
			addBT(root.left, newNode);

		}
		if(root.right != null) {
			addBT(root.right, newNode);
			
		}
	}
	
	
	private void add(int i) {
		if(root == null) root = new Node(i);
			insert(root, i);
		
	}

	public void insert(Node node, int value) {
        if (value < node.data) { 
        	if (node.left != null) { 
        		insert(node.left, value); 
        		} else {
        			System.out.println(" Inserted " + value + " to left of " + node.data); 
        			node.left = new Node(value); 
        			} } else if (value > node.data) {
          if (node.right != null) {
            insert(node.right, value);
          } else {
            System.out.println("  Inserted " + value + " to right of "
                + node.data);
            node.right = new Node(value);
          }
        }
      }
     public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
     }
	}

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}