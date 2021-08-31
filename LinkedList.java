package com.bridgelabz.datastructure;

/**
 * @author tushar.kasturi_ymedi
 *
 * @param <T> This is a generic paramet
 */

public class LinkedList<T> {

	Node<T> head;

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

	public void insertAtIndex(int index, T data) {
		Node<T> newNode = new Node<>(data);
		newNode.data = data;
		newNode.next = null;

		Node<T> temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;

	}

	/**
	 * This method is to print linkedlist Temporary node temp is used to traverse
	 */
	public void show() {

		Node<T> temp = head;

		while (temp.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
