import javax.swing.*;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

public class HolaMundo {

    public static void main(String[] args) {
        //String name = JOptionPane.showInputDialog(null, "Hola mundillo, soy Jose");
        String name = JOptionPane.showInputDialog(null, "Hello!!!, What's your name?", "Welcome!", PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Ciao! " +name, "Benvenuti!",INFORMATION_MESSAGE);
    }
}

