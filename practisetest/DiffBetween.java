package practisetest;
class Human{
	Human(){
		System.out.println("I am Constructor");
	}
	
		
}
class DiffBetween{
	static{
		System.out.println("I am static initilizer");

	}
	{
		System.out.println("I am Initilizer");

	}
	public static void main(String[] args){
		System.out.println("I am main() method");
		//DiffBetween d1=new DiffBetween();
		Human H1=new Human();
	}
}