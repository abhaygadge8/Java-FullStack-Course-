package practisetest;
class CovariantMethod{
	void display(int i){
		System.out.println("Hi");
	}
}
class Variant extends CovariantMethod{
	int display(int i){
		System.out.println("Hi");
		return i;
	}
	public static void main(String[] args){
		
	}
}