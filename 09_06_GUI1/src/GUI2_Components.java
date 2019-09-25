import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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

        //초기값 세팅
        radioButton1.setSelected(true);
        checkBox1.setSelected(true);
        textField.setText("전화번호를 입력하세요.");

        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {
                if (textField.getText().equals("전화번호를 입력하세요.")) {
                    textField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent focusEvent) {
                if (textField.getText().equals("")){
                    textField.setText("전화번호를 입력하세요.");
                }
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //값 가져오기
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

        ItemListener il = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                //체크박스 1이 체크 되었을때 실행
                if (e.getSource() == checkBox1){
                    System.out.println("JCheckedBox1 : "+checkBox1.isSelected());
                }
                //체크박스 2이 체크 되었을때 실행
                else if (e.getSource() == checkBox2){
                    System.out.println("JCheckedBox2 : "+checkBox2.isSelected());
                }
                else if (e.getSource() == radioButton1){
                    System.out.println("미성년자 : "+radioButton1.isSelected());
                }
                else if (e.getSource() == radioButton2){
                    System.out.println("성인 : "+radioButton2.isSelected());
                }
                else if (e.getSource() == cbox){
                    System.out.println(cbox.getSelectedItem());
                }
            }
        };

        checkBox1.addItemListener(il);
        checkBox2.addItemListener(il);
        radioButton1.addItemListener(il);
        radioButton2.addItemListener(il);
        cbox.addItemListener(il);

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
