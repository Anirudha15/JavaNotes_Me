

// 78 Define a student class with fileds like name and age and use tostring to print student details

package toString_Method;

class studentToString {

     String name;
    int age;
    String rollNumber;
    String house;

    // constructor
    public  studentToString(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    // toString
    @Override
    public String toString() {
        return "Student Details: { name: " + name + ", age: " + age + ", rollNumber: " + rollNumber + ", house: " + house + "}";
    }

    public static void main(String[] args) {
        studentToString stu1 = new studentToString(name:"Anirudha", age,30,rollNumber, "001", house, "White");
        System.out.println(stu1);
    }
}
