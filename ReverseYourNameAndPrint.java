package java_coding_challenge;

public class ReverseYourNameAndPrint {
	
	public static void main (String [] args) {
		
		String s = "Atiqur Rahman";
		
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
