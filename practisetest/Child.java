package practisetest;
class Parent{
	int money;
	Parent(){
		System.out.println("I hava "+this.money+" reppes");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("I hava "+this.money+" reppes");
	}
	public static void main(String[] args){
		Child c1=new Child();
	}
}