package Questions.q86;

public class Car extends Vehicle {
    @Override
    void service() {
        //super.service();parents call
        System.out.println("Car is getting serviced"); //override method
    }
}
