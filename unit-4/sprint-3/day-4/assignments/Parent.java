package practiceset;
import java.util.Scanner;
abstract public class Parent {
	
public static void main(String[] args) {
	Child c1=new Child();
	Scanner s=new Scanner(System.in);
	System.out.println("give positive num from 1 to 10");
	
	int number=s.nextInt();
	c1.num=number;
	
}	
	final int num=8;
abstract void method1();
	

final void method2() {
	
}
void method3() {
	System.out.println("i am humen");
}
}

final class Child extends Parent{
	@Override
	void method1() {
		System.out.println("this is overriden method");
	}
	
//	void method2() {
//		               we cannot overide in this child class because we are using final keyword
//	}
	@Override
	void method3() {
		System.out.println("i am bad humen");
	}
	
	
	void method4() {
		System.out.println("this is method4");
	}
	
}