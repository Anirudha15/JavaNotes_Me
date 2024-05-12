
// 89. Write a method concatenate Strings that takes variable arguments 
// of String type and concatenates them into a single string.

package CollectionAndGenerices;

public class Q89VarArgs {

    public static void main(String[] args) {
        System.out.println(Concatenate("Anirudha"));
        System.out.println(Concatenate("Anirudha","Shinde"));
        System.out.println(Concatenate("Anirudha","Mayuri"));
    }
    
    public static String Concatenate(String...strs){
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
