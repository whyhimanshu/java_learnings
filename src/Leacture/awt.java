package Leacture;
import java.awt.*;
class awt extends Frame {
    awt(){
        Button b1 = new Button("Click here");
        b1.setBounds(100,100,80,30);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        add(b1);
    }

    public static void main(String[] args) {
        awt a1 = new awt();
    }

}
