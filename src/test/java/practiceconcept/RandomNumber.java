package practiceconcept;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random ran= new Random();
		int randomnumber = ran.nextInt();
		System.out.println(randomnumber);

	}

}
