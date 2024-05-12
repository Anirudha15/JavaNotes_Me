package forLoop;

public class forEachLoop {
    
    public static void main(String[] args) {
        
        String[] array = new String[]{
            "Ram " ,"Sham ","Anirudha ","Mayur "
        };
        printArray(array);
        printArrayForEach(array);
    
    }

    // for loop
    public static void printArray(String[] array){
        for( int i=0; i<array.length;i++){
            System.out.print(array[i]);
        }
    }

        // forEach loop example

    public static void printArrayForEach(String[] array){
        for( String name:array){
            System.out.print(name);
        }
    }
}
