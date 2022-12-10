

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("left-up coordinate(x y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("right-down coordinate(x y): ");
        int x1 = scanner.nextInt();
        int y1= scanner.nextInt();

        System.out.print("speed of  x and y (1 number): ");
        int xSpeed = scanner.nextInt();
        int ySpeed = xSpeed;

        MovableRectangle rectangle=new MovableRectangle(x,y,x1,y1,xSpeed,ySpeed);
        System.out.println("Created circle:\n" + rectangle);

        int numCmd = 1;
        while (numCmd != 0) {
            System.out.println( "1 - up\t2 - down\t3 - left\t4 - right\t0 - exit\n");
            System.out.print("Type command: ");
            numCmd = scanner.nextInt();
            switch (numCmd) {
                case 1: {
                    rectangle.moveUp();
                    System.out.println(rectangle);
                    break;
                }
                case 2: {
                    rectangle.moveDown();
                    System.out.println(rectangle);
                    break;
                }
                case 3: {
                    rectangle.moveLeft();
                    System.out.println(rectangle);
                    break;
                }
                case 4: {
                    rectangle.moveRight();
                    System.out.println(rectangle);
                    break;
                }
                default : {}
            }
        }

    }
}
