package com.ds.linkedlist;

public class Test {

	public static void main(String[] args) {
		
	MyLinkedList myList = new MyLinkedList();
			myList.display();
			myList.deleteNode(4);

			for (int i = 1; i < 8; i++) {
				myList.add(i);
			}
			
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
			myList.addNodeAt(0, 3333);
			myList.display();
			System.out.println("size-"+myList.size);
			System.out.println("Head==="+myList.headNode.getNodeValue());
			System.out.println("Tail==="+myList.tailNode.getNodeValue());
			myList.deleteFrontNode();
			myList.display();
			System.out.println("size-"+myList.size);
			System.out.println("Head==="+myList.headNode.getNodeValue());
			System.out.println("Tail==="+myList.tailNode.getNodeValue());
			myList.deleteTailNode();
			myList.display();
			System.out.println("size-"+myList.size);
			System.out.println("Head==="+myList.headNode.getNodeValue());
			System.out.println("Tail==="+myList.tailNode.getNodeValue());
			myList.deleteNodeAt(4);
			myList.display();
			System.out.println("size-"+myList.size);
			System.out.println("Head==="+myList.headNode.getNodeValue());
			System.out.println("Tail==="+myList.tailNode.getNodeValue());
			myList.deleteNode(3333);
			myList.display();
			System.out.println("size-"+myList.size);
			System.out.println("Head==="+myList.headNode.getNodeValue());
			System.out.println("Tail==="+myList.tailNode.getNodeValue());
			myList.clearList();
			myList.display();
			System.out.println("size-"+myList.size);
//			System.out.println("Head==="+myList.headNode.getNodeValue());
//			System.out.println("Tail==="+myList.tailNode.getNodeValue());
	
	
	}
}
