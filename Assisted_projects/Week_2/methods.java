package Assisted_projects.Week_2;

class Implementmethods{
	int add(int a, int b) {
		return (a+b);
	}
	
	int multiply(int a, int b) {
		return a*b;
	}
	
}

public class methods {
	public static void main(String args[]) {
	Implementmethods obj= new Implementmethods();
	int num1=10,num2=5;
	System.out.println("addtion method: "+obj.add(num1, num2)+" multiplication method: "+obj.multiply(num1, num2));
	
	}

}
