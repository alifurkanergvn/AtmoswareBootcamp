import java.util.Scanner;

public class PalindromWord {
	
	// Palindrom: Klavyeden okunan bir string ifadenin palindrome(tersten okununca
	// da aynı) olup olmadığını kontrol eden bilgisayar programını ?
	
	public static void takeWord() {
		Scanner klavyeScanner = new Scanner(System.in);
		System.out.println("Lutfen sorgulanacak kelimeyi giriniz");
		String word = klavyeScanner.next();
		klavyeScanner.close();
		isPalindrome(word);
		
	}
	
	public static void isPalindrome(String word) {
		String tempString = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			tempString += word.charAt(i);
		}
		if (tempString.equals(word)) {
			System.out.println("Kelimeniz palindrom'dur");
		} else {
			System.out.println("Kelimeniz palindrome DEGIL");
		}
	}
	
	public static void main(String[] args) {
		
		takeWord();
		
	}
	
}
