package week1.day2;

public class Calculator {

	public int add(int x, int y)
	{
		int z = x+y;
		return z;
		
	}
	public int sub(int x, int y)
	{
		int z = x-y;
		return z;
	}
	public double mul(double a, double b)
	{
		double c = a*b;
		return c;
	}
	public float div(float r, float s)
	{
		float t = r/s;
		return t;
	}
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		System.out.println();
	}

}
