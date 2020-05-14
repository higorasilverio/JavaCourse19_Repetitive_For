package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		int cont_in = 0, cont_out = 0;
		System.out.print("How many numbers we will verify? ");
		int quantity = scanner.nextInt();
		System.out.println("Enter the numbers to verify if they are between 10 and 20: ");
		for(int i = 0; i < quantity; i++) {
			int number = scanner.nextInt();
			if (number >= 10 && number <= 20) cont_in++;
			else cont_out++;
		}
		
		System.out.println();
		System.out.printf("Number(s) in: %d\nNumber(s) out: %d\n", cont_in, cont_out);
		
		scanner.close();
		

	}

}
