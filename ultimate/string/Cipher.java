public class Cipher {
	public static String main(String[] args) {
		String[] plainText = new String[100];
		String[] key = new String[100];
		String[] cipherText = new String[100];

		plainText[0] = args[0];
		String keyword = args[1];
		int num = Integer.parseInt(args[2]);
		int length = plainText[0].length();

		for(int i = 0 ; i < num ; i++) {
			cipherText[i] = new String("");

			for(int j = 0 ; j < length ; j++) {
				if(j < keyword.length()) {
					key[i] = keyword;
				} else {
					key[i] = key[i].concat((String.valueOf(plainText[i].charAt(j - keyword.length()))));
				}
				cipherText[i] = cipherText[i].concat( String.valueOf( (char)( (int)plainText[i].charAt(j) + (int)key[i].charAt(j) ) ) );
			}
			plainText[i + 1] = cipherText[i];
		}
		System.out.println("final ciphertext : " + cipherText[num - 1]);
		return cipherText[num - 1];
	}
}
