package day1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZImpl z1=new ZImpl();
		z1.abstrac0();
		z1.defaul0();
//		z1.stati();
		z1.abstrac1();
		z1.defaul1();
		z1.abstrac2();
		X.stati0();
	}

}

interface X{
	void abstrac0();
	default void defaul0() {
		System.out.println("inside Y default");
	}
	static void stati0() {
		System.out.println("inside Y static");
	}
}
interface Y{
	void abstrac1();
	default void defaul1() {
		System.out.println("inside Y default1");
	}
	static void stati1() {
		System.out.println("inside Y static");
	}
}
interface Z extends X,Y{
	void abstrac2();
}
class ZImpl implements Z{
	
	@Override
	public void abstrac0() {
		System.out.println("inside zlmpl abs0");
	}
	@Override
	public void abstrac1() {
		System.out.println("inside zlmpl abs1");
	}
	@Override
	public void abstrac2() {
		System.out.println("inside zlmpl abs2");
	}
	@Override
	public void defaul0() {
		System.out.println("inside Y default0");
	}
}

