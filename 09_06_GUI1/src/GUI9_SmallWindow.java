import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI9_SmallWindow
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton btn1 = new JButton("작은 창 1");
        JButton btn2 = new JButton("작은 창 2");

        JDialog dialog = new JDialog(frame,"다이얼로그",true);
        JLabel lb = new JLabel("레이블");
        dialog.add(lb);
        dialog.setSize(new Dimension(100,200));

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                JOptionPane.showMessageDialog(frame,"당신이 바보라면 확인을 누르세요 ","제목",JOptionPane.INFORMATION_MESSAGE);
//                int select = JOptionPane.showConfirmDialog(null, "당신은 바보입니까 ?");
//                System.out.println(select);
                String name = JOptionPane.showInputDialog(frame, "너의 행님 이름은 ? ");
                System.out.println(name);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dialog.setVisible(true);
            }
        });

        panel.add(btn1);
        panel.add(btn2);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
