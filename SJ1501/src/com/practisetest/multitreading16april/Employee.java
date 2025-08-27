/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.multitreading16april;
public class Employee implements Runnable {
	String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void run() {
		for(int i=0;i<5;i++) 
			System.out.println(this.getStr()+" i="+i);
	}
}

//for the Start  method and thread understand
/*public class Employee extends Thread {
//	public void punchIn() {
//		System.out.println("I am in Office");
//	}
//	public void logIn() {
//		System.out.println("I am login in my compputer");
//	}
//	public void logOut() {
//		System.out.println("I am logout in my computer");
//	}
//	public void punchOut() {
//		System.out.println("I am out  Office");
//	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) 
			System.out.println(this.getName()+" and i="+i);
		
//		this.punchIn();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		this.logIn();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		this.logOut();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		this.punchOut();
//		
	}
	
}*/
