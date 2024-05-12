

// 93. Create a program that reverses the elements of a List and prints 
// the reversed list.

package CollectionAndGenerices;

import java.util.Arrays;
import java.util.*;



public class Q93ListReverse {
    
    public static void main(String[] args) {
        
    
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,76);
        System.out.println(list);
        reverse(list);
        System.out.println("Reverse list is: " + list);
    }

    public static void reverse(List<Integer>list){
        // using reverse which java gives us
        Collections.reverse(list);
        
    //     for(int i =0;i< list.size() /2;i++){
    //         ListSwapping.swap(list,i,list.size()-1-i);
    //     }
    }

}
