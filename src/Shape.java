public class Shape {
    public String shape;
    public String color;
    public String size;
    public Shape(String _shape, String _color, String _size){
        shape = _shape;
        color = _color;
        size = _size;
    }

    public  String toString(){
        String n = "shape: " + shape + "\n" + "color: " + color + "\n" + "size: " + size ;
        return n;
    }
}
