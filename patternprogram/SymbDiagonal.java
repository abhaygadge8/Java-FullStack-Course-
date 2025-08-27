/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package patternprogram;

import java.util.Scanner;

class SymbDiagonal{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of two dimensional array");
		int n=scanner.nextInt();
		int mix[][]=new int[n][n];
		for(int i=0;i<mix.length;i++){
			for(int j=0;j<mix[i].length;j++){
				if(i+j==n-1){
					mix[i][j]=1;
				}
				System.out.print(" "+mix[i][j]);
			}
			System.out.println();
		}
		scanner.close();
	}
}

/*class SymbDiagonal{
	public static void main(String[] args){
		int mix[][]=new int[4][4];
		for(int i=0;i<mix.length;i++){
			for(int j=0;j<mix[i].length;j++){
				if(i==j){
					mix[i][j]=1;
				}
				System.out.print(" "+mix[i][j]);
			}
			System.out.println();
		}
	}
}*/

/*class SymbDiagonal{
	public static void main(String[] args){
		int mix[][]=new int[4][4];
		for(int i=0;i<mix.length;i++){
			for(int j=mix[i].length-1;j>=0;j--){
				if(i==j){
					mix[i][j]=1;
				}
				System.out.print(" "+mix[i][j]);
			}
			System.out.println();
		}
	}
}*/

/*class SymbDiagonal{
	public static void main(String[] args){
		int mix[][]=new int[4][4];
		for(int i=0;i<mix.length;i++){
			for(int j=0;j<mix[i].length;j++){
				if(i+j==3){
					mix[i][j]=1;
				}
				System.out.print(" "+mix[i][j]);
			}
			System.out.println();
		}
	}
}*/