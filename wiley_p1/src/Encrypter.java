public class Encrypter {
	public static int encrypt(int num) {
		//make temp to temporarily store integer values and manipulate them freely
		 int temp = num;
		 //adds 7 to the 4th digit, finds the remainder, divides by 10
		 int dig4 = (temp + 7) % 10;
		 temp = temp / 10;
		//adds 7 to the 3rd digit, finds the remainder, divides by 10
		 int dig3 = (temp + 7) % 10;
		 temp = temp / 10;
		//adds 7 to the 2nd digit, finds the remainder, divides by 10
		 int dig2 = (temp + 7) % 10;
		 temp = temp / 10;
		//adds 7 to the 1st digit, finds the remainder
		 int dig1 = (temp + 7) % 10;
		 
		 //encryptedNum arranges digits, switching 1 with 3 and 2 with 4
		 int encryptedNum = (dig3 * 1000 + dig4 * 100 + dig1 * 10 + dig2);
		 //adjusted code is stored and returned as encryptedNum
		 return encryptedNum;
	}
}
