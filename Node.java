package com.bridgelabz.datastructure;

/**
 * @author tushar.kasturi_ymedi
 *
 * @param <T> This is a generic parameter
 */

public class Node<T> {

	T data;
	Node<T> next;

	public Node(T data) {
		super();
		this.data = data;
		this.next = null;
	}
}
