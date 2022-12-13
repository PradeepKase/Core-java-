package spring2;
import java.util.Scanner;
public class Course {
	
	int courseid;
	String courseName;
	int courseFee;
	public static void main(String[] args) {
		Course cr=new Course();
		cr.authenticate("Admin", "1234");
//		cr.authenticate("Admin", "1233");
	}
	
	void displayCourseDetails(){
		System.out.println(courseid);
		System.out.println(courseName);
		System.out.println(courseFee);
	}
	
	static void authenticate(String username, String password) {
		if(username=="Admin" && password=="1234") {
			System.out.println("Logged in");
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter the Course Id");
			int id= s1.nextInt();
			
			s1.nextLine();
			System.out.println("Enter Course Name");
			String name=s1.nextLine();
			
			System.out.println("Enter Course Fees");
			int fees=s1.nextInt();
			
			Course c1=new Course();
			c1.courseid=id;
			c1.courseName=name;
			c1.courseFee=fees;
			
			c1.displayCourseDetails();
			
			
			s1.close();
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}

}
