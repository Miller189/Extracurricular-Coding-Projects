package mine;

/**
 * This program was built to simulate the Monty Hall problem.
 * On the television show "Let's Make A Deal" a contestant is
 * presented with three doors, behind one of which is a new car.
 * The contestant is asked to pick one door from the three, after 
 * which the host chooses a different door and opens it, revealing
 * that it does not have a car behind it. The contestant is then 
 * given the option to change their chosen door.  The program 
 * demonstrates that choosing to change the chosen door is more
 * likely to result in winning a car than choosing not to change
 * doors.
 * @author DJ
 *
 */

public class MontyHall {
	
	final static int REPS = 10000000;

	public static void main(String[] args) {
		int numCars = 0;
		
		for (int i = 0; i < REPS; i++){
			numCars += guessSwitch();
		}
		System.out.println("With Switch");
		System.out.println("Number of trials: " + REPS);
		System.out.println("Number of cars: " + numCars);
		
		numCars = 0;
		for (int i = 0; i < REPS; i++){
			numCars += guessNoSwitch();
		}
		System.out.println("Without Switch");
		System.out.println("Number of trials: " + REPS);
		System.out.println("Number of cars: " + numCars);

	}
	
	public static int getNum(){
		double rand = Math.random();
		int bigNum = (int) (rand * 10000);
		int smallNum = bigNum % 3;
		return smallNum + 1;
	}
	
	public static int guessSwitch(){
		int carNum, guessNum, revealNum, temp;
		carNum = getNum();
		guessNum = getNum();
		revealNum = carNum;
		while(revealNum == carNum || revealNum == guessNum){
			revealNum = getNum();
		}
		temp = guessNum;
		do{
			guessNum = getNum();
		} while(guessNum == revealNum || guessNum == temp);
		if (guessNum == carNum){
			return 1;
		}
		else{
			return 0;
		}
		
	}
	
	public static int guessNoSwitch(){
		int carNum, guessNum;
		carNum = getNum();
		guessNum = getNum();		
		if (guessNum == carNum){
			return 1;
		}
		else{
			return 0;
		}
	}

}
