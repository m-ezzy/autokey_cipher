public class Cipher {
	public static String main(String[] args) {
		char[][] plainText = new char[100][100];
		char[][] key = new char[100][100];
		char[][] cipherText = new char[100][100];

		plainText[0] = args[0].toCharArray();
		char[] keyword = args[1].toCharArray();
		int num = Integer.parseInt(args[2]);
		int length = plainText[0].length;

		System.out.println(args[0].toCharArray());
		System.out.println(args[0] + args[1] + args[2]);
		System.out.println(plainText[0]);
		System.out.println(keyword);
		System.out.println(plainText[0].toString() + keyword.toString() + num + length);

		for(int i = 0 ; i < num ; i++) {
			System.out.println("====================");

			for(int j = 0 ; j < length ; j++) {
				System.out.println(plainText[i]);
				System.out.println(key[i]);
				System.out.println(cipherText[i]);
	
				if(j < keyword.length) {
					key[i][j] = keyword[j];
				} else {
					key[i][j] = plainText[i][j - keyword.length];
				}

				// System.out.println(plainText[i][j] + key[i][j] + cipherText[i].toString());
				cipherText[i][j] = (char)( (int)plainText[i][j] + (int)key[i][j] );

				System.out.println(plainText[i]);
				System.out.println(key[i]);
				System.out.println(cipherText[i]);
				System.out.println(cipherText[i][j]);
				System.out.println((int)cipherText[i][j]);
			}
			plainText[i + 1] = cipherText[i];
		}
		System.out.println(cipherText[0]);
		System.out.println(cipherText[1]);
		System.out.println(cipherText[2]);
		System.out.println(cipherText.length);
		System.out.println(cipherText[num - 1]);
		return cipherText[num - 1].toString();
	}
}
