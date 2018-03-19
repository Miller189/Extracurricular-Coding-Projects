package mine;

import java.util.ArrayList;

/**
 * This program was built to solve the following problem on Project Euler:
 * 
 * Summation of primes
 * Problem 10
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 * 
 * Answer: 142913828922
 * 
 * @author DJ
 *
 */

public class SummationOfPrimes {

	public static void main(String[] args) {
		long sum = 0L;
		int temp = 0;
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		primeList.add(2);
		for(int i = 2; i < 2000000; i++){
			if (isPrime(i, primeList)){
				primeList.add(i);
				System.out.println(i);
			}
		}
		temp = primeList.size();
		for(int j = 0; j < temp; j++){
			sum += primeList.get(j);
		}
		System.out.println("Answer: " + (sum - 2));	// It's not pretty but it works
	}
	
	// Tests the given int against each int in the arraylist to
	// determine whether the int is prime.
	static boolean isPrime(int testNum, ArrayList<Integer> primeList){
		for (int i = 1; i < primeList.size(); i++){			
			if (testNum % primeList.get(i) == 0){
				return false;
			}
		}
		return true;
	}

}
