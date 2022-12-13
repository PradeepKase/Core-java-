package day3;
import java.util.Set;
import java.util.HashSet;
public class Set_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set =new HashSet();
		set.add(2);
		set.add(5);
		set.add(5);
		set.add(4);
		set.remove(5);
		System.out.println(set);
	//	adding items in set by iterating on it from 0 to 16
		for(int i=0; i<16; i++) {
			set.add(i);
		}
		System.out.println(set);

//onother way of iterating over set
		set.forEach(item-> System.out.println(item));
		
		System.out.println(set.isEmpty());
//		set.clear();
		
		System.out.println(set);
	}

}
