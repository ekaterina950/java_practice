
import javax.swing.*;
import java.awt.*;
public class Animated {
    public static void main(String[] args) {
        String path="/Users/mamonovaekaterina/Desktop/gif.gif";
        JFrame frame = new JFrame("Gif");
        frame.setSize(400,455);
        JLabel jlabel =new JLabel("");
        Image image =Toolkit.getDefaultToolkit().createImage(path);
        ImageIcon imageIcon= new ImageIcon(image);// создание картинки
        imageIcon.setImageObserver(jlabel);//наблюдатель изображения для гиф
        jlabel.setIcon(imageIcon);
        frame.add(jlabel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //выход

    }
}
