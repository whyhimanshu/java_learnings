package Questions.q81;

public class testEquals {
    public static void main(String[] args) {
        Person p1 = new Person(19,"Himanshu");
        Person p2 = new Person(19,"Himanshu");
        if (p1.equals(p2)){
            System.out.println("Equals");
        }
    }
}
