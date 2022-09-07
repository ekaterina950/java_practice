public class Myach {
    public int diametr;
    public String game;
    public int ves;

    public Myach(int diametr, String game,int ves){
        this.diametr = diametr;
        this.game = game;
        this.ves = ves;
    }
    public String getter(){
        String s = "diametr: " + diametr +"\n" + "game: " + game + "\n" + "ves: " + ves;
        return s;
    }
}
