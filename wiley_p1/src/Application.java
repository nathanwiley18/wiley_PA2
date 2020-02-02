//import java.util.Scanner for Scanner function
import java.util.Scanner;

public class Application {
	//take user input
	static Scanner input = new Scanner (System.in);
	
	public static void main (String [] args) {
		
		int num;
		System.out.println("Enter a 4 digit number to encrypt: ");
		num = input.nextInt();
		String encryptedCode = String.format("%04d", Encrypter.encrypt(num));
		System.out.printf("The encrypted code is: ");
		System.out.println(encryptedCode);
		
		int num2;
		System.out.println("Enter a 4 digit number to decrypt: ");
		num2 = input.nextInt();
		String decryptedCode = String.format("%04d", Decrypter.decrypt(num2));
		System.out.printf("The encrypted code is: ");
		System.out.println(decryptedCode);
		
	}
}
