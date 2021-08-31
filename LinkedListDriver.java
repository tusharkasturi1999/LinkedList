package com.bridgelabz.datastructure;

/**
 * @author tushar.kasturi_ymedi
 * 
 */
public class LinkedListDriver {

	/**
	 * 
	 * This method is the main method Object object of LinkedList is created to
	 * insert integers
	 * 
	 */
	public static void main(String[] args) {
		LinkedList<Integer> object = new LinkedList<>();
		object.insertAtStart(70);
		object.insertAtStart(56);
		object.insertAtStart(30);

		object.show();
	}
}
