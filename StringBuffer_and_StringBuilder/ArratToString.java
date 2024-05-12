
// 75 Take array of words and concatenate them into a single string using stringBuilder


package StringBuffer_and_StringBuilder;

public class ArratToString {

    public static void main(String[] args) {
        
        String[] arr = new String[]{"This","is", "the", "best", "and", "most", "detailed", "course", "on", "java", "on", "the", "internet"};


        // using stringBuilder
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    
    }

}
