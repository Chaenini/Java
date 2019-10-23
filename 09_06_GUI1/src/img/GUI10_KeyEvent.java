package img;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI10_KeyEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JTextField textField = new JTextField(10);
        JLabel label = new JLabel("-");
        JTextField textField1 = new JTextField(10);

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode () == keyEvent.VK_LEFT){
                    textField1.setText("왼쪽 키 눌림");
                    textField.setText(" ");
                }
                else if (keyEvent.getKeyCode () == keyEvent.VK_RIGHT){
                    textField1.setText("오른쪽 키 눌림");
                }
                else if (keyEvent.getKeyCode () == keyEvent.VK_UP){
                    textField1.setText("위쪽키 눌림");
                }
                else if (keyEvent.getKeyCode () == keyEvent.VK_DOWN){
                    textField1.setText("아래쪽 키 눌림");
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                if (keyEvent.getKeyChar() == 'q'){
                    System.out.println("뀨뀨");
                }
            }
        });

        panel.add(textField);
        panel.add(label);
        panel.add(textField1);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
