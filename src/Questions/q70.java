package Questions;

public class q70 {
    int age;
    String name;
    public void getData(int age, String name){
        this.age = age;
        this.name = name;
    }

// or we can make constructor to do it.
//    public q70(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }

// or we can make StringBuilder and use append
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("q70{");
//        sb.append("age=").append(age);
//        sb.append(", name='").append(name).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }

// self made toString() method
    @Override
    public String toString() {
        return "Student Details: { name: "+name
                +", age: "+age+" }";
    }

    public static void main(String[] args) {
        q70 s1 = new q70();
        s1.getData(19,"Himanshu Verma");
        System.out.println(s1);
    }
}
