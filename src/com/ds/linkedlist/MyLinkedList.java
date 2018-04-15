package com.ds.linkedlist;

public class MyLinkedList {
	
	IntNode headNode;
	
	IntNode tailNode;
	
	int size;
	
	
	//To add a node to list
	public void add(int value) {
		
		IntNode newNode = new IntNode(value);
		
		if(headNode==null) {
			System.out.println("Adding "+value+" as head..");
			tailNode=headNode=newNode;
			size++;
		}else {
			IntNode node=headNode;
			
			for (node = headNode;(node!=null && node.getNextNode()!=null); node=node.getNextNode()) {
			}
			node.setNextNode(newNode);				
			System.out.println("Adding "+value+" at end");
			tailNode=newNode;
			size++;
		}
		
	}
	
	//To add node at front of list
	public void addNodeAtFront(int value) {
			IntNode newNode = new IntNode(value);
			System.out.println("Adding "+value+" at front");
			newNode.setNextNode(headNode);
			headNode=newNode;
			size++;
		
	}
	
	//To add node at end of list
	public void addNodeAtEnd(int value) {
		add(value);
		
	}
	
	//To add node at particular position
	public void addNodeAt(int position,int value){
		if(position==1) {
			//addNodeAtFront(value);
		}else if (position>size) {
			
		}
		IntNode newNode = new IntNode(value);
		if(headNode==null) {
			System.out.println("Adding "+value+" as head..");
			headNode=newNode;
			tailNode=headNode;
			size++;
		}else {
			IntNode node=headNode;
			int a=0;
			while (node!=null && node.getNextNode()!=null) {
				a++;
				if(a==position-1) {
					newNode.setNextNode(node.getNextNode());
					node.setNextNode(newNode);
					size++;
					break;
				}
				node=node.getNextNode();
			}
		}
		
	}
	
	
	//To display all elements in list
	public void display() {
		
		long startTime = System.currentTimeMillis();
		IntNode node = headNode;
		for (int i=0;i<size; i++) {
			node=node.getNextNode();
			//System.out.println(node.getNodeValue());
		}
	
//		if(node!=null) {
//			System.out.println(node.getNodeValue());
//		}else {
//			System.out.println("under flow");
//		}
		
		long stopTime = System.currentTimeMillis();
	      long elapsedTime = stopTime - startTime;
	      System.out.println("display time="+elapsedTime);
		
	}
	
	public void display1() {
		long startTime = System.currentTimeMillis();
		IntNode node=headNode;
		
		while (node!=null && node.getNextNode()!=null) {
			//System.out.println(node.getNodeValue());
			node=node.getNextNode();
		}
		if(node!=null) {
			System.out.println(node.getNodeValue());
		}else {
			System.out.println("under flow");
		}
		long stopTime = System.currentTimeMillis();
	      long elapsedTime = stopTime - startTime;
	      System.out.println("display1 time="+elapsedTime);
		
	}
	
}
