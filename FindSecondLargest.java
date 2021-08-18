package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,5,9};
		Arrays.sort(arr);
		System.out.println("The second largest number in an array:" + arr[arr.length - 2]);
		
	}

}
