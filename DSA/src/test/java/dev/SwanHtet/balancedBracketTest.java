package dev.SwanHtet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class balancedBracketTest {

	@Test
	public void balancedBracket(){
		assertTrue(BalanceBracket.balancedBracket("()"));
		assertTrue(BalanceBracket.balancedBracket("{}"));
		assertTrue(BalanceBracket.balancedBracket("{()}"));
	}

	@Test
	public void unBalancedBracket(){
		assertFalse(BalanceBracket.balancedBracket("{)"));
	}
}
