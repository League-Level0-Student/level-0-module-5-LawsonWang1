package _02_nested_loops._3_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class LoopGauntlet {
 
	public static void main(String[] args) {
	
		for (int x = 1; x < 100; x++) {
			System.out.print(x + ", ");
		}   System.out.println(100);
		
		for (int x = 100; x > 1; x--) {
			System.out.print(x + ", ");
		}	System.out.println(1);
	

		for (int x = 2; x < 100; x+=2) {
			System.out.print(x + ", ");
		}   System.out.println(100);
		
		for (int x = 1; x < 99; x+=2) {
			System.out.print(x + ", ");
		}   System.out.println(99);
	 
		for (int x = 1; x < 101; x++) {
			System.out.print(x);
			if (x % 2 == 0) {
				System.out.println(" is even");
			} else {
				System.out.println(" is odd");
			}
		}
		for (int x = 0; x < 777; x+=7) {
			System.out.print(x + ", ");
		}   System.out.println(777);
		

		for (int x = 1; x < 100; x++) {
			System.out.print(x + ", ");
		}   System.out.println(100);
		
		for (int x = 2011; x < 2027; x++) {
			System.out.println("In " + x + " I was " + (x-2011) + " years old");
			}
		
	
		
		
		
		
	}
}
