//A class sixth student required to solve basic mathematics problems. For this he/ she needs to perform operations such as addition, subtraction, multiplication, division, remainder, square, cube and absolute. Write a  program using these basic operations.
package Assignment1;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first number");
		double a = sc.nextDouble();
		
		System.out.println("Enter your operator :- +, -, *, /, % for remainder, ^ for square, cube... , | for absolute");
		System.out.println("\n--- Choose your operator ---");
        System.out.println("+. Addition");
        System.out.println("-. Subtraction");
        System.out.println("*. Multiplication");
        System.out.println("/. Division");
        System.out.println("%. Find Remainder");
        System.out.println("^. Find Square, cube, ....");
        System.out.println("|. Absolute");

		char operator = sc.next().charAt(0);

		if(operator != '+' || operator != '-' || operator != '*' || operator != '/' || operator != '^' || operator != '|') {
			System.out.println("Invalid Operator");
		}
		else if(operator == '|') {
			System.out.println("Enter your second number");
			System.out.println(Math.abs(a));
		}
		else {
			System.out.println("Enter your second number");
			double b = sc.nextDouble();
			
			switch(operator){
			case('+') :
				System.out.println(a + b);
			    break;
			    
			case('-') :
				System.out.println(a - b);
			    break;
			    
			case('*') :
				System.out.println(a * b);
			    break;
			    
			case('/') :
				System.out.println(a / b);
			    break;
			    
			case('^') :
				System.out.println(Math.pow(a, b));
			    break;
			    
			     
			}
		}		
		sc.close();
	}
}
