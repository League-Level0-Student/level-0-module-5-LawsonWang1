package _01_algorithms._2_fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = a+b;
		
		for (int x = 0; x < 10; x += 1) {
			System.out.println(a+b);
			a = b;
			b = c;
			c = a+b;
		}
		
	}

}
