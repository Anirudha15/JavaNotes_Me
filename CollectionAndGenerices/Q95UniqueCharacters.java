
// 95. Write a program that takes a string and returns the number of 
// unique characters using a Set.



package CollectionAndGenerices;
import java.util.*;

public class Q95UniqueCharacters {
    
    public static void main(String[] args) {
        
    
        Set<Character> unique = new HashSet<>();
        System.out.println("Please enter your string: ");
        Scanner input = new Scanner(System.in);
        String userStr = input.next();
        input.close();
        
        for( char ch: userStr.toCharArray()){
            unique.add(ch);
        }
        
        System.out.printf("Your string has %d unique characters", unique.size());
        // using unique.size() we can find out how many unique charactor our string has.
    }

}
