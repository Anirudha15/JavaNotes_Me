
// 91. Use the Collections class to count the frequency of a particular 
// element in an ArrayList.

package CollectionAndGenerices;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class Q91Frequency {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,4,6,4,1,7,8,1);

        // Shows how many time element is repeated in list
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list, 7));
        System.out.println(Collections.frequency(list, 8));
    }

}
