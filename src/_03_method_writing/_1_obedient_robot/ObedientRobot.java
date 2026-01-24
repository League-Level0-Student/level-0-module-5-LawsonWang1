package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	public static void main(String[] args) {
		
		
		Robot rob = new Robot();
		rob.penDown();
		String shape = JOptionPane.showInputDialog("Which shape do you want me to draw?");
		if(shape.equalsIgnoreCase("square")) {
			drawSquare();
		}else if(shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}else if(shape.equalsIgnoreCase("circle")) {
			drawCircle();
		}
		String color = JOptionPane.showInputDialog("What color do you want the shape to be?");
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(255,0,0);
		}else if(color.equalsIgnoreCase("yellow")) {
			rob.setPenColor(255,255,0);
		}else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(0,0, 255);
		}
		
		
		
		
		}
		
		public static void drawSquare() {
			for(int i = 0; i < 4; i++) {
				Robot rob = new Robot();
				rob.penDown();
				rob.move(50);
				rob.turn(90);
			}
		}
		public static void drawTriangle() {
		for(int i = 0; i < 3; i++) {
			Robot rob = new Robot();
			rob.penDown();
			rob.move(50);
			rob.turn(120);
			
			}
		}
		public static void drawCircle() {
			for(int i = 0; i < 3; i++) {
				
				}
			}
		
		
		
		
		
}
		
		
		
		
