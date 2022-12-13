package inheritance;

public class Pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b1 = new parrot();
		b1.fly();
		
		parrot p=(parrot)b1;
		p.sing();
		
	}
	
}


class Bird{
	
	public void fly() {
		System.out.println("Bird is flying");
	}


}

class parrot extends Bird{
	@Override
	public void fly() {
		System.out.println("I am flying");
	}
	public void sing(){
		System.out.println("I am Singing");
		}
}