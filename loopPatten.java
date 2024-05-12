import java.util.Scanner;


// Pattern *
class loopPattern{


    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number of rows:");
            int rows = input.nextInt();
            printFirstPattern(rows);
        }
    }
    public static void printFirstPattern(int maxrows) {
        int rows = 1;
        while (rows <= maxrows) {
            int i = 0;
            while (i < rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows++;   
        }
    }
    

    // public static void printFirstPattern(int maxrows) {
    //     int rows = 0;
    //     while (rows < maxrows) {
    //         System.out.print("*");
    //         int i = 0;
    //         while (i < rows) {
    //             System.out.print(" *");
    //             i++;
    //         }
    //         System.out.println();
    //         rows++;   
    //     }


    // }


}