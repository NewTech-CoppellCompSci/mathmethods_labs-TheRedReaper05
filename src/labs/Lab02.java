package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		double num1;
		double num2;
		System.out.println("Enter a positive integer");
		num1 = inKey.nextInt();
		System.out.println("Enter another positive integer");
		num2 = inKey.nextInt();
		for(int i = 1; i < 11; i++) {
			double scope = num1;
			double min = num2;
			int num = (int) (Math.random() * scope + min);
			System.out.print(num);
		}
		
		
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		double radius;
		double height;
		double pi;
		pi = 3.14159265389793;
		System.out.println("Enter the Radius ");
		radius = inKey.nextInt();
		System.out.println("Enter the Height ");
		height = inKey.nextInt();
		System.out.println("The volume is " + pi * radius * radius * height);
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		double x1;
		double y1;
		double x2;
		double y2;
		System.out.println("Enter a interger for x1 ");
		x1 = inKey.nextInt();
		System.out.println("Enter a interger for y2 ");
		y1 = inKey.nextInt();
		System.out.println("Enter a interger for x2 ");
		x2 = inKey.nextInt();
		System.out.println("Enter a interger for y2 ");
		y2 = inKey.nextInt();
		System.out.println("The distance between the 2 points is ");
		System.out.println((x2 - x1) * 2 + (y2 - y1) * 2);

	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		double avalue;
		double bvalue;
		double cvalue;
		System.out.println("Enter a interger for a-value ");
		avalue = inKey.nextInt();
		System.out.println("Enter a interger for b-value ");
		bvalue = inKey.nextInt();
		System.out.println("Enter a interger for c-value ");
		cvalue = inKey.nextInt();
		System.out.print("x1 = " + bvalue + "\n x2 = " + (bvalue * 2 - 4 * avalue * cvalue));
	}
	
	

	
}
