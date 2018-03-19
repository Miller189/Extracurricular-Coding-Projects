package mine;

/**
 * This program was written as a coding challenge from Reddit.
 * It prints out all the verses to the Twelve Days of Christmas song.
 * @author DJ
 *
 */

public class twelvedays {
	
	public static String enumerate(int day){
		String temp = null;
		switch (day){
			case 1: temp = "first";
			break;
			case 2: temp = "second";
			break;
			case 3: temp = "third";
			break;
			case 4: temp = "fourth";
			break;
			case 5: temp = "fifth";
			break;
			case 6: temp = "sixth";
			break;
			case 7: temp = "seventh";
			break;
			case 8: temp = "eighth";
			break;
			case 9: temp = "ninth";
			break;
			case 10: temp = "tenth";
			break;
			case 11: temp = "eleventh";
			break;
			case 12: temp = "twelfth";
			break;
		}
		return temp;
	}
	
	public static String verse(int day){
		String temp = null;
		switch (day){
			case 1: temp = "a partridge in a pear tree\n";
			break;
			case 2: temp = "Two turtle doves";
			break;
			case 3: temp = "Three french hens";
			break;
			case 4: temp = "Four calling birds";
			break;
			case 5: temp = "Five golden rings";
			break;
			case 6: temp = "Six geese a laying";
			break;
			case 7: temp = "Seven swans a swimming";
			break;
			case 8: temp = "Eight maids a milking";
			break;
			case 9: temp = "Nine ladies dancing";
			break;
			case 10: temp = "Ten lords a leaping";
			break;
			case 11: temp = "Eleven pipers piping";
			break;
			case 12: temp = "Twelve drummers drumming";
			break;
		}
		return temp;
	}

	public static void main(String[] args) {
		for(int i = 1; i < 13; i++){
			System.out.println("For the " + enumerate(i) + " day of Christmas\n"
					+ "My true love gave to me:");
			for(int j = i; j > 0; j--){
				if (j == 1 && i > 1)
					System.out.println("And " + verse(j));
				else
					System.out.println(verse(j));
			}
		}

	}

}
