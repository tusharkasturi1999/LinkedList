package com.bridgelabz.datastructure;

/**
 * @author tushar.kasturi_ymedi
 * 
 */
public class LinkedListDriver {

	/**
	 * This method is the main method Object object of LinkedList is created to
	 * insert integers
	 */
	public static void main(String[] args) {
		LinkedList<Integer> object = new LinkedList<>();
		object.insert(56);
		object.insert(30);
		object.insert(70);

		object.show();
	}
}
