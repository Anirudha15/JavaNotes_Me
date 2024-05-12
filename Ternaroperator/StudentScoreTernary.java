
// 56. Create a program to based on a student score categorize as "high","mooderate","Low" using the ternary operator
// eg High for scores > 80, moderate for 50-80, low for <50


import java.util.Scanner;
class StudentScoreTernary {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Student Scor\n");
        System.out.println("Please enter your marks ");
        int marks = input.nextInt();
        String category = marks> 80 ? "High" : (marks>50?"moderate" : "Low");
        System.out.println("Your Category is: " + category);

        input.close();
    }

}