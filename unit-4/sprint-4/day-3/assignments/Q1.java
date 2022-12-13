package day3;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> stateandcapital=new HashMap<>();
		stateandcapital.put("Karnatak", "Bengaluru");
		stateandcapital.put("Telangana", "Hydrabad");
		stateandcapital.put("Andrapradesh","Amaravati");
		stateandcapital.put("Goa","Panaji");
		stateandcapital.put("Maharashtra","Mumbai");
		
		System.out.println(stateandcapital);
		
		stateandcapital.forEach((k,v)->System.out.println(k+"->"+v));
		
	}

}
