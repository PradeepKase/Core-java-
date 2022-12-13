package day3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap();
		map.put(0,0);
		map.put(3,9);
		map.put(1,1);
		map.put(2,4);
		
//		map.clear();
//		for(int i=0; i<6; i++) {
//			map.put(i,i*2);
//		}
		
		System.out.println(map);
		
//		map.forEach((K,V)->System.out.println(K+"->"+V));
		
//		map.keySet()
//		.forEach(key-> System.out.println(key +"->"+ map.get(key)));
		
	}

}
