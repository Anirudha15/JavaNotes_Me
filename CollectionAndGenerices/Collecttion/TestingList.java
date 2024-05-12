package CollectionAndGenerices.Collecttion;
import java.util.*;
public class TestingList {
    
    // This is list
    // Generics are run time interview  questions

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Anirudha");
        strList.add(" Shinde");
        strList.add(1," Dinesh");
        // strList.add(54); This will give errror
        // strList.remove(0);
        System.out.println(strList.get(0));
        if(strList.contains("Shinde")){
            System.out.println(strList.indexOf("Shinde"));
        }
        for(int i = 0; i< strList.size();i++){
            System.out.println(strList.get(i));
        }
        for (String str: strList){
            System.out.print(str);
        }
    }
}
