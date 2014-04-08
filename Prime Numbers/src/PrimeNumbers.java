import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrimeNumbers {
	// Persist prime numbers upto 1000
	// Using seive of Eratosthenes method
	public static boolean[] primeNums = new boolean[1000];
	
	public static void fillSieve() {
		Arrays.fill(primeNums, true);
		primeNums[0] = primeNums[1] = false;
		for (int i=2; i < primeNums.length; i++) {
			if (primeNums[i]) {
				for (int j=2; i*j < primeNums.length; j++) {
					primeNums[i*j] = false;
				}
			}
		}
	}
	
	public static List<Integer> primes(int n) {
		List<Integer> primes = new ArrayList<Integer>();
		fillSieve();
		primes.add(2);
		for (int i = 3; i <= n; i+=2) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}
	
	public static void main(String[] args) throws IOException {
		// Description: Print out the prime numbers less than a 
		// given number N. For bonus points your solution should 
		// run in N*(log(N)) time or better. You may assume that 
		// N is always a positive integer.		

		List<Integer> primeNums = primes(1000);
		List<String> lines = readLines(args[0]);
		int num, pIdx;
		for (int idx = 0; idx < lines.size(); idx++) {
			num = Integer.parseInt(lines.get(idx));
			if (num < primeNums.get(0)) {
				System.out.println();
				continue;
			}
			System.out.print(primeNums.get(0));
			pIdx = 1;
			while (primeNums.get(pIdx) < num) {
				System.out.print(',');
				System.out.print(primeNums.get(pIdx));
				pIdx++;
			}
			System.out.println();
		}
	}
	
	static boolean isPrime(int n) {
		return primeNums[n];
	}
	
	static List<String> readLines(String path) throws IOException {
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		List<String> lines = new ArrayList<String>();
	    String currentLine;
	    while ((currentLine = br.readLine()) != null) {
	    	lines.add(currentLine);
	    }
	    br.close();
		return lines;
	}

}
