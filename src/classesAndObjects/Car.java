package classesAndObjects;
import java.util.*;

public class Car {
    int wheels;
    String color;
    float maxSpeed;
    float currentFuelinLitres;
    int noOfSeats;
    String model;
    int price;
    //CONSTRUCTOR
    Car(String model,int currPrice){
        color = "Black";
        maxSpeed = 150;
        noOfSeats = 4;
        wheels = 4;
        currentFuelinLitres=3;
        this.model=model;
        price = currPrice;
    }
    public void addFuel(float fuel){
        this.currentFuelinLitres+=fuel;

    }
    public void drive(){
        if(currentFuelinLitres==0){
            System.out.println("You may want to refill your car, fuel's out.");
        }
        else if(currentFuelinLitres<=5){
            System.out.println("Leacture.tostring is in Reserve mode, kindly refill.");
            currentFuelinLitres--;
        }
        else{
            System.out.println("Leacture.tostring is driving!!");
                     currentFuelinLitres--;
        }
    }


}

