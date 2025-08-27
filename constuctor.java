/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
class Practise{
	int id;
	String name;
		Practise(){
			
		}
		Practise(int id,String name){
			this.id=id;
			this.name=name;
		}
		void display(){
			System.out.println("id "+this.id);
			System.out.println("name "+this.name);
		}
}
public class OperatorPractise extends Practise{
	OperatorPractise(int id,String name){
			super(id,name);
	}
	public static void main(String[] args){
		OperatorPractise op=new OperatorPractise(1,"Abhay");
		op.display();
	}
}