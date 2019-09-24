import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        String[] fruits={"apple", "banana", "kiwi", "mango", "peach"};
        JComboBox cbox= new JComboBox(fruits);
        cbox.addItem("strawberry");
        cbox.addItem("cherry");

        JLabel labelResult = new JLabel("Result");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String resultString = "";
                resultString += label.getText();
                resultString += button.getText();
                resultString += checkBox1.isSelected();
                resultString += checkBox2.isSelected();
                resultString += radioButton1.isSelected();
                resultString += radioButton2.isSelected();
                resultString += textField.getText();
                resultString += textArea.getText();
                resultString += cbox.getSelectedIndex();
                resultString += cbox.getSelectedItem();
                labelResult.setText(resultString);
            }
        });

        panel.add(label);
        panel.add(button);
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(textField);
        panel.add(cbox);
        panel.add(labelResult);

        frame.add(panel);


        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
