package Leacture.abstraction;

public class TestAbstraction {
    //Vehicle v1 = new Vehicle(4); cant be created as vehicle is abstract class
    public static void main(String[] args) {

        Car c1 = new Car();
        //c1.commute();
        c1.startVehicle();

    }
}
