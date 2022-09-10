import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pitomnik {
    ArrayList<String> sobaki = new ArrayList<String>();
    public void adder(String nameObj){
        sobaki.add(nameObj);
    }
    public ArrayList<String> getter(){
        return sobaki;
    }
}
