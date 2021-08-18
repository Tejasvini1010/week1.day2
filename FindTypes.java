package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 29nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char ch[] = test.toCharArray();
		for (int i = 0; i < ch.length; i++) {
		if(Character.isLetter(ch[i]))
			letter++;
		if(Character.isDigit(ch[i]))
			num++;
		if(Character.isSpaceChar(ch[i]))
			space++;
		}
		specialChar = ch.length - (letter+num+space);
		System.out.println("There are " + letter + " letters in the given string");
		System.out.println("There are " + num + " digits in the given string");
		System.out.println("There are " + space + " spaces in the given string");
		System.out.println("There are " + specialChar + " spaces in the given string");
	}

}
