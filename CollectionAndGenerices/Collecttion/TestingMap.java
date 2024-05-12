package CollectionAndGenerices.Collecttion;

import java.util.*;

public class TestingMap {
    public static void main(String[] args) {
        //  refernce 
        Map<String, Integer> map = new HashMap<>();
        map.put("prashant", 29);
        map.put("Anirudha",56);
        map.put("Anil",24);
        map.put("Ankush",21);

        System.out.println(map.size());
        System.out.println(map.get("Anirudha"));
        // System.out.println(map.containsValue("Anushka"));
        System.out.println(map.containsKey("Anirudha"));
        System.out.println(map.remove("Anil"));
        System.out.println(map.size());

        // for iteration to display all key value pair
        for(String key: map.keySet()){
            System.err.printf("%s : %s\n", key,map.get(key));
        }
    }
}
