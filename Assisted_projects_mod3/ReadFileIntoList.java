package Assisted_projects_mod3;

import java.io.*; 
import java.util.Scanner;
public class ReadFileIntoList {
	public static void appendStrToFile(String fileName,String str){ //static method to append to file
// Try block to check for exceptions
try {
BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
// Writing on output stream
out.write(str);
// Closing the connection
out.close();
}

// Catch block to handle the exceptions
catch (IOException e) {
// Display message when exception occurs
System.out.println("exception occurred" + e);
}
}

	   
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		File file = new File("D:\\WORK FOLDER\\Outputs-JAVA FSD\\FileforReadfile\\Names.txt");//reading from this
		String first_File= "D:\\WORK FOLDER\\Outputs-JAVA FSD\\FileforReadfile\\Names.txt";
		File file2= new File("D:\\WORK FOLDER\\Outputs-JAVA FSD\\FileforReadfile\\Empty.txt");//writing into this
		Scanner sc;
		//READ FROM FILE
		try {
			sc = new Scanner(file);
			System.out.println("Reading from file location..");
			while (sc.hasNextLine())
			      System.out.println(sc.nextLine()); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry, the file location does not exist");
			e.printStackTrace();
		}
		
		System.out.println();
		//WRITE TO A FILE
		String textAdd="This text is now written in this file!";
		
		try {
		FileWriter fWriter = new FileWriter("D:\\WORK FOLDER\\Outputs-JAVA FSD\\FileforReadfile\\Empty.txt");
        fWriter.write(textAdd);
        fWriter.close();
		System.out.println("Reading from written file location....");
		sc = new Scanner(file2);
		while (sc.hasNextLine())
		      System.out.println(sc.nextLine());
		}
		
		catch(IOException e) {
			System.out.println("File location incorrect!");
		}
		
		System.out.println();
		//APPEND TO A FILE
		String str = "\n This is appended text to first file";
		appendStrToFile(first_File, str);
		System.out.println("Reading from first file location....");
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine())
			      System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		

	}


