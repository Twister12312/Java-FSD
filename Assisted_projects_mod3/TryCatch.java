package Assisted_projects_mod3;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] array= new int[3];
        try {
        	array[4]=3;
        }
        catch(Exception e){
        	System.out.println("Sorry, entry is out of bounds!");
        }
        finally {
        	System.out.println("The array has 3 total entries");
        }
	}

}
