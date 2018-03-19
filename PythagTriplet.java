package mine;
/**
 * This program was written to solve the following problem on Project Euler:
 * Special Pythagorean Triplet
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * @author DJ
 *
 */

public class PythagTriplet {

	public static void main(String[] args) {
		
		for(int a = 0; a < 1000; a++){
			for(int b = a; b < 1000; b++){
				for(int c = b; c < 1000; c++){
					if (a + b + c == 1000 && (a * a) + (b * b) == (c * c) && a * b * c != 0)
						System.out.println("Answer: " + a * b * c);
				}
			}
		}

	}

}
