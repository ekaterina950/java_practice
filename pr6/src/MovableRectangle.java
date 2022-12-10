public class MovableRectangle implements Movable {
    MovablePoint bottomRight;
    MovablePoint topLeft;
    public MovableRectangle(int x1, int y1, int x2,  int y2, int xSpeed, int ySpeed) {
        bottomRight=new MovablePoint(x2,y2,xSpeed,ySpeed);
        topLeft=new MovablePoint(x1,y1,xSpeed,ySpeed);
    }


    public String toString() {
        return
                "topLeft=" + topLeft+
                        ", bottomRight=" + bottomRight
                ;
    }


    public void moveUp() {
        bottomRight.moveUp();
        topLeft.moveUp();
    }


    public void moveDown() {
        bottomRight.moveDown();
        topLeft.moveDown();
    }


    public void moveLeft() {
        bottomRight.moveLeft();
        topLeft.moveLeft();
    }


    public void moveRight() {
        bottomRight.moveRight();
        topLeft.moveRight();
    }
}
