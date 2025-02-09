package Leacture;

public class callByReference {
    public static void main(String[] args) {
        point p1 = new point(2,3);
        System.out.println("first: "+p1);
        move(p1);
        System.out.println("now first: "+p1);
    }


    public static void move(point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }
    public static class point {
        int x,y;
        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }
}
