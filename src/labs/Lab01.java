package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("enter a positive integer");
		int input = inKey.nextInt();
		System.out.print("enter another positive integer");
		int input2 = inKey.nextInt();
		
		double num1 = Math.pow(input, input2);
		System.out.println(num1);

		
		
		
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		int num1;
		System.out.println("Enter a positive integer");
		num1 = inKey.nextInt();
		double num2 = Math.sqrt(num1);
		System.out.println(num2 + "\n");
		
		
		
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		double num1, num2, hypotenuse;
		System.out.println("the length of side A is");
		num1 = inKey.nextInt();
		System.out.println("the length of side B is");
		num2 = inKey.nextInt();
		hypotenuse = Math.sqrt((num1*num1)+(num2*num2));
		System.out.println("the length of the Hypotenuse is " + hypotenuse);


		
		

	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		int num1;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println("Enter an integer ");
		num1 = inKey.nextInt();
		while (num1 > 0) {
			System.out.println("Enter an integer ");
			num1 = inKey.nextInt();
			if (num1 < 0) {
				System.out.println("Enter an integer ");
				num1 = inKey.nextInt();
				max = Math.max(max, num1);
				System.out.println(max);
				System.out.println("Max = " + max);
				min = Math.min(min, num1);
				System.out.println(min);
				System.out.println("Min = " + min);
			}
		}

		
	}
	
	
	
	
	
	
}
