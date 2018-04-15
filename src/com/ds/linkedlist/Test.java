package com.ds.linkedlist;

public class Test {

	public static void main(String[] args) {
		
		MyLinkedList myList = new MyLinkedList();

		for (int i = 1; i < 8; i++) {
			myList.add(i);
		}
		
		myList.display();
		myList.display1();
		System.out.println("size-"+myList.size);
		myList.display();
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
		myList.addNodeAt(3, 3333);
		myList.display();
		myList.display1();
		System.out.println("size-"+myList.size);
		System.out.println("Head==="+myList.headNode.getNodeValue());
		System.out.println("Tail==="+myList.tailNode.getNodeValue());
		
	
	}
}
