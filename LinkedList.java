package com.bridgelabz.datastructure;

/**
 * @author tushar.kasturi_ymedi
 *
 * @param <T> This is a generic paramet
 */

public class LinkedList<T> {

	public Node<T> head;
	int key = 0;
	int size = 0;

	/**
	 * This method is the insert method newNode is created Temporary node temp is
	 * used to traverse
	 */
	public void insert(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.data = data;
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	// This method is to add at the start
	public void insertAtStart(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.data = data;
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else {
			Node<T> temp = head;
			head = newNode;
			newNode.next = temp;
		}

	}

	// This method is to add at any index
	public void insertAtIndex(int index, T data) {
		Node<T> newNode = new Node<>(data);
		newNode.data = data;
		newNode.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node<T> temp = head;
			for (int i = 0; i < index - 1; i++) {

				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	/**
	 * This method is to print linkedlist Temporary node temp is used to traverse
	 */
	public void show() {

		Node<T> temp = head;

		if (head == null) {
			System.out.println("Empty");
		} else {
			while (temp.next != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	// This method is to delete first element
	public void pop() {
		head = head.next;
	}

	// This method is to pop last element
	public void popLast() {
		int index = 0;
		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next;
			index++;
		}
		deleteAt(index);
	}

	// This method is to delete elements at any index
	public void deleteAt(int index) {
		if (index == 0) {
			pop();
		} else {
			Node<T> temp = head;
			Node<T> temp1 = null;
			for (int i = 0; i < index - 1; i++) {

				temp = temp.next;
			}
			temp1 = temp.next;
			temp.next = temp1.next;

		}
	}

	// This method searches for the element and stores its index in key variable;
	public boolean search(T searchKey) {
		key = 0;
		if (head == null) {
			return false;
		}
		if (head.data == searchKey) {
			System.out.println("Element found at Node " + key);
			return true;
		}
		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next;
			key++;
			if (temp.data == searchKey) {
				System.out.println("Element found at Node " + key);
				return true;
			}
		}
		System.out.println("Element not found ");
		return false;

	}

	// This method returns the size of the linked list
	public int size() {
		size = 0;
		if (head == null) {
			System.out.println(size);
			return size;
		}
		Node<T> temp = head;

		while (temp.next != null) {
			temp = temp.next;
			size++;
		}
		size++;
		System.out.println("Size is " + size);
		return size;
	}
}
