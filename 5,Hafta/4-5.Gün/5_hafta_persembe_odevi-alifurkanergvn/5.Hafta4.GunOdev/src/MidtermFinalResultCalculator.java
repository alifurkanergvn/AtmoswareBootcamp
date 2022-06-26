import java.util.Scanner;

public class MidtermFinalResultCalculator {
	
	public static void main(String[] args) {
		
		// kullanıcıdan alınan vize ve final notuna göre geçme(ortalama)
		// eğer kullanıcı 0(sıfır) bir değer girerse sistemden atsın bunun haricinde sürekli
		// vize final sorsun
		// Sınav geçme AA BA BB
		// not ortalaması: ortalama<50 altında ise kaldı FF
		// not ortalaması: ortalama==50 Geçti
		// not ortalaması: 55<=x<=69 BB
		// not ortalaması: 70<=x<=84 BA
		// not ortalaması: 85<=x<=100 AA
		// Vize:40% Final:60%
		// Dikkat: Consolda virgül kullanmalısın.
		
		
		
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen vize notunuzu giriniz");
		double midterResult= klavye.nextDouble();
		
		System.out.println("Lütfen final notunuzu giriniz");
		double finalResult= klavye.nextDouble();
		
		while (midterResult!=0 && finalResult!=0) {
			
			double average= ((0.4*midterResult)+(0.6*finalResult)) ;
			
			if (average<50) {
				System.out.println("Kaldiniz");
			}else if (average ==50) {
				System.out.println("Gectiniz");
			}else if (average>=55 || average<70) {
				System.out.println("BB "+average);
			}else if (average>=70 || average<=84) {
				System.out.println("BA");
			}else if (average>=85 || average<=100) {
				System.out.println("AA");
			}else {
				System.out.println("Lütfen sayi girdiğinizden emin olun");
			}
		}
		
		
		
		
		
		
		
	}
	
}
