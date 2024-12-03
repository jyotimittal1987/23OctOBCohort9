package exceptions;

public class Sample {
	public static void main(String[] args) {
		//System.out.println("Hello World")  -- Syntax Error
		
		/*int num1=10, num2=2;
		System.out.println(num2/num1);//2/10->0 LOgical Error 
	}
*/
		int num1=10,num2=0;
		System.out.println(num1/num2);// 10/0
		System.out.println("In main ");
		
		
}
}
