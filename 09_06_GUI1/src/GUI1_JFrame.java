import javax.swing.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        //창
        JFrame frame = new JFrame("참이름");
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