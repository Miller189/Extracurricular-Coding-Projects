package mine;

/**
 * This program was written to find the standard deviation of a set.
 * I only wrote it because the problem was too large for my TI-84.
 * @author DJ
 *
 */

public class StatsCalc {

	public static void main(String[] args) {
		float denom = 12;
		double avg = 50.53846154;
		double ans;
//		sumSales = 16131;
//		avg = ((9191 * 4.65) + (2621 * 18.15) + (1419 * 11.36) + (2900 * 6.75)) / sumSales;
		
//		System.out.println("Sum of sales: " + sumSales);
//		System.out.println("Avg sale price: " + avg);
		ans = ((Math.pow(43 - avg, 2)) + (Math.pow(45 - avg, 2)) + (Math.pow(48 - avg, 2)) +
				(Math.pow(48 - avg, 2))+ (Math.pow(50 - avg, 2)) + (Math.pow(51 - avg, 2)) +
				(Math.pow(52 - avg, 2)) + (Math.pow(52 - avg, 2)) + (Math.pow(52 - avg, 2)) +
				(Math.pow(53 - avg, 2)) + (Math.pow(54 - avg, 2)) + (Math.pow(54 - avg, 2)) +
				(Math.pow(55 - avg, 2)) / denom);
		System.out.println("Answer: " + ans);
		
	}

}
