package projects_leetcodik;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UnitTester {
	
	@Test
	public void testMethodPalindrom() {
		
		
		assertEquals(true, Palindrom.isPalindrome(121));
		
		
		assertEquals(false, Palindrom.isPalindrome(122));
		
		
	}
	
	@Test
	public void testMethodPalindromString() {
		
		
		
		assertEquals(true, JUST_PalindromeString.palindromic("stringnirts"));
		
		assertEquals(false, JUST_PalindromeString.palindromic("integer"));
		
		assertEquals(true, JUST_PalindromeString.palindromic("privet"));
		
		
	}
	
	public static void main (String[] args) {
		
		
		UnitTester unitTester = new UnitTester();
		unitTester.testMethodPalindrom();
		unitTester.testMethodPalindromString();
		
	}
	
}
