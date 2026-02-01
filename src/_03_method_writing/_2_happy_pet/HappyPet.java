package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	static String pet = JOptionPane.showInputDialog("Which one of these pets do you want to buy: dog, cat, or fish?");

	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!

		// 4. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int petTask = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?",
				"Interactions", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Feed the pet", "Take the pet on a walk", "Play with the pet" }, null);
		// 6. Use user input to call the appropriate method created in step 5 below.
		switch (petTask) {
		case 0:
			food();
			break;
		case 1:
			walk();
			break;
		case 2:
			play();
			break;
		}
		// 7. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
		if (happinessLevel >= 10) {
			System.exit(0);
		}
	}

	// 5. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	public static void food() {
		if (pet.equalsIgnoreCase("dog")) {
			JOptionPane.showMessageDialog(null, "The dog wagged its tail");
			happinessLevel += 2;
		} else if (pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "The cat purred");
			happinessLevel += 2;
		} else if (pet.equalsIgnoreCase("fish")) {
			happinessLevel +=2;
		}
	}

	public static void walk() {
		if (pet.equalsIgnoreCase("dog")) {
			JOptionPane.showMessageDialog(null, "The dog felt happy");
			happinessLevel += 1;
		} else if (pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "The cat got tired");
			happinessLevel -= 1;
		} else if (pet.equalsIgnoreCase("fish")) {
			JOptionPane.showMessageDialog(null, "The fish needs to live in water");
			happinessLevel -= 3;
		}
		
	}

	public static void play() {
		if (pet.equalsIgnoreCase("dog")) {
			JOptionPane.showMessageDialog(null, "The dog was very interested");
			happinessLevel += 1;
		} else if (pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "The cat was interested for a few minutes");
			happinessLevel += 1;
		} else if (pet.equalsIgnoreCase("fish")) {
			JOptionPane.showMessageDialog(null, "The fish did not pay attention to you");
			happinessLevel +=0;
		}
	}

}