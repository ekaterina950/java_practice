public class Magazine implements Printable{
    String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Name of magazine: "+name);
    }
    public static void PringMagzines(Printable[] printables){
        for(Printable a:printables){
            if (a instanceof Magazine){
                a.print();
            }
        }
    }

}

