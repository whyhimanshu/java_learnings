package Questions;

public class q72 {
    double radiusInMm;
    //Radius entering is compulsory
    q72(double radius){
        this.radiusInMm = radius;
    }
    double calCirc(){
        double circ = Math.PI * 2 * radiusInMm;
        return circ;
    }
    double calArea(){
        return Math.PI * Math.pow(radiusInMm,2);
    }

// using a toString() method to write everything.
    @Override
    public String toString() {
        return "Circle Properties: Radius: "+radiusInMm+", Circumference: "+calCirc()+
                ", Area: "+calArea()+" ";
    }

    public static void main(String[] args) {
        q72 c1 = new q72(4);
        System.out.println(c1);

    }
}
