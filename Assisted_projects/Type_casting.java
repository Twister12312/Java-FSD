package Assisted_projects;

public class Type_casting {
	public static void main(String args[]) {
		char A='C';
		System.out.println("Implicit type conversion of:"+ A);
		int b= A;
		System.out.println("Conversion from char to int: "+b);
		float c= A;
		System.out.println("Conversion form char to float: "+c);
		
		double d= 55.7;
		int x= (int)d;
		System.out.println();
		
		System.out.println("Explicit type conversion "+d+" converted to "+x);
		
	}

}
