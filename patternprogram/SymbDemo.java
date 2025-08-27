/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package patternprogram;
class SymbDemo{
	public static void main(String[] args){
		int mix[][]={{1},{1,2},{1,2,3},{1,2,3,4}};
		for(int i=0;i<mix.length;i++){
			for(int j=0;j<mix[i].length;j++){
				System.out.print(" "+mix[i][j]);
			}
			System.out.println();
		}
		

		/*int[] a={1,2,3,14,15};
		int[] b={10,20,30,40,50};
		//int []mix[] = {a,b};
		//int [][]mix = {a,b};
		int mix[][] = {a,b};
		mix[1][2]=300;
		for(int i=0;i<mix.length;i++){
			for(int j=0;j<mix[i].length;j++){
				System.out.print(" "+mix[i][j]);
			}
		}*/
	}
}