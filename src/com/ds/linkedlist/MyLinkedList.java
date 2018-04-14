package com.ds.linkedlist;

public class MyLinkedList {
	
	IntNode headNode;
	
	IntNode tailNode;
	
	int size;
	
	public void add(int value) {
		
		IntNode newNode = new IntNode(value);
		
		if(headNode==null) {
			System.out.println("Adding "+value+" as head..");
			headNode=newNode;
			tailNode=headNode;
			size++;
		}else {
			
			IntNode node=headNode;
			while (node!=null && node.getNextNode()!=null) {
				node=node.getNextNode();
			}
			node.setNextNode(newNode);
			System.out.println("Adding "+value+" at end");
			tailNode=newNode;
			size++;
		}
		
	}
	
	public void addNodeAtFront(int value) {
		IntNode newNode = new IntNode(value);
		if(headNode==null) {
			System.out.println("Adding "+value+" as head..");
			headNode=newNode;
			tailNode=headNode;
			size++;
		}else {
			newNode.setNextNode(headNode);
			System.out.println("Adding "+value+" at front");
			headNode=newNode;
			size++;
		}
		
	}
	
	
	public void addNodeAtEnd(int value) {
		add(value);
		
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
