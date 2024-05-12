package Encapsulation;

public class TestEmployee {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee("Anirudha", 22, 25000);
        Employee emp2 = new Employee("Shivam", 23, 50000);

        System.out.println(emp.getEmployeeDetails());
        emp.setName("Gunu");
        System.out.println(emp.getEmployeeDetails());
        System.out.println(emp2.getEmployeeDetails());
        System.out.println("Age of Shivam " + emp2.getAge());

    }
}
