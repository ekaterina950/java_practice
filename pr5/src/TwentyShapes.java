import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class TwentyShapes {
    public static void main(String args[]){
        JFrame frame = new JFrame("Task 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color[] colors = new Color[]{Color.red, Color.blue, Color.yellow, Color.gray, Color.green, Color.pink};
        Random rand = new Random();
        for (int i=0; i<20; i++){
            switch ((int)(Math.random()*2)) {
                case 0:
                    frame.add(new Circle( // создание рандомного круга
                            rand.nextInt(250),
                            rand.nextInt(250),
                            rand.nextInt(50)+50,
                            colors[rand.nextInt(colors.length)]
                    ));
                    break;
                case 1:
                    frame.add(new Rectangle( // создание рандомного прямоугольника
                            rand.nextInt(250),
                            rand.nextInt(250),
                            rand.nextInt(100),
                            rand.nextInt(150),
                            colors[rand.nextInt(colors.length)]
                    ));
                    break;
                default:
                    break;
            }
        }
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(700,700);
    }
}
