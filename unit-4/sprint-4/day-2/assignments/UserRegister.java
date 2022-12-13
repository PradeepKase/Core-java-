package day2;
import java.util.Scanner;
public class UserRegister {
        static void registerUser(String name,String country) throws InvalidCountryException{
		if(country.equals("india"))
			throw new InvalidCountryException("registe successfull");
		else {
			System.out.println("other country student not allowed");
		}
        }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name and country");
		String name=s.nextLine();
		String country=s.nextLine();
		try {
		registerUser(name,country);
		}
		catch(InvalidCountryException e) {
			System.out.println(e);
		}
		s.close();
	}

}
class InvalidCountryException extends Exception{
	InvalidCountryException(){
		
	}
	InvalidCountryException(String message){
		super(message);
	}
}
