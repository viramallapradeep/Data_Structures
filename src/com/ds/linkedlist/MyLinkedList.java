package com.ds.linkedlist;

public class MyLinkedList {
	
	IntNode headNode;
	
	IntNode tailNode;
	
	int size;
	
	public void add(int value) {
		
		IntNode newNode = new IntNode(value);
		
		if(headNode==null) {
			headNode=newNode;
			tailNode=headNode;
			size++;
		}else {
			
			IntNode node=headNode;
			while (node!=null && node.getNextNode()!=null) {
				node=node.getNextNode();
			}
			node.setNextNode(newNode);
			tailNode=newNode;
			size++;
		}
		
	}
	
	public void addNodeAtFront(int value) {
		IntNode newNode = new IntNode(value);
		if(headNode==null) {
			headNode=newNode;
		}else {
			newNode.setNextNode(headNode);
			headNode=newNode;
			size++;
		}
		
	}
	
	public void display() {
		IntNode node=headNode;
		
		while (node!=null && node.getNextNode()!=null) {
			System.out.println(node.getNodeValue());
			node=node.getNextNode();
		}
		if(node!=null) {
			System.out.println(node.getNodeValue());
		}else {
			System.out.println("under flow");
		}
		
	}
	
}
