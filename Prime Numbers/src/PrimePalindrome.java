
public class PrimePalindrome {

	public static void main(String[] args) {
		// Description: Write a program to determine the biggest 
		// prime palindrome under 1000.
		
		for (int i = 1000; i > 1; i--) {
			if (IsPrime(i)) {
				if (IsPalindrome(i)) {
					System.out.println(i);
					break;
				}
			}
		}
	}
	
	static boolean IsPrime(int n) {
		if (n < 2) return false;
		// 2 is a Prime Number
		if (n == 2) return true;
		// Even numbers are not prime.
		if (n%2 == 0) return false;
		// For loop over odd numbers less than square root.
		for (int i=3; i*i <= n; i+=2) {
			if (n%i == 0) {
				return false;
			}
		}
	    return true;
	}
	
	static boolean IsPalindrome(int n) {
		// For two digit and three digit numbers
	    String num = Integer.toString(n);
	    if (num.charAt(0) == num.charAt(num.length() - 1)) {
	    	return true;
	    }
	    return false;
	}
}
