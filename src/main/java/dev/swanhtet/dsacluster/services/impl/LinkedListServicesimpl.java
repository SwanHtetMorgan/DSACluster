package dev.swanhtet.dsacluster.services.impl;

import dev.swanhtet.dsacluster.models.Node;
import dev.swanhtet.dsacluster.services.LinkedListService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LinkedListServicesimpl implements LinkedListService {

	private Node head;

	@Override
	public void insertAtTheBeginning(int value) {

		Node newNode = new Node(value);
		newNode.setNext(head);
		head = newNode;
	}

	@Override
	public String traverse() {

		StringBuilder result = new StringBuilder();
		Node current = head;
		while (current.getNext() != null) {
			result.append(STR."\{current.getData()}");
			current = current.getNext();
		}
		return result.toString();
	}

}
