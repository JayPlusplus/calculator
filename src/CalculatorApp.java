import java.util.Scanner;

public class CalculatorApp {
	
	public static void main(String[] args) {
		int n3 ;
		Methods met = new Methods();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the first number?");
		int num1 = keyboard.nextInt();
		System.out.println("1 - Addition"
				+ "\n2 - Subtraction"
				+ "\n3 - Multiplication"
				+ "\n4 - Division"
				+ "\n5 - Modulus");
		System.out.println("What do you want to do?");
		int num3 = keyboard.nextInt();
		System.out.println("What is the second number?");
		int num2 = keyboard.nextInt();
		if (num3 == 1) {
			met.addition(num1,num2);
		}
		if (num3 == 2) {
			met.subtraction(num1,num2);
		}
		if (num3 == 3) {
			met.multiplication(num1,num2);
		}
		if (num3 == 4) {
			met.division(num1,num2);
		}
		if (num3 == 5) {
			met.modulus(num1,num2);
		}
		System.out.println("Your total is " + met.getTotal());
		
		/****Bonus : single method for numbers and operation**********/
		System.out.println("What is the first number?");
		int n1 = keyboard.nextInt();
		System.out.println("What is the second number?");
		int n2 = keyboard.nextInt();
		System.out.println("1 - Addition"
				+ "\n2 - Subtraction"
				+ "\n3 - Multiplication"
				+ "\n4 - Division"
				+ "\n5 - Modulus");
		n3 = keyboard.nextInt();
		met.setN(n3);
		met.singleMethod(n1,n2);
		System.out.println("Your total is " + met.getTotal());

	}

}
