package Assisted_project_dsa.Mod2;

import java.util.ArrayList;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < expenses.size(); i++){  
                System.out.print(expenses.get(i) + " ");  
        }  
        System.out.println();  
          
        sortExpenses(expenses);//sorting array elements using bubble sort  
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < expenses.size(); i++){  
                System.out.print(expenses.get(i) + " ");  
        }  
	}
	
	
	 private static void sortExpenses(ArrayList<Integer> arrayList) {
	        int arrlength =  arrayList.size(); //selection sort
	        for(int i=0;i<arrlength;i++) {
	        	int min= arrayList.get(i);
	        	for(int j=i;j<arrlength;j++) {
	        		if(arrayList.get(j)<min) {
	        			int temp = arrayList.get(j);
	        			arrayList.set(j,min);
	        			min=temp;
	        			arrayList.set(i, min);
	        		}
	        		
	        	}
	        
	        }
	       //Complete the method. The expenses should be sorted in ascending order.
	    }

}
