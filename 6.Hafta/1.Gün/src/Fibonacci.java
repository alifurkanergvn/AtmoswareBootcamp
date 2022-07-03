import java.util.Scanner;

public class Fibonacci {
	
	public static int takeFibo() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Kaç sayılı fibonacci istersiniz?");
		int fibNumber = klavye.nextInt();
		return fibNumber;
	}
	
	public static void takeIterativeFibonacci(int fibNumber) {
		
		int num1 = 0;
		int num2 = 1;
		for (int i = 0; i < fibNumber; ++i) {
			
			System.out.print(num1 + " ");
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
			
		}
	}
	
	public static int takeRecursiveFibonacci(int number) {
		
		 if (number <= 0) {
	            return number;
	        }
	        else if(number==1){
	            return 1;
	        }else {
	            return takeRecursiveFibonacci(number - 1) + takeRecursiveFibonacci(number - 2);
	        }
	}
	
	public static void main(String[] args) {
		
		// takeIterativeFibonacci(takeFibo());
		int number =takeFibo();
		for (int i = 0; i < number; i++) {
            System.out.print(takeRecursiveFibonacci(i) + " ");
        }
		
	}
	
}
