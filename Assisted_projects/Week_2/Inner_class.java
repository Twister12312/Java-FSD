package Assisted_projects.Week_2;

 class innerClassAssisted1 {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 } } 

	 class innerClassAssisted2 {

		 private String msg="Inner Classes";

		  void display(){  
		 	 class Inner{  
		 		 void msg(){
		 			 System.out.println(msg);
		 		 }  
		   }  
		   
		   Inner l=new Inner();  
		   l.msg();  
		  }  
	 }

public class Inner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerClassAssisted1 obj=new innerClassAssisted1();
		innerClassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
        System.out.println();
		innerClassAssisted2  ob=new innerClassAssisted2 ();  
		ob.display();  

		
	}

}
