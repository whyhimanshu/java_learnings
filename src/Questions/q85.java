package Questions;

public class q85 {
    int add(int x,int y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
    double add(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        q85 o1 = new q85();
        System.out.println(o1.add(1,2));
        System.out.println(o1.add(1,2,3));
        System.out.println(o1.add(1.4,1.5));
    }
}
