package Phase_1_final;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Virtual_Key {
	static ArrayList<String> filename = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n****************************************************************************\n");
        System.out.println("\t\t\tWelcome to LockedMe.com \n");
        
        System.out.println();
        System.out.println("This application aims to provide a seamless experience in adding/deleting\nand viewing current files in the directory."
        		+ "Please make use of the options\nin the interface to perform the necessary functions.");
        System.out.println();
        System.out.println("****************************************************************************");
        System.out.println();
        filename.add("Astroid.txt");//Since these files are already present in the directory
        filename.add("Bristol.txt");
       
        optionsSelection();

	}
	/*------------------------------------------------------------------------------------------*/
	private static void optionsSelection() {
        String[] arr = {"1. Return current file names in ascending order",
                "2. I wish to Add/delete/search from the given files",
                "3. Close the application"
        };
        String root_dir="D:\\WORK FOLDER\\Outputs-JAVA FSD\\Phase1_directory";
	    //root directory
        System.out.println("Select from the given options: ");
        
       /*---------------------------------------------------------------*/ 
        int[] arr1 = {1,2,3};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
        
        /*--------------------------------------------------------------*/
        Scanner sc = new Scanner(System.in);
        int options = 0;
        try{ options =  sc.nextInt();
        if(options>3||options<1) {System.out.println("please enter corect input");
        optionsSelection();
        }     
        }
        catch(InputMismatchException e) {
        	System.out.println("Please enter correct input.");
        	optionsSelection();
        }
        

        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options){
                    case 1:
                        System.out.println("The files in ascending order: \n");
                        sortFiles(filename);
                        System.out.println();
                        optionsSelection();
                        break;
                /*-------------------------------------------------------------------*/
                    case 2:
                    	repeat: while(true) {
                        System.out.println("Select from these options :\n "
                        		+ "1.Add a file \n 2.Delete a file \n "
                        		+ "3.Search if file exists \n "
                        		+ "4.Navigate back to main context \n");
                        int value = 0;
                        try {
                        	value=sc.nextInt();
                        }
                        catch(InputMismatchException e) {
                        	System.out.println("Please enter correct input.");
                        	System.out.println();
                        	optionsSelection();
                        }
                        
                        switch(value) {
                        case 1: System.out.println("Adding a file, give file name: ");
                                addFile(filename,root_dir);
                                System.out.println();
                                break;
                        case 2: System.out.println("Enter filename to be deleted");
                                deleteFile(filename,root_dir);
                                System.out.println();
                                break;
                        case 3: System.out.println("Enter file to be searched");
                                searchFile(filename);
                                System.out.println();
                                break;
                        case 4: System.out.println("Navigating back to main context..");
                                break repeat;
                        default: System.out.println("Sorry your input is faulty");
                        }
                       
                    	}
                    	optionsSelection();
                    	break;
                  /*------------------------------------------------------------------*/     
                    case 3:
                        closeApp();
                        break;
                    default: System.out.println("Sorry, your input is faulty, try again");    
                }
            }
            
        }    
	
	}
/*--------------------------------------------------------------------------------------------*/	
	
	
	///HELPER METHODS

	private static void sortFiles(ArrayList<String> filename) {
		 ArrayList<String> copyArr= (ArrayList<String>)filename.clone();
		 Collections.sort(copyArr);
		 System.out.println(copyArr);
		
	}
	
	
	private static void addFile(ArrayList<String> filename,String root_dir){
		 Scanner sc = new Scanner(System.in);
		 
		 String temp=sc.next();
		 String name = null;
		 int flag=0;
		 //File file = new File(root_dir+"\\"+name);
		 for(String a: filename) {
			 if(a.equalsIgnoreCase(temp)) {
				 name=a;
				 flag=1;
				 break;
			 }
		 }
		 if(flag==0) {
			 name=temp;
		 }
		 File file = new File(root_dir+"\\"+name);
         //Create the file
         try {
			if (file.createNewFile()){
			   filename.add(name);
			   System.out.println("File is Added!");
			 }else{
			   System.out.println("File already exists.");
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry, please try again");
		}
		
	}
	
	private static void deleteFile(ArrayList<String> filename, String root_dir) {
		Scanner sc = new Scanner(System.in);
		String name= sc.next();
		File file = new File(root_dir+"\\"+name);
        int flag=0;
		for(String a: filename) {
			if(a.equals(name)) {
				flag=1;
				break;
			}
		}
	if(flag==1) {	
    if (file.delete()) {
        System.out.println("File deleted successfully");
        filename.remove(String.valueOf(name));
    }}
    else {
        System.out.println("Failed to delete the file, File not found!");
    }
		
	}
	
	private static void searchFile(ArrayList<String> filename) {
		Scanner sc = new Scanner(System.in);
		 
		 String name=sc.next();
		 if(filename.contains(name))System.out.println("File is present");
		 else System.out.println("Sorry the file is not present.");
		
	}
	
	private static void closeApp() {
		System.out.println("Thankyou for using the app, exiting..");
		System.out.println("Exited.");
		System.exit(0);
		
	}
	
	
	
	

}
