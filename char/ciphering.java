//import java.lang.*;
//import java.lang.Character;
import java.io.*;
//import java.io.BufferedInputStream;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*; //to use Scanner class. to take input from user using object of Scanner type

public class ciphering {
	public static void main(String[] args) throws IOException {
		// you could also take runtime arguments for plain_text, key_word and number

		// char[][] cipherText;
		// cipherText = new char[100][100];

		char[] key_word = new char[50];
		char[][] plain_text = new char[100][100];
		char[][] key = new char[100][100];
		char[][] cipher_text = new char[100][100];

		// number of times you want to run the cipher algorithm of autokey cipher
		int num = 1;

		int i,j;
		int temp;
		
		//
		//Scanner in = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the keyword : ");
		key_word = in.readLine().toCharArray();
		
		System.out.println("enter the plaintext : ");
		plain_text[0] = in.readLine().toCharArray();
		
		//splainText = in.nextLine();
		//plain_text[0] = splainText.toCharArray();

		System.out.println("enter the number of times to encode : ");
		num = Integer.parseInt(in.readLine());

		System.out.println(String.valueOf(num));
		System.out.println(String.valueOf(plain_text[0].length));

		//
		for(i = 0 ; i < num ; i++) {
			for(j = 0 ; j < plain_text[0].length ; j++) {
				if(j < key_word.length) {
					key[i][j] = key_word[j];
				}
				else {
					key[i][j] = plain_text[i][j - key_word.length];
				}
			}

			for(j = 0 ; j < plain_text[0].length ; j++) {
				System.out.println(plain_text[i][j] + " " + (int)plain_text[i][j] + " " + key[i][j] + " " + (int)key[i][j]);

				temp = (int)plain_text[i][j] + (int)key[i][j] - 97;

				System.out.println("temp : " + String.valueOf(temp) + " temp in char : " + (char)temp);

				if(temp >= (97 + 26)) {
					temp = 97 + (temp - 123);
				}
				System.out.println((char)temp);
				
				cipher_text[i][j] = (char)temp;
			}
			/*
			for(j = 0 ; j < plain_text[0].length ; j++) {
				plain_text[i+1][j] = cipher_text[i][j];
			}*/
			plain_text[i+1] = cipher_text[i];
		}

		System.out.println(cipher_text[0]);
		System.out.println(cipher_text[1]);
		System.out.println("final : " + cipher_text[cipher_text.length - 1].toString());
	}
}
