
/*  79. Define a class Employee with private attributes (like name, age,
and salary), public methods to get and set these attributes, and a
package-private method to displayEmployeeDetails. Create
another class in the same package to test access to the
displayEmployeeDetails method.

*/

//  Both Employee and TestEmployee is made in same package

package Encapsulation;

public class Employee {
    
    private String name;
    private int age;
    private int salary;


    // Constructor
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    // get and set methods to get and set values 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    String getEmployeeDetails(){
        return"EmployeeDetails: Name:" + name +", Age:"+ age +", Salary:" + salary;
    }



}
