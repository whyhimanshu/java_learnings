package Leacture.abstraction;

public abstract class Vehicle implements Transport {
    private int wheels;

//    @Override
//    public void getSetGo() {
//        System.out.println("Movin....");
//    }

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public abstract void makeStartSound();
    public void commute(){
        System.out.println("Runnin......");
    }
    public void startVehicle(){
        System.out.println("Vehicle started.");
    }
}
