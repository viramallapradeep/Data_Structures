package com.ds.linkedlist;

public class MyLinkedList {
	
	
	IntNode headNode;
	
	IntNode tailNode;
	
	int size;
	
	
	//To add a node to list
	public void add(int value) {
		//create a new node with new value 
		IntNode newNode = new IntNode(value);
		
		//check whether head contains value or not
		if(headNode==null) {
			System.out.println("Adding "+value+" as head..");
			headNode=tailNode=newNode;
			size++;
		}else {
			tailNode.setNextNode(newNode);
			tailNode=newNode;
			System.out.println("Adding "+value+" at end");
			size++;
		}
		
	}
	
	//To add node at front of list
	public void addNodeAtFront(int value) {
		System.out.println("Adding "+value+" at front");
			IntNode newNode = new IntNode(value);
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
		if(headNode==null) {
			IntNode newNode = new IntNode(value);		
			System.out.println("Adding "+value+" as head..");
			headNode=tailNode=newNode;
			size++;
		}else if (position > size) {
			add(value);
		}else if(position==1){
			addNodeAtFront(value);
		}else if(position <= size+1) {
			IntNode node=headNode;
			for (int i=1;i <= position-1; i++) {								
				node=node.getNextNode();
			}
				IntNode newNode = new IntNode(value);
				newNode.setNextNode(node.getNextNode());
				node.setNextNode(newNode);
				size++;
		}
		
	}
	
	
	public void deleteFrontNode(){
 		if(headNode!=null){ 			
 			System.out.println("Deleting head node..........."+headNode.getNodeValue());
		headNode=headNode.getNextNode();
		size--;
 		}else{
 			return;
 		}
	}
	
	public void deleteTailNode() {
		IntNode currentNode=headNode;		
		System.out.println("Deleting Tail node..........."+tailNode.getNodeValue());
		for (int i=1;i < size-1; i++) {
			currentNode=currentNode.getNextNode();
		}
			currentNode.setNextNode(null);	
			tailNode=currentNode;
			size--;
	}
	
	
	public void deleteNodeAt(int position){		
		if(position==1){
			deleteFrontNode();
		}else if(position==size){
			deleteTailNode();
		}else{			
			IntNode node = headNode;

			for (int i = 1; i < position - 1; i++) {
				node = node.getNextNode();
			}
			if (node != null && node.getNextNode() != null) {
				System.out.println("deleting node at position " + position);
				node.setNextNode(node.getNextNode().getNextNode());
				size--;
			}
		}
	}
	
	public void deleteNode(int nodeValue){
		if (headNode!=null && headNode.getNodeValue()==nodeValue) {			
			deleteFrontNode();
		}else if (tailNode!=null && tailNode.getNodeValue()==nodeValue) {
			deleteTailNode();
		} else {
			IntNode currentNode=headNode;
			IntNode tempNode=null;
			for (int i=1;i < size; i++) {
				tempNode=currentNode;
				if(nodeValue==currentNode.getNodeValue()){
					System.out.println("Deleting  node..........."+currentNode.getNodeValue());
					if(tempNode!=null && tempNode.getNextNode()!=null){
						tempNode.setNextNode(tempNode.getNextNode().getNextNode());	
						size--;
					}
					break;
				}
				
				currentNode=currentNode.getNextNode();
			}
		}
	}
	
	
	//To display all elements in list
	public void display() {
		IntNode node = headNode;
		for (int i=1;i <= size; i++) {
			System.out.println(node.getNodeValue());
			node=node.getNextNode();
		}
	}
	
	public void clearList() {
		headNode=null;
		size=0;
		tailNode=null;
		System.out.println("list is empty now");
	}

}
