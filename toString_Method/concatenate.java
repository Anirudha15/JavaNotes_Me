
// 71 Concatenate and convert two string, concatenate them, and convert the result to uppercase.



package toString_Method;

class concatenate {
    
    public static void main(String[] args) {
        
        String firstName = "Anirudha";
        String lastName = "Shinde";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
    }

}
