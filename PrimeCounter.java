package mine;

/**
 * This program was written to solve the following problem on Project Euler:
 * 
 * 10001st prime
 * Problem 7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 * 
 * @author DJ
 *
 */

public class PrimeCounter {

	public static void main(String[] args) {
		int numPrimes = 0;
		for(long i = 1L; numPrimes < 10002; i++){
			if (isPrime(i)){
				numPrimes++;
				System.out.println(i);
				if(numPrimes == 10001){
					System.out.println(i + " is the answer.");
				}
			}
		}
	}
	
	static boolean isPrime(long testNum){
		for (long i = 2L; i < testNum / 2; i++){
			if (testNum % i == 0){
				return false;
			}
		}
		return true;
	}

}
