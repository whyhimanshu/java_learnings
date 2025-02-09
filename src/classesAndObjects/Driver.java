package classesAndObjects;

public class Driver {

    public static void main(String[] args) {
        Car myBMWi7 = new Car("BMWi7-BaseModel",25000000);
        myBMWi7.addFuel(10);
        myBMWi7.drive();
        System.out.println("Your Leacture.tostring Model: "+myBMWi7.model); //With help of constructors
        System.out.println("Price:"+myBMWi7.price+" INR");



        System.out.println("Current Fuel is: "+myBMWi7.currentFuelinLitres);
    }
}

