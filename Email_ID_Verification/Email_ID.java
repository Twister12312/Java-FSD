package Email_ID_Verification;
import java.util.*;
public class Email_ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email[]= {"arvind.n228@gmail.com","arvind.nair@yahoo.com","arvind.n2906@gmail.com",
				         "arvind.n29@gmail.com","arvind.nair29@gmail.com","arvind.n06@yahoo.com",
				         "gopalk@gmail.com","rohitg@gmail.com","lakshmi.c@gmail.com"};
		
		Scanner sc= new Scanner(System.in);
		while(true) {
		System.out.println("Please enter Employee email ID: ");
		String Id= sc.next();
		int count=0;
		System.out.println("Checking...");
		for(int i=0;i<email.length;i++) {
			if(Id.equals(email[i])) {
				count=1;
				break;
			}
			
		}//for loop
		if(count==1)System.out.println("Email ID found!");
		else if(count==0)System.out.println("Sorry, cannot find this Email ID.");
		System.out.println();
		}
		
		}//main method

	}


