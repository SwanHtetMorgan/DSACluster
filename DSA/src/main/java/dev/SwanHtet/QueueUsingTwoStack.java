package dev.SwanHtet;

import java.util.Arrays;
import java.util.Stack;

public class QueueUsingTwoStack {
	public static final Stack<Integer> stackOne = new Stack<>();
	public static final Stack<Integer> stackTwo = new Stack<>();

	public static    void enqueue(int value) {
		stackOne.push(value);
	}

	public static void dequeue(){
		if(stackOne.isEmpty()){
			System.out.println("Stack is empty");
		}

		if(stackTwo.isEmpty()){
			stackTwo.push(stackOne.getFirst());
		}
	}

	public static void main(String[] args) {
		enqueue(10);
		enqueue(12);
		dequeue();
		System.out.println(Arrays.toString(stackTwo.toArray()));
	}
}
