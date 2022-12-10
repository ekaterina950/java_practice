public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center=new MovablePoint(x,y,xSpeed, ySpeed);
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "radius=" + radius + ", center=" + center;

    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
