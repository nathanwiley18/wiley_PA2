public class Decrypter {
	public static int decrypt(int num2) {
		int temp = num2;
		 int digit3 = (temp - 7) % 10;
		 temp = temp / 10;
		 
		 int digit4 = (temp - 7) % 10;
		 temp = temp / 10;
		 
		 int digit1 = (temp - 7) % 10;
		 temp = temp / 10; 
		 
		 int digit2 = (temp - 7) % 10;
		 int encryptedNum = (digit4 * 1000 + digit3 * 100 + digit2 * 10 + digit1);
		 return encryptedNum;
	}
}
