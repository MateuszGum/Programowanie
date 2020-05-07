package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testyTest {

	@org.junit.jupiter.api.Test
	public void Test1() {
		boolean expected = false;
		programy test = new programy();
		assertEquals(expected, test.temp(200, 101));
	}

	@org.junit.jupiter.api.Test
	public void Test2(int[] tab) {
		Boolean expected = true;
		programy test = new programy();
		assertEquals(expected, test.sek123(tab, tab.length));
	}

	@org.junit.jupiter.api.Test
	public void Test3() {
		String expected = "qwe";
		programy test = new programy();
		assertEquals(expected, test.polowa("qwerty"));
	}

	@org.junit.jupiter.api.Test
	public void Test4() {
		programy test = new programy();
		int[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] expected = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		assertArrayEquals(expected, test.odwrot(tab));
	}

}
