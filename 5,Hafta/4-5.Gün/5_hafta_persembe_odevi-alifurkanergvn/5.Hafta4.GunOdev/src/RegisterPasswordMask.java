import java.util.Scanner;

public class RegisterPasswordMask {
	
			// kullanıcı tarafından girilen bir parola için ilk ve son harfi haricinde *
			// eklensin ?
			// Hamit ==> H****t
	
	public static void PasswordMask(){
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Sifre giriniz");
		String enterString = klavye.next();
		String maskString= "";
		
		
		
		for (int i = 0; i < enterString.length(); i++) {
			if(i!=0 && i != enterString.length()-1)
				maskString+="*";
			else 
				maskString += enterString.charAt(i);
		}

		System.out.println("Sifre: "+enterString +"\nMaskeli "+maskString);
	}
	
	
	public static void main(String[] args) {
		PasswordMask();
		
	}
}
