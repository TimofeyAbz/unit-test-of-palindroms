package projects_leetcodik;

public class JUST_PalindromeString {
	
	public static boolean palindromic(String str) {
		
		double halfLength = str.length() / 2.0;
		
		for(int i = 0 ; i < halfLength ; i++) 
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) 
				return false;
				
		return true;
		
	}
}
