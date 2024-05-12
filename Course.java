
// Desoogn a Course class.
// Instance variables: courseName, enrolledStudent;
// Static variables: maxCapacity, the maximum of student for any course
// Instance method: enrolledStudent(string studentName), unenrollStudent(string studentName)
// static method: setMaxCapacity(int capacity), to set the maximum capacity for course



public class Course {
    
     static int maxCapacity = 100;

    String courseName;

    int enrollments;

    String[] enrolledStudents;


    Course(String courseName){
        this.courseName=courseName;
        enrollments=0;
        this.enrolledStudents = new String[maxCapacity];
    }



    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrolledStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }

    public static void main(String[] args) {
        Course.setMaxCapacity(50);
        
    }


}
