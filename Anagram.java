package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
     String text1 = "keep";
     String text2 = "peek";
     boolean status = true;
     if (text1.length()==text2.length()) {
		char[] ch1 = text1.toCharArray();
		char[] ch2 = text2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		status=Arrays.equals(ch1,ch2);
     }
     else
    	 status = false;
     if(status)
    	 System.out.println(text1 + " and " + text2 + " are anagrams" );
     else
    	 System.out.println(text1 + " and " + text2 + " not are anagrams" );
	}
	}
