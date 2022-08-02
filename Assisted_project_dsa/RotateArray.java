package Assisted_project_dsa;

import java.util.Scanner;

class Arrayrotater{
	
	public void rotate(int[] arr, int num) {
	    
		int[] res= new int[arr.length];
		for(int i=0;i<res.length;i++) {
			if(((arr.length-num)+i)>=arr.length) {
				res[i]= arr[((arr.length-num)+i)%arr.length];
				continue;}
			res[i]= arr[(arr.length-num)+i];
			
		}
		System.arraycopy( res, 0, arr, 0, arr.length );	
	}
	
}



public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[6];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the elements in the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();	
		}
		System.out.println("enter rotation no: ");
		int num=sc.nextInt();
		System.out.println("Array before rotation: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
		}
		System.out.println();
		System.out.println("Array after rotation: ");
		Arrayrotater obj1= new Arrayrotater();
		obj1.rotate(arr, num);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
		}
		
		
		

	}

}
