package CollectionAndGenerices.Collecttion;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    
    public static void main(String[] args) {
        
        Set<String> names = new HashSet<>();
        System.out.println(names.add(" Anirudha"));
        System.out.println(names.add(" Shinde"));
        System.out.println(names.add(" Placed"));
        Utility.print(names);

        System.out.println(names.add(" Anirudha"));
        System.out.println(names.size());
        Utility.print(names);
        System.out.println(names.contains(" Anirudha"));
        System.out.println(names.remove(" Anirudha"));
        Utility.print(names);
        System.out.println(names.remove(" Anirudha"));
    }
}
