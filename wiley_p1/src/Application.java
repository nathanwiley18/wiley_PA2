//import java.util.Scanner for Scanner function
import java.util.Scanner;

public class Application {
	//Scanner function
	static Scanner input = new Scanner (System.in);
	
	public static void main (String [] args) {
		
		//encryption method
		int num;
		System.out.println("Enter a 4 digit number to encrypt: ");
		//read the user input
		num = input.nextInt();
		//calls the encrypt function in Encrypter.java and formats the string
		//to print all 4 digits
		String encryptedCode = String.format("%04d", Encrypter.encrypt(num));
		System.out.printf("The encrypted code is: ");
		//prints the 4-digit result of encryptedCode
		System.out.println(encryptedCode);
		
		//decryption method
		int num2;
		System.out.println("Enter a 4 digit number to decrypt: ");
		//reads user input
		num2 = input.nextInt();
		//calls the decrypt function from Decrypter.java and formats it to 4 digits
		String decryptedCode = String.format("%04d", Decrypter.decrypt(num2));
		System.out.printf("The encrypted code is: ");
		//prints the 4 digit result of decryptedCode
		System.out.println(decryptedCode);
		
	}
}
