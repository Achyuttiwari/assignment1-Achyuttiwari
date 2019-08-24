/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;
import java.util.Scanner;
public class Gravity {

	public static void main(String[] args) {
		double g=9.8;
		Scanner ob=new Scanner(System.in);
		double t=ob.nextDouble();
		double speed=g*t;
		double distance=0.5*g*t*t;
		System.out.println("The speed of the object at " +t +" seconds after its release is "+speed +" and the distance the object has travelled in the "+t +" seconds after the relase is "+distance
		);
		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
