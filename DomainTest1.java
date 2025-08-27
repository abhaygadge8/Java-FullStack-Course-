//Domain Test
//Author: Abhay Gadge
//BAtch Number: J150
//Date : 28/04/2025
//Problem Statement: 4)write a program to show the all type of Constructor
class Practicalmain{
	int rollNO;
	Practicalmain(){
		this.rollNO=1;
	}
	Practicalmain(int rollNO){
		this.rollNO=rollNO;
	}
	public static void main(String[] args){
		Practicalmain practicalObj=new Practicalmain();
		System.out.println(practicalObj.rollNO);
		Practicalmain practicalObj1=new Practicalmain(2001);
		System.out.println(practicalObj1.rollNO);

	}
}