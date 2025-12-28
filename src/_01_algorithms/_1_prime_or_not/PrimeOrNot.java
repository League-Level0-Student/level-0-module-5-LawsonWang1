package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		
	String number = JOptionPane.showInputDialog("Give me a number");
	int numAsInt = Integer.parseInt(number);
	boolean isPrime = true;
	for (int x = 2; x < Math.sqrt(numAsInt); x += 1) {
		if (numAsInt % x == 0 ) {
			
			isPrime = false;
		} 
		
	} 
	if(isPrime) {
	JOptionPane.showMessageDialog(null, "Your number is prime");
	}
	else {
		JOptionPane.showMessageDialog(null, "Your number is not prime");
	}
		
		
	}
}
