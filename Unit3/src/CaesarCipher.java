
public class CaesarCipher {
	public static String alpha = "abcdefghijklmnopqrstuvwxyz";

	public static String Encrypt(String s, int shift) {
		s.toLowerCase();
		String newString = "";
		int alphaIndex;

		// encryption
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				newString += " ";
			} else {
				alphaIndex = alpha.indexOf(s.charAt(i));
				newString += alpha.charAt((alphaIndex + shift) % 26);
			}
		}
		return newString;
	}

	public static String Decrypt(String s, int shift) {
		s.toLowerCase();
		String newString = "";
		int alphaIndex;

		// encryption
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				newString += " ";
			} else {
				alphaIndex = alpha.indexOf(s.charAt(i));
				newString += alpha.charAt((alphaIndex - shift) % 26);
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		String s = "bacon is great";
		String encrypted = Encrypt(s, 4);
		System.out.println(encrypted);

		String decrypted = Decrypt(encrypted, 4);
		System.out.println(decrypted);

	}

}
