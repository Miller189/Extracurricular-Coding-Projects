package mine;

/**
 * This program was written to solve the following problem on Project Euler:
 * 
 * Largest prime factor
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 * @author DJ
 *
 */

public class PrimeFactor {	
	final static long num = 600851475143L;
	public static void main(String[] args) {		
		long largestPrimeFactor = 0;		
		for (long i = 2L; i < (num / 2); i++){
			if (num % i == 0){
				if (isPrime(i)){
					largestPrimeFactor = i;
					System.out.println(i);
				}
			}
		}		
		System.out.println(largestPrimeFactor);
	}
	
	static boolean isPrime(long testNum){
		for (long i = 2L; i < testNum/2; i++){
			if (testNum % i == 0){
				return false;
			}
		}
		return true;
	}

}
