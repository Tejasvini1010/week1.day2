package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "Welcome to Chennai";
		int count = 0;
		char ch[] = str.toCharArray();
		char search = 'n';
		//int len = ch.length;
		for (int i = 0; i < ch.length; i++) {
			if (str.charAt(i) == search)
				count++;
		}
		System.out.println("The character " + search + " has occured " + count + " times");
	}
}
