package Questions;

public class q52 {
    public static void main(String[] args) {
        Course st1 = new Course("Himanshu Verma");
        Course st2 = new Course("Himanshu Verma");
        Course st3 = new Course("Himanshu Verma");
        st1.enrollSt();
        st1.unEnrollSt();
        st2.enrollSt();
        st2.unEnrollSt();
        st3.enrollSt();
        st3.unEnrollSt();


        Course.setMaxCap(100);
    }
}
class Course {
    String courseName;
    int enrolledSt=0;
    static int maxSt;
    boolean enrollSt;
    String stName;
    static {
        maxSt = 100;
    }
    {
        enrolledSt++;
    }
    Course(String stName){
        this.stName = stName;
    }
    void enrollSt() {
        if (enrolledSt <= maxSt) {
            if (enrollSt) {
                System.out.println("You have already been " +
                        "enrolled previously." + stName);
            } else {
                this.enrollSt = true;
                System.out.println("You have been enrolled successfully.");
            }
        }
        else {
            System.out.println("Limit of students exceeded, Course1 is full.");
        }
    }
    void unEnrollSt() {
        if (enrollSt) {
                enrollSt = false;
                System.out.println("You have been un-enrolled successfully.");
            } else {
                System.out.println("Please enroll first.");
            }
        }
    static void setMaxCap(int maxSt){
        Course.maxSt= maxSt; //access static variable using classname.var-name
    }
}
