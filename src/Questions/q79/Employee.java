package Questions.q79;

public class Employee {
    private String name;
    private int age;
    private int sal;

    public Employee(int age, String name, int sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }
    String getEmpDetails(){
        return "Employee Details: Name: "
        +name+", Age: "+age+" ,Salary: "+sal;
    }

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

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
