package day2;

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 One o1= new One();
		System.out.println("One");
		try {
		System.out.println(1/0);
		}
		catch(Exception exception){
			System.out.println("this 1 is not devide by 0");
		}
		System.out.println("three");
	}

}
