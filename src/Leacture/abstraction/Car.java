package Leacture.abstraction;

public class Car extends Vehicle {

    public Car() {
        super(4); // super k constructor m value dalni pdti h to maintain workflow
    }
    @Override
    public void getSetGo() {
        System.out.println("Movin....");
    }

    @Override
    public void makeStartSound() {
        System.out.println("Burrr...!!");
    }
    @Override
    public void startVehicle(){
        System.out.println("Car started.");
    }

}
