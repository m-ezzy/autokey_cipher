public class Decipher {
	public static String main(String[] args) {
		char[][] plainText = new char[100][100];
		char[][] key = new char[100][100];
		char[][] cipherText = new char[100][100];

		cipherText[0] = args[0].toCharArray();
		char[] keyword = args[1].toCharArray();
		int num = Integer.parseInt(args[2]);
		int length = cipherText[0].length;

		// key[0] = keyword;

		for(int i = 0 ; i < num ; i++){
			for(int j = 0 ; j < length ; j++){
				// System.out.println(plainText[0]);
				// System.out.println(cipherText[0]);

				if(j < keyword.length) {
					key[i][j] = keyword[j];
				} else {
					// System.out.println(j);
					// System.out.println(plainText[i][j - keyword.length]);
					// System.out.println(key[i][j]);

					key[i][j] = plainText[i][j - keyword.length];
				}
				plainText[i][j] = (char)( (int)cipherText[i][j] - (int)key[i][j] );
			}
			// key[i + 1] = keyword;
			cipherText[i + 1] = plainText[i];
		}
		System.out.println(plainText.length);
		System.out.println(plainText[num - 1]);
		return plainText[num - 1].toString();
	}
}
