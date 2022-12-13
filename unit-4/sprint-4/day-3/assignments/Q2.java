package day3;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentBean s1=new StudentBean(1,"paddu",500);
		Map<s1,String> map=new HashMap<>();
//		s1.setRoll(1);
//		System.out.println(s1.getRoll());
//		s1.setName("paddu");
//		System.out.println(s1.getName());
//		s1.setMark(500);
//		System.out.println(s1.getMark());
	}

}
class StudentBean{
	 int roll;
	 String name;
	 int mark;
	 StudentBean(int r,String n,int m){
		 this.roll=r;
		 this.name=n;
		 this.mark=m;
	 }
//	public int getRoll() {
//		return roll;
//	}
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getMark() {
//		return mark;
//	}
//	public void setMark(int mark) {
//		this.mark = mark;
//	}
	
}