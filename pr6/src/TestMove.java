import java.util.Scanner;

public class TestMove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Center(x y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Radius: ");
        int r = scanner.nextInt();

        System.out.print("Speed of x and y: ");
        int xSpeed = scanner.nextInt();
        int ySpeed = scanner.nextInt();

        MovableCircle circle = new MovableCircle(x, y, xSpeed, ySpeed, r);
        System.out.println("Circle was created:\n" + circle);

        int numCmd = 1;
        while (numCmd != 0) {
            System.out.println("1 - up\t2 - down\t3 - left\t4 - right\t0 - exit\n");
            System.out.print("type command: ");
            numCmd = scanner.nextInt();
            switch (numCmd) {
                case 1:
                    circle.moveUp();
                    System.out.println(circle);
                    break;
                case 2:
                    circle.moveDown();
                    System.out.println(circle);
                    break;
                case 3:
                    circle.moveLeft();
                    System.out.println(circle);
                    break;
                case 4:
                    circle.moveRight();
                    System.out.println(circle);
                    break;
                default:
                    break;
            }
        }

    }
}
