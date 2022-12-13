package question_4;

import java.util.HashMap;
import java.util.Map;

public class Plants {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("Cactus", 300);
            map.put("MoneyPlant", 200);
            map.put("PalamaTree" , 500);
            map.put("core", 500);
            map.put("tamotottree", 400);

        System.out.println(map);
        System.out.println("iterating over map");

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("key= "+ entry.getKey() + "value" + entry.getValue());
        }

    }

}
