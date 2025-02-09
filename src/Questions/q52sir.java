package Questions;
public class q52sir {
    public static void main(String[] args) {
        Course1 st1 = new Course1("Java Course");
        st1.enrollStudent("Himanshu Verma");
        st1.unenrollStudent("Himanshu Verma");
        Course1.setMaxCapacity(100);

    }
}

class Course1 {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrolledStudents;

    Course1(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        Course1.maxCapacity = maxCapacity;
        System.out.println("Maximum capacity is "+maxCapacity);
    }

    void enrollStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        System.out.println("Student added");
        enrollments++;
    }

    void unenrollStudent(String studentName) {
        System.out.println("Student removed");
        //method to remove element from Leacture.array.
        enrollments--;
    }

}
