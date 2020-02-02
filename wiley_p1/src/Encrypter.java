public class Encrypter {
	public static int encrypt(int num) {
		 int temp = num;
		 int digit4 = (temp + 7) % 10;
		 temp = temp / 10;
		 
		 int digit3 = (temp + 7) % 10;
		 temp = temp / 10;
		 
		 int digit2 = (temp + 7) % 10;
		 temp = temp / 10;
		 
		 int digit1 = (temp + 7) % 10;
		 int encryptedNum = (digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2);
		 return encryptedNum;
	}
}
