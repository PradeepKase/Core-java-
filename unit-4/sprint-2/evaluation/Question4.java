package eval2;

import java.util.Scanner;
public class Question4 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Your name :");
	String str=scanner.nextLine();
	
	System.out.println("Enter your age");
	int age=scanner.nextInt();
	
	System.out.println(str+" "+age);
}
}
