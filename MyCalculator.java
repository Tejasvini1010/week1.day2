package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int result;
		int result1;
		double result2;
		float result3;
		result = obj.add(10,30);
		result1 = obj.sub(100,30);
		result2 = obj.mul(1.8480,30.87764);
		result3 = obj.div(30.9f, 10.9f);
		System.out.println("The addition of 2 numbers :" + result);
		System.out.println("The subtraction of 2 numbers :" + result1);
		System.out.println("The multiplication of 2 numbers :" + result2);
		System.out.println("The division of 2 numbers :" + result3);
	}

}
