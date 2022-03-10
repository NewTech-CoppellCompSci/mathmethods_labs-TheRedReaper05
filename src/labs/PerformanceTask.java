package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a launch velocity (m/s) ");
		double vel = inKey.nextDouble();
		System.out.print("Enter a launch angle (degrees) ");
		double angle = inKey.nextDouble();
		System.out.print("Time is 0s");
		System.out.print(" the x position is 0.0 ");
		System.out.print(" the y position is 0.0");
		int time = 1;
		double x = Math.cos(Math.toRadians(angle)) * time * vel;
		double y = Math.sin(Math.toRadians(angle)) * time * vel - 0.5 * 9.8 * (time * time);
		while (y > 0) {
			x = Math.cos(Math.toRadians(angle)) * time * vel;
			y = Math.sin(Math.toRadians(angle)) * time * vel - 0.5 * 9.8 * (time * time);
			System.out.print("Time is " + time + "s");
			System.out.print("The x position is " + x);
			System.out.print("The y position is " + y);

		}
		
		
		
		
		
	}
	
	
}
