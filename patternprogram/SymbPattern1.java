/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package patternprogram;
class SymbPattern1{
	public static void main(String[] args){
		int mix[][]=new int[4][];
		mix[0]=new int[1];
		mix[1]=new int[2];
		mix[2]=new int[3];
		mix[3]=new int[4];
		int count=0;
		for(int i=0;i<mix.length;i++){
			
			System.out.println();
			for(int j=0;j<mix[i].length;j++){
				++count;
				mix[i][j]=count;
				System.out.print(mix[i][j]+" ");
			}
		}
	}
}