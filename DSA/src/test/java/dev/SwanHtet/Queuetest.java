package dev.SwanHtet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Queuetest {

	@Test
	public void testDequeue(){
		QueueUsingTwoStack.enqueue(1);
		QueueUsingTwoStack.enqueue(2);
		Assertions.assertEquals(2, QueueUsingTwoStack.stackOne.size());
	}
}
