package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		//String[] str1=test.split(test);
		String[] s = test.split(" ");
		for (int i = 0; i < s.length; i++) {
			if(i%2!=0) {
				StringBuilder sb=new StringBuilder(s[i]);
				s[i]=sb.reverse().toString();
				System.out.println(s[i]);
			}
			else
				System.out.println(s[i]);
			
		}
	}

}
