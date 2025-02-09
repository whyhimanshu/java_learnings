package Questions.q81;

import java.util.Objects;

public class Person {
    private int age;
    private String name;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Person person)) return false;
//        return age == person.age && Objects.equals(name, person.name);
//    }


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)){
            return false;
        }
        Person per = (Person) obj;
        return per.name.equals(name) &&
                per.age == age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

}
