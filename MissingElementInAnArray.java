package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,5,8,10};
		Arrays.sort(arr) ; //{1,2,3,4,5,7,8,10}
	//	System.out.println("The sorted array is: " + arr);
		for (int i = 1; i <= arr.length; i++) {
			if (i!=arr[i-1]) {
				System.out.println("The missing element is :" + i);
		//	break;
			}
		}
	}
}
