import java.util.Scanner;

public class AwesomeNumber {
	
		// Mükemmel sayı : Mükemmel sayı,sayılar teorisinde, kendisi hariç pozitif tam
		// bölenlerinin toplamı kendisine eşit olan sayı.
		// Diğer bir ifadeyle, bir mükemmel sayı, bütün pozitif tam bölenlerinin
		// toplamının yarısına eşittir. 6=> 1 2 3 Mükemmel sayıdır.
	
	
	public static void takeNumber() {
		Scanner klavyeScanner = new Scanner(System.in);
		System.out.println("Lutfen sorgulanacak sayiyi giriniz");
		int number = klavyeScanner.nextInt();
		checkIsAwesome(number);
		klavyeScanner.close();
	}
	
	public static void checkIsAwesome(int number) {
		int divisibleNumbers = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				divisibleNumbers += i;
			}
		}
		if (divisibleNumbers == number) {
			System.out.println("Sayiniz awesome number'dir");
		} else {
			System.out.println("Sayiniz awesome number DEGILDIR.");
		}
	}
	
	public static void main(String[] args) {
		takeNumber();
		
	}
	
}
