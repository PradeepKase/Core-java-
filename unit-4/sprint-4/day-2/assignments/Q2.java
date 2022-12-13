package day2;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter num1");
		int num1=s.nextInt();
		System.out.println("enter num2");
		int num2=s.nextInt();
		try {
			System.out.println(num1/num2);
		}
		catch(ArithmeticException a) {
			System.out.println("DivideByZeroException caught");
		}
		finally {
			System.out.println("Inside finally block");
		}
		
	}

}
