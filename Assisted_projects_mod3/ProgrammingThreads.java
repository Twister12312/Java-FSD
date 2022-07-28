package Assisted_projects_mod3;

public class ProgrammingThreads extends Thread {
	
	public void run() {
		
		System.out.println("Concurrent thread started running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammingThreads mt= new ProgrammingThreads();
		mt.start();

	}

}
