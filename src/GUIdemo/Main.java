package GUIdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static void vytvorGUI() {
        JFrame okno = new JFrame("Moje okno");

        JButton button1 = new JButton("Prve");
        JButton button2 = new JButton("Druhe");
        JCheckBox checkBox1 = new JCheckBox();
        JTextArea area = new JTextArea();
        area.setPreferredSize(new Dimension(250,200));
        JLabel label1 = new JLabel("Zobraz");
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(100,30));

        JPanel northPanel = new JPanel();
        JPanel westPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel southPanel = new JPanel();

        northPanel.setBackground(Color.MAGENTA);
        northPanel.add(button1);
        northPanel.add(button2);

        westPanel.setBackground(Color.YELLOW);
        westPanel.add(label1);
        westPanel.add(checkBox1);

        southPanel.setBackground(Color.BLUE);
        southPanel.add(textField);

        centerPanel.setBackground(Color.GREEN);
        centerPanel.add(area);

        okno.getContentPane().setLayout(new BorderLayout());
        okno.getContentPane().add(northPanel,BorderLayout.NORTH);
        okno.getContentPane().add(southPanel,BorderLayout.SOUTH);
        okno.getContentPane().add(centerPanel,BorderLayout.CENTER);
        okno.getContentPane().add(westPanel,BorderLayout.WEST);

        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setPreferredSize(new Dimension(800,600));
        okno.pack();
        okno.setLocationRelativeTo(null);

        button1.addActionListener(new PrveActionListener());
        button2.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,area.getText(),"Surprise",JOptionPane.ERROR_MESSAGE);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::vytvorGUI);
    }
}
