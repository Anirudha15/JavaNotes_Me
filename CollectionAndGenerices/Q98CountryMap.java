/* 
98. Create a Map where the keys are country names (as String) 
and the values are their capitals (also String). Populate the 
map with at least five countries and their capitals. Write a 
program that prompts the user to enter a country name 
and then displays the corresponding capital, if it exists in 
the map.

*/


package CollectionAndGenerices;

import java.util.*;

public class Q98CountryMap {
    
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "New Delhi.");
        countryMap.put("SirLanka", "Columbo.");
        countryMap.put("China", "Beijing.");
        countryMap.put("Bangladesh", "Dhaka.");
        countryMap.put("Nepal", "Kathmandu.");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Country name: ");
        String country = input.next();
        input.close();
        if(countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s", country
            ,countryMap.get(country));

        }else{
            System.out.println("Sorry We dont know the capital..");
        }

    }
}
