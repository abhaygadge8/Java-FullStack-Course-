/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//Exception Handling Program
//Exception propagation 
package com.practisetest.april9;
public class ExHandle {
	public static void main(String[] args) {
		int a=10; 
		int b=0;
		int result =0;
		try {
			result =DoTheDivision(a,b);
			throw new ArithmeticException();
		}catch(RuntimeException e) {
			System.err.println("We can't divide by Zero. "+e.toString());
		}finally {
			System.out.format("using Exceptionpropagation result ="+result);
		}
	}
	static int DoTheDivision(int a,int b) {
		int result=0;
		try {
			result =DoActualDivision(a,b);
		}catch( NullPointerException e) {
			System.out.println("this exception handle in DoTheDivision mehtod");
		}
		return result;
	}
	static int DoActualDivision(int a,int b) {
		int result=0;
		try {
			result=a/b;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" this is handle by handle in DoAtualDivison in method");
		}
		return result;
	}	
}


/*public class ExHandle {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int result =0;
		try {
			result =DoTheDivision(a,b);
		}finally {
			System.out.format("using Exceptionpropagation result ="+result);

		}
	}
	static int DoTheDivision(int a,int b) {
		int result=0;
		try {
			result =DoActualDivision(a,b);
		}catch( NullPointerException e) {
			System.out.println("this exception handle in DoTheDivision mehtod");
		}
		return result;
	}
	static int DoActualDivision(int a,int b) {
		int result=0;
		try {
			result=a/b;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" this is handle by handle in DoAtualDivison in method");
		}
		return result;
	}	
}*/


/*public class ExHandle {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int result =0;
		try {
			result =DoTheDivision(a,b);
		}catch(RuntimeException e) {
			System.err.println("We can't divide by Zero. "+e.getMessage());
		}finally {
			System.out.println("using Exceptionpropagation result ="+result);
		}
		try {
			result =DoTheDivision(a,b);
		}catch(RuntimeException e) {
			System.err.println("We can't divide by Zero. "+e.getMessage());
		}finally {
			System.out.format("using 2 Exceptionpropagation result ="+result);
		}
	}
	static int DoTheDivision(int a,int b) {
		int result=0;
		try {
			result =DoActualDivision(a,b);
		}catch( NullPointerException e) {
			System.out.println("this exception handle in DoTheDivision mehtod");
		}
		return result;
	}
	static int DoActualDivision(int a,int b) {
		int result=0;
		try {
			result=a/b;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" this is handle by handle in DoAtualDivison in method");
		}
		return result;
	}	
}*/

/*public class ExHandle {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int result =0;
		try {
			result =DoTheDivision(a,b);
		}catch(RuntimeException e) {
			System.err.println("We can't divide by Zero. "+e.getMessage());
		}finally {
			System.out.format("using Exceptionpropagation result ="+result);

		}
	}
	static int DoTheDivision(int a,int b) {
		int result=0;
		try {
			result =DoActualDivision(a,b);
		}catch( NullPointerException e) {
			System.out.println("this exception handle in DoTheDivision mehtod");
		}
		return result;
	}
	static int DoActualDivision(int a,int b) {
		int result=0;
		try {
			result=a/b;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" this is handle by handle in DoAtualDivison in method");
		}
		return result;
	}	
}*/

/*public class ExHandle {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int result =0;
		try {
			result =DoTheDivision(a,b);
		}catch(NullPointerException e) {
			System.err.println("We can't divide by Zero. "+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("We can't divide by Zero. "+e.getMessage());
		}catch(ArithmeticException e) {
			System.err.println("We can't divide by Zero. "+e.getMessage());
		}catch(RuntimeException e) {
			System.err.println("We can't divide by Zero. "+e.getMessage());
		}catch(Exception e) {
			System.err.println("We can't divide by Zero. "+e.getMessage());
		}
		System.out.format("using Exceptionpropagation result ="+result);
	}
	static int DoTheDivision(int a,int b) {
		int result=0;
		try {
			result =DoActualDivision(a,b);
		}catch( NullPointerException e) {
			System.out.println("this exception handle in DoTheDivision mehtod");
		}
		return result;
	}
	static int DoActualDivision(int a,int b) {
		int result=0;
		try {
			result=a/b;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" this is handle by handle in DoAtualDivison in method");
		}
		return result;
	}	
}*/


/*public class ExHandle {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int result =0;
		try {
			result =DoTheDivision(a,b);
		}catch(RuntimeException e) {
			System.err.println("We can't divide by Zero. "+e.getMessage());
		}
		System.out.format("using Exceptionpropagation result ="+result);
	}
	static int DoTheDivision(int a,int b) {
		int result=0;
		try {
			result =DoActualDivision(a,b);
		}catch( NullPointerException e) {
			System.out.println("this exception handle in DoTheDivision mehtod");
		}
		return result;
	}
	static int DoActualDivision(int a,int b) {
		int result=0;
		try {
			result=a/b;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" this is handle by handle in DoAtualDivison in method");
		}
		return result;
	}	
}*/

/*/Exception Handling Program/
 * public class ExHandle {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int result =0;
		try {
			result =a/b;
			System.out.println("Result in try block result ="+result);
		}catch(RuntimeException e) {
			System.err.println("We can't divide."+e.getMessage());
			System.out.println(" i am in catch block result="+result);
		}
		System.out.format("result ="+result);
	}
}*/
