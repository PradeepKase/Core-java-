package day1;

import java.util.Arrays;
import java.util.Scanner;
public class Practice {
	static String reversString(String originalString) {

		int [] arr=new int[5];
		for(int i=0; i<5; i++) {
			arr[i]= i;
		}
//		System.out.println(Arrays.toString(arr));

		char [] str= originalString.toCharArray();

		String temp="";
		for(int i=originalString.length()-1;i>=0; i--) {
			temp+=str[i];
		}
		return (temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Practice p1=new Practice();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = scanner.nextLine();
		String result=reversString( orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
		scanner.close();
	}

}
