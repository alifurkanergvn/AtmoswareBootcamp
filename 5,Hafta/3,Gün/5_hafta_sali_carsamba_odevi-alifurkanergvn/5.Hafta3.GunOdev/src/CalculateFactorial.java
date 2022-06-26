import java.util.Scanner;

public class CalculateFactorial {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Faktoriyelinin alınmasını istediğiniz sayiyi giriniz");
		int number= klavye.nextInt();
		int init=1;
		for (int i = number; i > 0; i--) {
			init*=i;
		}
		System.out.println(init);
	}
	
}
