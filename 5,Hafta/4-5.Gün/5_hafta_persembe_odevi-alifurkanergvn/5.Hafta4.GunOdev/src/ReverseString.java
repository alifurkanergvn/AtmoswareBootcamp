import java.util.Scanner;

public class ReverseString {
	
			// kullanıcı tarafından girilen bir kelimeyi tersten yazdıran Algoritma ?
			// yazdığınız kelime kaç harfli ?
			// Hamit ==> timaH
			//
	
	public static void stringReverse() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelime giriniz:");
		String enterString = scanner.next();
		String reverseString = "";
		for (int i = enterString.length() - 1; i >= 0; i--) {
			reverseString += enterString.charAt(i);
		}
		System.out.println(enterString);
		System.out.println(reverseString);
		System.out.println("Kelime " + reverseString.length() + " harfli");
		
	}
	
	public static void main(String[] args) {
		stringReverse();
		
	}
	
}
