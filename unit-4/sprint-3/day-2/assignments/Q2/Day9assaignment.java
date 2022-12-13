package Q2;
public class Day9assaignment {
	public static void main(String[] args) {
		//create an array of Animal class with size 3
		int num=3;
		Animal [] arr=new Animal[num];
		
		arr[0]=new Dog();
		arr[1]=new Cat();
		arr[2]=new Tiger();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].eat();
			arr[i].walk();
			arr[i].makeNoise();
		}
		//initialise all 3 elements of this Animal class with
		//Dog, Cat and Tiger class object.
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.
	}
}

class Animal{
	public void makeNoise(){
		System.out.println("Animal making Noise");
		}
		public void eat(){
		System.out.println("Animal is eating");
		}
		public void walk(){
		System.out.println("Animal is walking");
		}

}

class Dog extends Animal{
	@Override
	public void makeNoise(){
		System.out.println("Barking...");
	}
}
class Cat extends Animal{
	@Override
	public void makeNoise(){
	System.out.println("Meaw...");
	}
}
class Tiger extends Animal{
	@Override
	public void makeNoise(){
	System.out.println("Raoring...");
	}
}