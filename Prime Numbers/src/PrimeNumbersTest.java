import static org.junit.Assert.*;

import org.junit.Test;


public class PrimeNumbersTest {

	@Test
	public void testIsPrime() {
		// Tests if number is a prime number
		assertFalse(SumOfPrimes.IsPrime(1));
		assertTrue(SumOfPrimes.IsPrime(2));
		assertTrue(SumOfPrimes.IsPrime(29));
		assertFalse(SumOfPrimes.IsPrime(30));
	}
	public void testSumOfPrimes() {
		// Print sum of first 1000 prime numbers
		// answer: 3682913
		SumOfPrimes.main(null);
	}

	public void testIsPalindrome() {
		// Tests if number is a palindrome
		// Supports 2 digit and 3 digit numbers
		assertTrue(PrimePalindrome.IsPalindrome(11));
		assertFalse(PrimePalindrome.IsPalindrome(12));
		assertTrue(PrimePalindrome.IsPalindrome(121));
		assertFalse(PrimePalindrome.IsPalindrome(123));
	}
}
