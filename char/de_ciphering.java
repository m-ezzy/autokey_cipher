import java.util.*; //to use Scanner class. to take input from user using object of Scanner type

public class de_ciphering {
	public static void main(String[] args) {
		
		//
		char[] keyword;
		keyword = new char[10];
		
		char[][] plainText;
		plainText = new char[10][10];

		char[][] key;
		key = new char[10][10];
		
		char[][] cipherText;
		cipherText = new char[10][10];
		
		int num = 1; //number of times plaintext was encrypted
		int i,j,k;
		int temp;
		
		String skeyword;
		String scipherText;
		
		//
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the keyword : ");
		skeyword = in.nextLine();
		keyword = skeyword.toCharArray();
		
		System.out.println("enter the cipher text : ");
		scipherText = in.nextLine();
		cipherText[0] = scipherText.toCharArray();
		
		System.out.println("enter the number of times plain text was encoded : ");
		num = in.nextInt();
		
		//
		for(i = 0 ; i <= (num-1) ; i++){
			for(j = 0 ; j < cipherText[0].length ; j++){
				//for(k = 0 ; k < keyword.length ; k++){
					if(j == 0 || j == 1) {
						plainText[i][j] = cipherText[i][j] - keyword[j];
					} else {
						
						plainText[i][j] = cipherText[i][j - keyword.length];
					}
				//}
			}
			
			for(j = 0 ; j < plainText[0].length ; j++){
				temp = (int)plainText[i][j] + (int)key[i][j] - 97;

				if(temp >= (97 + 26)) {
					temp = 97 + (temp - 123);
				}
				System.out.println(temp);
				
				cipherText[i][j] = (char)temp;
			}
			
			for(j = 0 ; j < plainText[0].length ; j++){
				plainText[i+1][j] = cipherText[i][j];
			}
		}
		
		System.out.println(cipherText[0]);
		System.out.println(cipherText[1]);
	}
}
