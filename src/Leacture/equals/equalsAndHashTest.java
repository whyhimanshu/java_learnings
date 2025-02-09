package Leacture.equals;

public class equalsAndHashTest {
    public static void main(String[] args) {
        Person p1 = new Person(19,"Himanshu Verma","001");
        Person p2 = new Person(19,"Himanshu Verma","001");

//        if (p1 == p2){
//            System.out.println("Equals");
//        } it will give not equals as objects can not be compared by double equals
        // we have to define our own equals in person class
        if (p1.equals(p2)){
            System.out.println("Equals");
        }
        else {
            System.out.println("Not equals.");
        }
    }
}
