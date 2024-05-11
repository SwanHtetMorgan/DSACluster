package dev.SwanHtet;

import java.util.Stack;

// A
public class BalanceBracket {
	public static boolean balancedBracket(String sentence)
	{
		Stack<Character> characters = new Stack<>();
		for(char c : sentence.toCharArray()) {
			if (c == '(')
				characters.push(')');
			else if (c == '[')
				characters.push(']');
			else if (c == '{')
				characters.push('}');
			else {
				if (characters.pop() != c) {
					return false;
				}
			}
		}
			return  characters.isEmpty();
	}
}
