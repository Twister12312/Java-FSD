package week1_Calculator;
import java.util.Scanner;

class Arithmetic{
	int variable1;
	int variable2;
	static String role="This a calculator"; //static keyword
	
	void display() {
		System.out.print(role);
	}
	public int add (double a, double b) {
		this.variable1= (int) a; // explicit type conversion &this keyword
		this.variable2= (int) b;
		return(variable1+variable2); //operators
		
	}
	
	protected double sub(double a, double b) {
		return(a-b);
	}
	
	public double multiply(double a, double b) {
		return(a*b);
	}
	
	public double division(double a, double b) {
		return(a/b);
	}

}

class ArithmeticAlso extends Arithmetic{} //using access specifier

public class Arithmetic_Calculator {
	final static double Pi=3.14; //final keyword ->constant value

	public static void main(String[] args) {
		double num1, num2; //variable, double data type
		Arithmetic calculate= new Arithmetic(); //creating object calculate
		Arithmetic temp= new Arithmetic();
		ArithmeticAlso calculate_temp= new ArithmeticAlso();
		
		while(true) { //control statement
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number?");
		num1=sc.nextDouble();
		System.out.println("Enter second number?");
		num2=sc.nextDouble();
		
		System.out.println("Arithmetic operation on the two numbers are:");
		System.out.println("Addition is: "+ calculate.add(num1,num2));
		System.out.println("Subtraction is: "+ calculate_temp.sub(num1, num2));//access specifier
		System.out.println("Multiplication is: "+ calculate.multiply(num1, num2) );
		System.out.println("Division is: "+ calculate.division(num1, num2));
		System.out.println("First number multiplied with PI is: "+ num1*Pi+"\n");//using final keyword
		
		Arithmetic.role="Performs 4 operations"; //static keyword, String 'role' gets changed
		System.out.println("What does this program do?: ");
		temp.display(); 
		System.out.println("\n");
		}
	}

}


