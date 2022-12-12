package package01;

import java.util.Random;

public class Make {
	private String password = "";

	public String getGenerator(int len) {
		String[] ASCII = { "!", "(", ")", "&", "/", "]", "[", ";", "*", "+", "=", "%", "$", "1", "2", "3", "4", "5",
				"6", "7", "8", "9", "0", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
				"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		int ASCIIlen = ASCII.length;
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		for (int i = 0; i < len; i++) {
			int rand = random.nextInt(ASCIIlen);
			password = password + ASCII[rand];
		}
		return password;
	}

}
