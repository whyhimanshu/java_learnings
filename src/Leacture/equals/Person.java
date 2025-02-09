package Leacture.equals;

import java.util.Objects;

public class Person {
    private int age;
    private String name;
    private String id;

    public Person(int age, String name, String id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)){
            return false;
        }
        Person per = (Person) obj; //typecast the same object which needs to be compared with
        return per.name.equals(name) &&
                per.age == age &&
                per.id.equals(id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, id);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
