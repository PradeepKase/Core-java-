package Cmdline;
import java.beans.Statement;
import java.util.Scanner;
public class Arrofobj {
	class Student_Bean {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Bean obj=new Student_Bean();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to show the student details");
		int num=s.nextInt();
		Student_Bean Studentarr[] =new Student_Bean[num];
		for(int i=0; i<num; i++) {
			Student_Bean s1=new Student_Bean();
			System.out.println("Enter the name");
			s1.setName(s.next());
			System.out.println("Enter the address");
			s1.setAddress(s.next());
			System.out.println("Enter the roll num");
			s1.setRoll(s.nextInt());
			System.out.println("Enter the marks");
			s1.setMarks(s.nextInt());
			Studentarr[i]=s1;
		}
		
	}

}
