import java.util.Scanner;

public class PrimeNumberRecursionIteration {
	
	// asal sayı nedir ? iterative , recursive
	
	public static Integer takeNumber() {
		Scanner klavyeScanner = new Scanner(System.in);
		System.out.println("Lutfen asalligi sorgulanacak  sayiyi giriniz");
		int number = klavyeScanner.nextInt();
		return number;
	}
	
	// Iterative method
	public static void iterationCheckIsPrime(int number) {
		
		boolean isPrime = true;
		
		if (number <= 1) {
			System.out.println("Girdiginiz sayi asal değildir");
			
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Girilen sayi asaldir");
		} else {
			System.out.println("Girdiginiz sayi asal değildir");
		}
	}
	
	// Recursive method
	public static int RecursiveCheckIsPrime(int number,int count) {
		
		if (number <= 1 ) {
			return 0;
			
		}else if (count == number){
			return 1;
		}
		else if (number % count == 0  ) {
			return 0;
			
		}else {
			return RecursiveCheckIsPrime( number, count+1);
		}
	}
	
	public static void continueRecursive() {
		int isPrime = RecursiveCheckIsPrime(takeNumber(),2);
		
		if (isPrime == 1) {
			System.out.println("Girilen sayi asaldir");
		} else if (isPrime == 0) {
			System.out.println("Girdiginiz sayi asal değildir");
		} {
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(;;) {
			continueRecursive();
		}
		
		
	}
	
}
