import javax.swing.*;
import java.awt.*;

public class GUI2_Components {
    public static void main(String[] args) {
        JFrame frame = new JFrame("component");

        JPanel panel = new JPanel();

        JLabel label = new JLabel("JLabel");

        JButton button = new JButton("JButton");

        JCheckBox checkBox1 = new JCheckBox("JCheckBox1");
        JCheckBox checkBox2 = new JCheckBox("JCheckBox2");

        JRadioButton radioButton1 = new JRadioButton("미성년자");
        JRadioButton radioButton2 = new JRadioButton("성인");
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);

        JTextField textField = new JTextField("JTextField");
        JTextArea textArea = new JTextArea(2, 10);

        String[] fruits={"apple", "banana", "kiwi", "mango", "pear", "peach", "berry"};
        JComboBox cbox= new JComboBox(fruits);
        cbox.addItem("strawberry");
        cbox.addItem("cherry");

        panel.add(label);
        panel.add(button);
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(textField);
        panel.add(cbox);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
