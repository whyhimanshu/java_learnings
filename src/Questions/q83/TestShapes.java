package Questions.q83;

public class TestShapes {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Square s1 = new Square(5);
        System.out.printf("The area of circle is %.2f and square is %.2f",c1.calculateArea(),s1.calculateArea());
    }
}
