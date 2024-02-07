package GUIdemo;

import javax.swing.*;
import java.awt.*;

public class Main {

    private static void vytvorGUI() {
        JFrame okno = new JFrame();
        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setPreferredSize(new Dimension(800,600));
        okno.pack();
        okno.setLocationRelativeTo(null);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::vytvorGUI);
    }
}
