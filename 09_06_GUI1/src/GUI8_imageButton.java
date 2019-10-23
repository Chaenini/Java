import javax.swing.*;
import java.awt.*;

public class GUI8_imageButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        ImageIcon img1 = new ImageIcon(GUI8_imageButton.class.getResource("img/Instagram_icon.png"));
        ImageIcon img1_edit = new ImageIcon(img1.getImage().getScaledInstance(img1.getIconWidth()/10,img1.getIconHeight()/10, Image.SCALE_DEFAULT));
        JLabel jl1 = new JLabel(img1_edit);

        ImageIcon img2 = new ImageIcon(GUI8_imageButton.class.getResource("img/facebook.jpg"));
        ImageIcon img2_edit = new ImageIcon(img2.getImage().getScaledInstance(img2.getIconWidth()/6,img2.getIconHeight()/6, Image.SCALE_DEFAULT));
        JLabel jl2 = new JLabel(img2_edit);

        panel.add(jl1);
        panel.add(jl2);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}