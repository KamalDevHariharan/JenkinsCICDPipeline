package com.kamal.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void whenEmptyString_thenAccept() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome("madam"));
	}

	@Test
	public void incorrectPalindrome() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome("Hi"));
	}
}