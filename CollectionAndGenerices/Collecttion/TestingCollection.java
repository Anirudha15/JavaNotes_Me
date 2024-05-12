package CollectionAndGenerices.Collecttion;

// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;



public class TestingCollection {
    
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add( 5);
        numList.add( 2);
        numList.add( 8);
        numList.add( -75);
        // to print the list
        Utility.print(numList);
        // To sort 
        System.out.println("Sort list is");
        Collections.sort(numList);
        Utility.print(numList);
        // to reverse
        System.out.println("Reverse List is: ");
        Collections.reverse(numList);
        Utility.print(numList);

        // Unmodifiable list 
        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
        unmodifiable.add(45);
    }
}
