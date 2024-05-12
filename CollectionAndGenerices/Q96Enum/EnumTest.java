

//96. Create an enum called Day that represents the days of the 
// week. Write a program that prints out all the days of the 
// week from this enum.

package CollectionAndGenerices.Q96Enum;

public class EnumTest {
    
    public static void main(String[] args) {
        
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.THURSDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SATUARDAY);
        System.out.println(Day.SUNDAY);

        // short cut for display above values 
        for(Day day: Day.values()){
            System.out.println(day);
        }
    }
}
