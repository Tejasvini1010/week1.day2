package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str = "454";
		String rev ="";
		int len = str.length();
		for ( int i = len - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
		  if (str.equalsIgnoreCase(rev))
		         System.out.println(str+" is a palindrome");
		      else
		         System.out.println(str+" is not a palindrome");
	}

}
