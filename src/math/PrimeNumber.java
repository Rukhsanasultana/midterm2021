package math;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		//implementation here...
		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter max number: ");

		String input = scanner.nextLine();
		int maxNumber = Integer.parseInt(input);

		System.out.println("List of Prime Numbers Between 2 and " + maxNumber);

		for (int num = 2; num <= maxNumber; num++) {
			boolean Prime = true;
			for (int i=2; i <= num/2; i++) {
				if ( num % i == 0) {
					Prime = false;
					break;
				}
			}
			if ( Prime == true ) {
				System.out.println(num);
			}
		}
	}
}
