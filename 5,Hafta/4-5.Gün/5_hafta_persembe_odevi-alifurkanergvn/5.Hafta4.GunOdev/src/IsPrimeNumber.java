import java.util.Scanner;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		
		// girilen bir sayının asal olup olmaması kodlayan algoritma
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lutfen asallıgı kontrol edilecek sayinizi giriniz");
		int number= klavye.nextInt();
		boolean isPrime=true;
		
		if (number<=1) {
			System.out.println("Girdiginiz sayi asal değildir");
			
		}for (int i = 2; i < number; i++) {
			if (number%i==0) {
				isPrime=false;
			}
		}
		if (isPrime) {
			System.out.println("Girilen sayi asaldir");
		} else {
			System.out.println("Girdiginiz sayi asal değildir");
		}
		
	}
}
