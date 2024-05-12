
// 90. Write a program that sorts a list of String objects in descending 
// order using a custom Comparator.

package CollectionAndGenerices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q90Comparator {
    
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Bear","Lion","Ant","Zebra");
        System.out.println("Original list: " + list);
        sortInDecending(list);
        System.out.println("Decending order list: " + list);
    }

    public static void sortInDecending(List<String> StringList){
        // to sort the list without comparater
        // Collections.sort(StringList);
        // to reverse list in decending order
        // Collections.reverse(StringList);
    
        Collections.sort(StringList, new java.util.Comparator<String>() {
           
            // @Override
            // public int Compare(String s,String t1){
            //     return s.equals(t1);
            // }

        //    Custome Comparator for decending order for list element
            @Override
            public int compare(String s, String t1) {
                
                // TODO Auto-generated method stub
                if(s.equals(t1)){
                    return 0;
                }else if(s.charAt(0)<t1.charAt(0)){
                    return 1;
                }else{
                    return -1;
                }
                // throw new UnsupportedOperationException("Unimplemented method 'compare'");
            }

        });
    }



}
