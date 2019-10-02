import javax.swing.*;
import java.awt.*;

public class GUI6_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        BorderLayout bl = new BorderLayout();
        //테두리
        panel.setLayout(bl);

        JLabel lbTitle = new JLabel("아 마 스 빈");
        JTextArea txList = new JTextArea(1,30);
        JPanel eastPanel = new JPanel();
        int sum = 10000;
        JLabel lbsum = new JLabel("총 금액 : "+sum);
        JButton btpayment = new JButton("결제하기");

        eastPanel.add(lbsum);
        eastPanel.add(btpayment);
        panel.add(lbTitle,BorderLayout.NORTH);
        panel.add(txList,BorderLayout.CENTER);
        panel.add(eastPanel,BorderLayout.EAST);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
