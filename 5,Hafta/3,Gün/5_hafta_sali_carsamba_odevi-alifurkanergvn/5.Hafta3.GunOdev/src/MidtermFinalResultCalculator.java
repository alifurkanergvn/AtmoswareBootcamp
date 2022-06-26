import java.util.Scanner;

public class MidtermFinalResultCalculator {
	
	public static void main(String[] args) {
		
				// kullanıcıdan alınan vize ve final notuna göre geçme(ortalama)
				// not ortalaması: ortalama<50 altında ise kaldı
				// not ortalaması: ortalama==50 Geçti
				// not ortalaması: 55<=x<=70 BB
				// not ortalaması: 70<=x<=84 BA
				// not ortalaması: 84<=x<=100 AA
		
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen vize notunuzu giriniz");
		int midterResult= klavye.nextInt();
		System.out.println("Lütfen final notunuzu giriniz");
		int finalResult= klavye.nextInt();
		double average=(int) ((0.4*midterResult)+(0.6*finalResult)) ;
		
		if (average<50) {
			System.out.println("Kaldiniz");
		}else if (average ==50) {
			System.out.println("Gectiniz");
		}else if (average>=55 || average<=70) {
			System.out.println("BB");
		}else if (average>=70 || average<=84) {
			System.out.println("BA");
		}else if (average>=84 || average<=100) {
			System.out.println("AA");
		}else {
			System.out.println("Lütfen sayi girdiğinizden emin olun");
		}
		
		
	}
	
}
