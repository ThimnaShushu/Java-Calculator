import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator implements ActionListener {
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10]; // holds all calculator buttons
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, eqButton, delButton, clrButton;
    JPanel panel;

    Font myFont = new Font("Serif", Font.BOLD, 30);

    double num1 = 0, num2 = 1, result = 0;
    char operator; // holds the operation

    // constructor
    calculator() {
        frame = new JFrame("Math Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        frame.setVisible(true);

    }

    // action performed method with action listener
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        calculator calc = new calculator();
    }
}