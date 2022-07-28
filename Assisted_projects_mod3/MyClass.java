package Assisted_projects_mod3;

public class MyClass {
	private static Object lock= new Object();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		System.out.println("Thread " + Thread.currentThread().getName() + " is woken after sleeping for 1 second");
		synchronized(lock) {
			lock.wait(1000);
			System.out.println("object "+ lock+ " is woken after sleeping for a second");
			
		}

	}

}
