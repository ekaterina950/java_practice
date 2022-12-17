import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.*;

public class Picture {
    static BufferedImage image; //обраюотка и управление данными картинки
    public static void main(String[] args) {
        JFrame frame =new JFrame("Task 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //выход
        try{

            image = ImageIO.read(new File("/Users/mamonovaekaterina/Desktop/2pic.png"));

        } catch (Exception e){
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
        JPanel panel =new JPanel(){
            @Override
            protected void paintComponent(Graphics g) { //прорисовка компонента
                super.paintComponent(g);
                g.drawImage(image,0, 0, this);// где будет находитмя в окне
            }
        };

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(616,400);
        frame.setLocationRelativeTo(null);
    }
}

