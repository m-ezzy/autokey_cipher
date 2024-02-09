import java.lang.*;
import java.io.*;
import java.util.*; //to use Scanner class. to take input from user using object of Scanner type
import java.lang.Character;
import java.lang.String;

public class ciphering {
	public static void main(String[] args){
		
		//
		String[] plainText;
		plainText = new String[10];
		
		String[] key;
		key = new String[10];
		
		String[] cipherText;
		cipherText = new String[10];
		
		String keyword;
		
		int num; //number of times you want to cipher the autokey cipher
		int i,j;

		//
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter keyword : ");
		keyword = in.nextLine();
		
		System.out.println("enter plaintext : ");
		plainText[0] = in.nextLine();
		
		System.out.println("enter the number of times to cipher : ");
		num = in.nextInt();
		
		//sub = plainText.substring(keyword.length(),plainText.length() - keyword.length());
		//sub = plainText.substring(2,5);
		//key1 = keyword + sub;
		//key[0] = keyword + splainText.substring(0,splainText.length() - keyword.length());
		//no need for this. it can be written in for loop
		
		//System.out.println(splainText.length());
		//System.out.println(keyword.length());
		//System.out.println(key1.length());
		//System.out.println(key1);
		
		//(int)(plainText.charAt(i)) = ASCII/unicode value
		
		int no;
		String s;
		
		//
		for(i = 0 ; i <= (num-1) ; i++) {
			key[i] = keyword + plainText[i].substring(0, plainText[i].length() - keyword.length());
			
			//System.out.println(key[i]);
			
			for(j = 0 ; j < plainText[0].length() ; j++) {
				no = plainText[i].codePointAt(j) + key[i].codePointAt(j) - 65;
				//System.out.println(no);
				
				if(no >= (65 + 26)) {
					no = 65 + (no - 91);
				}
				
				//System.out.println(no);
				//System.out.println(Character.toString((char)no));
				
				if(j == 0){
					cipherText[i] = Character.toString((char)no);
				}
				else{
					cipherText[0] = cipherText[0] + Character.toString(((char)no));
					//cipherText[0].concat(Character.toString(((char)no))); //doesnt work. concat method doesnt work. + operator does
				}
				
				//cipherText[i] = cipherText[i] + (char)(plainText[i].codePointAt(j) + key[i].codePointAt(j) - 65);
				
				//System.out.println(plainText[i].codePointAt(j));
				//System.out.println(cipherText[i]);
				//System.out.println(cipherText[j]);
				//System.out.println(cipherText[i].codePointAt(j));

				/*
				if(cipherText[i].codePointAt(j) >= (65 + 26)) {
					cipherText[i] = cipherText[i] + (char)(65 + (cipherText[i].codePointAt(j) - 91));
				}
				*/
			}
			plainText[i+1] = cipherText[i];
		}
		
		System.out.println(cipherText[0].charAt(0));
		System.out.println(cipherText[0].charAt(1));
		System.out.println(cipherText[0].charAt(2));
		
		System.out.println(cipherText[0]);
		System.out.println("cipher text is : " + cipherText[0]);
	}
}
