package com.test.list;

public class LinkedList<T> {
	
	class Node{
		T value;
		Node next;
		
		Node(T value){
			this.value = value;
		}
		
		public T getValue() {
			return value;
		}
		public void setValue(T value) {
			this.value = value;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	private Node head;
	private Node tail;
	private long size;
	
	/**
	 * Adds element to the starting of list
	 * @return
	 */
	public boolean addFirst(T newItem){
		
		try{
			
			Node previoushead = head;
			
			head = new Node(newItem);
			
			head.setNext(previoushead);
			
			
			if(tail == null){
				tail = head;
			}
		}catch(Exception e){
			System.out.println("Exception while adding element to list");
			e.printStackTrace();
			return false;
		}
		size ++;
		return true;
	}
	
	/**
	 * Adds element to the end of list
	 * @return
	 */
	public boolean addLast(T newItem){
		
		Node newNodeItem =  new Node(newItem);
		
		try{
			
			if(tail == null){
				head = newNodeItem;
				tail = head;
			}else{
				tail.setNext(newNodeItem);
				tail = tail.getNext();
				
			}
			
		}catch(Exception e){
			System.out.println("Exception while adding element to end of list");
			e.printStackTrace();
			return false;
		}
		
		size++;
		return true;
	}
	
	/**
	 * Deletes the first element in the list
	 * @return
	 */
	public boolean deleteFirst(){
		
		try{
			
			if(size == 0) throw new RuntimeException("List is empty !!");
			else{
				head = head.getNext();
				size --;
			}
			
			
		}catch(Exception e){
			System.out.println("Exception while deleting element from the starting of list");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
	/**
	 * Deletes the first element in the list
	 * @return
	 */
	public boolean deleteLast(){
		
		try{
			
			if(size == 0) throw new RuntimeException("List is empty !!");
			else{
				
				if(head == tail){
					tail = null;
					head = null;
				}else{
					Node currentNode = head;
					Node previousNode = null;
					
					while(currentNode.next != null){
						previousNode = currentNode;
						currentNode = currentNode.getNext();
					}
					
					previousNode.setNext(null);
					tail = previousNode;
					
				}
				
				size--;
				
			}
			
			
		}catch(Exception e){
			System.out.println("Exception while deleting element from the end of list");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
	/**
	 * Returns the first element in the list
	 * @return
	 */
	public T getFirst(){
		
		if(size == 0) throw new RuntimeException("List is empty !!");
		
		return head.getValue();
		
	}
	
	/**
	 * Returns the last element in the list
	 * @return
	 */
	public T getLast(){
		
		if(size == 0) throw new RuntimeException("List is empty !!");
		
		return tail.getValue();
		
	}
	
	
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		if(size == 0) return "[]";
		
		
		Node currentNode = head;
		
		while(currentNode.next != null){
			sb.append(currentNode.getValue()).append("  |  ");
			currentNode = currentNode.getNext();
		}
		
		
		sb.append(tail.getValue()).append("  |  ");
		
		
		return sb.toString();
		
	}

	public long getSize() {
		return size;
	}
	
	

}
