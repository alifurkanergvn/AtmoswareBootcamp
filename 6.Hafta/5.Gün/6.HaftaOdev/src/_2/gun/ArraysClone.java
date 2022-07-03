package _2.gun;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClone {
	// NOT: birden fazla metotla yapalım
	// kullanıcıdan alınan sayı kadar dizi elemanı olsun rastgele 1-10 arasındaki bu
	// sayıları bir diziye atayalım
	// sonra bu diziyi başka bir diziye clone edelim.
	// clonelanmış bu dizi bu sayıları küçükten büyüğe doğru sıralayın
	// (Arrays.sort())
	// en küçük sayıyı ve en büyük sayıyı bulalım ? ( diziyele yapalım)
	// bu sayıların toplamını ?
	// bu sayıların ortalaması ?
	
	// bu dizideki elemanlardan tek sayılardan kaç tane ve tek sayı toplamları (tek
	// sayı dizisi)
	// bu dizideki elemanlardan çift sayılardan kaç tane ve çift sayı toplamları
	// (çift sayı dizisi)
	// dizilerde en büyük ile 25 karşılatıralım dizideki eleman 25 büyük mü
	// dizideki elemanlardan 5 sayısı var mı ? (java.util.Arrays.binarySearch())
	// dizideki tekrar eden sayıları bir dizide göstrerelim ?
	// dizideki tekrar eden sayılar yerine 1 kere tekrar sayı göstersin (tekrarsız
	// dizi elemanları)
	
	public static int[] userChoseArrayLength() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lutfen array uzunluğunu giriniz");
		int arrLenght = klavye.nextInt();
		
		int[] randomArr = new int[arrLenght];
		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = (int) Math.floor(Math.random() * 10 + 1);
		}
		return randomArr;
	}
	
	public static void cloneArray(int[] randomArr) {
		int[] originalArr = randomArr;
		
		int[] cloneArr = originalArr.clone();
		
		// clonelanmış bu dizi bu sayıları küçükten büyüğe doğru sıralayın
		Arrays.sort(cloneArr);
		
		System.out.println("Clone arrayimiz= ");
		for (int i : cloneArr) {
			System.out.print(i + " ");
		}
		
		// en küçük sayıyı ve en büyük sayıyı bulalım ? ( diziyele yapalım)
		System.out.println("\nEn kucuk sayı: " + cloneArr[0] + "En buyuk sayı: " + cloneArr[cloneArr.length - 1]);
		
	}
	
	public static void sumAndAvgAllArr(int[] randomArr) {
		int[] cloneArr = randomArr.clone();
		
		System.out.println("Clone arrayimiz= ");
		for (int i : cloneArr) {
			System.out.print(i + " ");
		}
		
		int countNumber = 0;
		for (int i = 0; i < cloneArr.length; i++) {
			countNumber += cloneArr[i];
		}
		System.out.println("\nArraylerin toplamı: " + countNumber);
		
		// bu sayıların ortalaması ?
		double AverageValue = countNumber / cloneArr.length;
		System.out.println("\nArraylerin ortalaması: " + AverageValue);
		
	}
	
	public static void oddAndEven(int[] randomArr) {
		int[] cloneArr = randomArr.clone();
		
		System.out.println("Clone arrayimiz= ");
		for (int i : cloneArr) {
			System.out.print(i + " ");
		}
		
		int evenNumbersCount = 0;
		int evenSum = 0;
		int oddNumbersCount = 0;
		int oddSum = 0;
		String evenNumbers = "";
		String oddNumbers = "";
		
		for (int i = 0; i < cloneArr.length; i++) {
			if (cloneArr[i] % 2 == 0) {
				evenSum += cloneArr[i];
				++evenNumbersCount;
				evenNumbers += cloneArr[i] + " ";
			} else {
				oddSum += cloneArr[i];
				++oddNumbersCount;
				oddNumbers += cloneArr[i] + " ";
			}
		}
		String[] evenNumbersArr = evenNumbers.split(" ");
		String[] oddNumbersArr = oddNumbers.split(" ");
		
		System.out.println("\nCift sayılar : " + Arrays.toString(evenNumbersArr));
		System.out.println("\nCift sayı toplamları: " + evenSum);
		System.out.println("\nCift sayı adeti: " + evenNumbersCount);
		
		System.out.println("\nTek sayılar : " + Arrays.toString(oddNumbersArr));
		System.out.println("\nTek sayı toplamları: " + oddSum);
		System.out.println("\nTek sayı adeti: " + oddNumbersCount);
		
	}
	
	public static void checkIsGreater(int[] randomArr) {
		int[] cloneArr = randomArr.clone();
		
		Arrays.sort(cloneArr);
		// dizilerde en büyük ile 25 karşılatıralım dizideki eleman 25 büyük mü
		if (cloneArr[cloneArr.length - 1] < 25) {
			System.out.println("Arraydeki sayılar 25 ten büyük degil");
		} else {
			System.out.println("Arraydeki sayılar 25 ten büyük ");
		}
		
	}
	
	public static void binarySearch(int[] randomArr) {
		Arrays.sort(randomArr);
		/*
		 * System.out.println("Arrayimiz= ");
		 * for (int i : randomArr) {
		 * System.out.print(i + " ");
		 * }
		 */
		
		int checkHaveFive = Arrays.binarySearch(randomArr, 5);
		if (checkHaveFive < 0) {
			System.out.println("Dizide 5 sayisi bulunamamaktadır");
		} else {
			System.out.println("Dizide 5 sayisi " + (checkHaveFive + 1) + " . siradadir");
			
		}
	}
	
	public static void isRepeatNumber(int[] randomArr) {
		
		int[] repeatNumberArr = new int[randomArr.length];
		
		System.out.println("Arrayimiz= ");
		for (int i : randomArr) {
			System.out.print(i + " ");
		}
		
		for (int i = 0; i < randomArr.length ; i++) {
			for (int j = i+1; j < randomArr.length; j++) {
				if (randomArr[i] == randomArr[i + 1]) {
					repeatNumberArr[i] = randomArr[i];
				}
			}
		}
		
		System.out.println("\nTekrar eden sayı dizisi: ");
		for (int i = 0; i < repeatNumberArr.length; i++) {
			if (repeatNumberArr[i] != 0) {
				System.out.print(repeatNumberArr[i]);
			}
		}
		
	}
	
	public static void showIsNotRepeat(int[] randomArr) {
		 	Arrays.sort(randomArr);
	        int index = 0;
	        
	        System.out.println("Arrayimiz= ");
			for (int i : randomArr) {
				System.out.print(i + " ");
			}
	        
	        randomArr[index] = randomArr[0];
	        for (int i = 0; i < randomArr.length; i++) {
	            if (randomArr[index] != randomArr[i]) {
	                index++;
	                randomArr[index] = randomArr[i];
	            }
	        }
	        System.out.println("\nTekrarsız arrayimiz: ");
	        for (int i = 0; i <= index; i++) {
	            if (randomArr[i] != 0) {
	                System.out.print(randomArr[i] + " ");
	            }
	        }
	}
	
	public static void main(String[] args) {
		// cloneArray(userChoseArrayLength());
		// sumAndAvgAllArr(userChoseArrayLength());
		
		// oddAndEven(userChoseArrayLength());
		// checkIsGreater(userChoseArrayLength());
		// binarySearch(userChoseArrayLength());
		
		//isRepeatNumber(userChoseArrayLength());
		//showIsNotRepeat(userChoseArrayLength());
		
	}
	
}
