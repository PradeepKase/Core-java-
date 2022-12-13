package spring2;
import java.util.Scanner;
public class Assaignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="Java Exercises";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=scanner.nextLine();
		
		System.out.println("Enter the character position you want to access:");
		int position=scanner.nextInt();
		
		System.out.println("Character at position 2 is :");
		System.out.println(str.charAt(2));
	}

}
