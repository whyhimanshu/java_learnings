package Questions.q84;

public abstract class Bird implements Flyable{
//    @Override
//    public void fly(){
//        System.out.println("Flyin...fadd fadd fadd");
//    } //we can also define in this class or eagle class
    private final String breed;

    public Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
