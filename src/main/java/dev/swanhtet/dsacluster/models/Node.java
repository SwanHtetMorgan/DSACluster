package dev.swanhtet.dsacluster.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {

	private int data;
	private Node next;

	public Node(int data) {

		this.data = data;
		this.next = null;
	}

}
