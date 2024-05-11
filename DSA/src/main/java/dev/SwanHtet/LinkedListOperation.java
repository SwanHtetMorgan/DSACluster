package dev.SwanHtet;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class LinkedListOperation {

	private static Node head;

	public static void insertionBeginning(int value) {

		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

	public static void insertionAfter(Node prevNode, int value) {

		if (prevNode == null) {
			System.out.println(STR."\{prevNode.toString()} must not null");
		}
		Node newNode = new Node(value);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

	public static void traverse() {

		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(STR."\{currentNode.value} -> ");
			currentNode = currentNode.next;
		}
		System.out.println("\n");
	}

	/**
	 * Insertion at the end;
	 * <p>
	 * Condition One: if the LinkedList is empty; Create Head and set the data
	 * Condition Two: id the linkedList is full; creat temporary not and traverse until it reach the null
	 */
	public static void insertAtTheEnd(int value) {

		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	/**
	 * @param position to find the position of delete Node
	 */
	public static void deleteNode(int position) {

		if (head == null) {
			System.out.println("Empty List");
		}
		if (head.value == position) {
			head = head.next;
			return;
		}
		Node prev = null;
		Node current = head;
		while (current != null && current.value != position) {
			prev = current;
			current = current.next;
		}

		if (current == null) {
			System.out.println(STR."\{position} cannot be found");
		}

		prev.next = current.next;
	}

	public static Node reverseLinkedList(Node node) {

		Node prev = null;
		Node current = node;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	public static void main(String[] args) {

		insertAtTheEnd(112);
		insertionBeginning(10);
		insertionAfter(head, 12);
		insertAtTheEnd(1222);
		insertionAfter(head.next.next, 1233);
		traverse();
		head = reverseLinkedList(head);
		traverse();
	}


	static class Node {

		private final int value;
		private Node next;

		public Node(int value) {

			this.value = value;
			this.next = null;
		}

		@Override
		public String toString() {

			return STR."Node{value=\{value}, next=\{next}\{'}'}";
		}

	}

}