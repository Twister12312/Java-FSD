package Assisted_projects.Week_2;

class EmpInfo{//default constructor
	int id=1234;
	String name="Arvind";

void display() {
	System.out.println(id+" "+name);
	}
}

class Std{ //parameterized constructor
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}


public class Constructors {
	public static void main(String args[]) {
		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();

		emp1.display();
		emp2.display();
        System.out.println();
		Std std1=new Std(2,"Alex");
		Std std2=new Std(10,"Annie");
		std1.display();
		std2.display();

		
	}
	

}
