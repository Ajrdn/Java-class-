package ch13;

public class CharArrayTest {

	public static void main(String[] args) {
		
		char [] alphabets = new char[26];
		
		for (int i = 0; i < 26; i++) {
			alphabets[i] = (char)(65 + i);
		}
		
		for (char alpha : alphabets) {
			System.out.print(alpha + " ");
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.println(alphabets[i]);
		}
	}

}
