import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI11_주민번호테스터 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JTextField jm0 = new JTextField(10);
        JLabel label = new JLabel("-");
        JTextField jm1 = new JTextField(10);
        JButton btn = new JButton("TEST");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String jm = jm0.getText() + jm1.getText();
                if (isGood(jm) == true ){
                    label.setText("O");
                } else{
                    label.setText("X");
                }
            }
        });

        panel.add(jm0);
        panel.add(label);

        panel.add(jm1);
        panel.add(btn);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static boolean isGood(String jm) {
        int[] num = {2,3,4,5,6,7,8,9,2,3,4,5};
        int sum = 0;

        for (int i=0; i<jm.length()-1; i++){
            sum += (jm.charAt(i) - '0') * num[i];
        }
//        System.out.println(sum);
        int last = 11 - (sum % 11);

        return (jm.charAt(jm.length()-1)-'0') == last;
    }
}
