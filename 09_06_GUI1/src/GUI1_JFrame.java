import javax.swing.*;
import java.awt.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        //창
        JFrame frame = new JFrame("참이름");
        //창 크기
        frame.setPreferredSize(new Dimension(400,200));
        //창 위치
        //창을 가운데로 하려면 - ((화면 가로 - 창 가로)/2 , (화면 세로 - 창 세로)/2 )
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int 창w = 400;
        int 창h = 200;
        int 화w = screenSize.width;
        int 화h = screenSize.height;

        frame.setLocation((화w - 창w)/2,(화h - 창h)/2);

        //여러개 넣을 수 있는 주머니 ?
        JPanel panel = new JPanel();
        //글씨
        JLabel lable = new JLabel("아싸 어쩌다 금요일");
        //버튼
        JButton button = new JButton("오예!");

        //창에 끼워넣기
        panel.add(lable);
        panel.add(button);
        frame.add(panel);


        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}