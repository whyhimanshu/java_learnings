package Leacture;

public class tostring {
    int noOfWheels;
    int doors;
    String color;
    String model;
    String company;

    public tostring(int noOfWheels, int doors, String color, String model, String company) {
        this.noOfWheels = noOfWheels;
        this.doors = doors;
        this.color = color;
        this.model = model;
        this.company = company;
    }

//    @Override
//    public String toString() {
//        return "Leacture.tostring{" +
//                "noOfWheels=" + noOfWheels +
//                ", doors=" + doors +
//                ", color='" + color + '\'' +
//                ", model='" + model + '\'' +
//                ", company='" + company + '\'' +
//                '}';
//    }
    // more efficient way to print toString()


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Leacture.tostring{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", doors=").append(doors);
        sb.append(", color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        tostring BMW = new tostring(4,2,"BLCK","I7","bmw");
        System.out.println(BMW);
    }
}
