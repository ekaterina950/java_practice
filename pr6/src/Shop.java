import java.util.Vector;

public class Shop implements Printable {
    private Vector<Computer> arrComp=new Vector<>();
    void add(Computer computer){
        arrComp.add(computer);
    }
    boolean delete(String name){
        for (Computer comp:arrComp){

            if (comp.getName().equals(name)){
                arrComp.remove(comp);
                return true;
            }
        }
        return false;
    }
    void findComp(String name){
        for (Computer comp:arrComp){

            if (comp.getName().equals(name)){
                comp.print();
                return;
            }
        }
        System.out.println("Компьютер не найден");
    }


    @Override
    public void print() {
        for (Computer comp:arrComp){
            comp.print();
        }
    }
}
