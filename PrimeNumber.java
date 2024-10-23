package JavaRound01;

import java.util.Scanner; // User input 

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check prime number : ");
		int number = scanner.nextInt();
		scanner.close();
		
		if (isPrime(number)) {
			System.out.println(number + " Is a Prime Number." );
		} else {
			System.out.println(number + " Not a prime number.");
		}
		
	}

	//isPrime function : 
	
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		
		for (int i=2; i < num ; i++) {
			if(num%i==0) {
				return false; //if is divisible by another number 
			}
		}
		return true; //if not divisible by any other number 
	}
	
}

