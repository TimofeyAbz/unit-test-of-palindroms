package projects_leetcodik;



public class Palindrom {
	
	public static boolean isPalindrome(int x) {
        
		String strX = Integer.toString(x);
		int temp = strX.length() - 1;
		
		for (int i = 0; i < strX.length() / 2 + 1 ; i++)
			if (strX.charAt(i) != strX.charAt(temp--)) return false;
		
		return true;
    }
	
}