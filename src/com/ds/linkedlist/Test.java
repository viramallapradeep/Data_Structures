package com.ds.linkedlist;

public class Test {

	public static void main(String[] args) {
		
		MyLinkedList myList = new MyLinkedList();
		myList.add(34);
		myList.add(35);
		myList.add(345);
		myList.add(343);
		
		
		System.out.println("Head==="+myList.headNode.getNodeValue());
		System.out.println("Tail==="+myList.tailNode.getNodeValue());
		System.out.println("size-"+myList.size);
		
		myList.addNodeAtFront(22);
		myList.display();
		System.out.println("Head==="+myList.headNode.getNodeValue());
		System.out.println("size-"+myList.size);
		System.out.println("Tail==="+myList.tailNode.getNodeValue());
		myList.addNodeAtEnd (999) ;
		myList.display();
		System.out.println("size-"+myList.size);
		System.out.println("Head==="+myList.headNode.getNodeValue());
		System.out.println("Tail==="+myList.tailNode.getNodeValue());
		
	
	}
}
