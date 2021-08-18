package week1.day2;

public class PrintDuplicates {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,1,2,3,4};
		int len = arr.length;
	//	int count = 0;
		System.out.println("The duplicates in given array:");
	  //  Arrays.sort(arr1);
    for (int i = 0; i < len; i++) {
    
    	for (int j = i+1; j < len; j++) {
			if(arr[i]==arr[j])
				System.out.println(arr[j]);
		}	
	}	
}
}