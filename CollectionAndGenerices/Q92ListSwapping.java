
// 92. Write a method that swaps two elements in an ArrayList, given 
// their indices.

package CollectionAndGenerices;

import java.util.*;

public class Q92ListSwapping {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println( "Before Swapping: "+ list);
        swap(list, 2, 7);
        System.out.println( "After swapping: "+ list);

    }

    public static void swap(List<Integer> list,int x,int y){

        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y, swap);
    }
}
