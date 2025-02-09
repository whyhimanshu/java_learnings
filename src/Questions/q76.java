package Questions;

public class q76 {
    // immutable class
    final String name;
    final String company;
    final int doors;
    final int windows;
    public q76 (String name, String company, int doors, int windows) {
        this.company = company;
        this.name = name;
        this.doors = doors;
        this.windows = windows;
        // this.doors++;  cant do as doors has been assigned initially and it was final
    }
}
