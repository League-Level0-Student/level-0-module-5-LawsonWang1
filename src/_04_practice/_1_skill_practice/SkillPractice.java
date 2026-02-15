package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {
		
		SkillPractice skills = new SkillPractice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");

		// Tell them how many cents they have (hint multiply by 10)
		int dimesAsInt = Integer.parseInt(dimes);
		JOptionPane.showMessageDialog(null, "You have " + dimesAsInt*10 + " cents");

		// Ask the user how tall they are (inches)
		String height = JOptionPane.showInputDialog("How tall are you in inches?");

		// If they are shorter than 36 inches, tell them to eat their Wheaties
		int heightAsInt = Integer.parseInt(height);
		if (heightAsInt < 36) {
			JOptionPane.showMessageDialog(null, "Eat your Wheaties");
			}
		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int x = 1; x <= 30; x+=3) {
			System.out.println(x);
		}






		}

		void skill3() { // Get a random number that is less than 20 and print it to the console
		Random ran = new Random();
		int number = ran.nextInt(20) + 1;
		System.out.println(number);

		// Get another random number that is less than 10 and print it to the console
		int number2 = ran.nextInt(10) + 1;
		System.out.println(number2);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
		JOptionPane.showMessageDialog(null, number - number2);

		}

		void skill4() { // In a pop-up, ask the user for the city they live in
		
		String city = JOptionPane.showInputDialog("What city do you live in?");
		// If they answered "San Diego", tell them they live in America's Finest City
		if (city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's Finest City");
		} else {
			JOptionPane.showMessageDialog(null, "You should move to San Diego");
		}
		// Otherwise, tell them to move to San Diego
		
		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
		String cars = JOptionPane.showInputDialog("How many cars does your family have?");
		int carsAsInt = Integer.parseInt(cars);
		if (carsAsInt == 1) {
		String model = JOptionPane.showInputDialog("What is the model of your car?");
		JOptionPane.showMessageDialog(null, carsAsInt);
		}
		// If there is 1 car, use a pop-up to display the make/model of the car
		
		
		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.
		if (carsAsInt > 1) {
			JOptionPane.showMessageDialog(null, "In total you have " + carsAsInt*4 + " wheels.");
		}


		}

		void skill5() { // In a pop-up, ask the user for the name of their school

		String school = JOptionPane.showInputDialog("What is the name of your school?");

		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.
		JOptionPane.showMessageDialog(null, school + " is a fantastic school.");


			}
		}

