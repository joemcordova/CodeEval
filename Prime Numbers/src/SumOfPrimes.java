
public class SumOfPrimes {
	
	public static void main(String[] args) {
		// Description: Write a program to determine the sum of the 
		// first 1000 prime numbers.
		
		int range = 1000;
		int sum = 0;
		int count = 0;
		int i = 2;
		while (count < range) {
		    if (IsPrime(i)) {
		        sum = sum + i;
		        count++;
		    }
		    i++;
		}
		
		System.out.println(sum);
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
}
