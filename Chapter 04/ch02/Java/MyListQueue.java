package ch02;

import ch01.MyLinkedList;
import ch01.MyListNode;

public class MyListQueue extends MyLinkedList implements IQueue{
	
	private MyListNode front;
	private MyListNode rear;
	
	public MyListQueue() {
		front = null;
		rear = null;
	}

	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			newNode = addElement(data);
			rear.next = newNode;
			rear = newNode;
		}
		
	}

	public String deQueue() {
		if(isEmpty()) {
			System.out.println("���� ť�� ����ֽ��ϴ�.");
			return null;
		}
		
		String data = front.getData();
		
		front = front.next;
		if(front == null) {
			rear = null;
		}
		
		return data;
	}

	public void printAll() {
		MyListNode temp = front;
		while(temp != null) {
			System.out.print(temp.getData());
			if(temp.next != null)
				System.out.print(" -> ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
}
