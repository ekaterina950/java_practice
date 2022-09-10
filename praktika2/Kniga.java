public class Kniga {
    public int chisloStr;
    public String nazvanie;
    public boolean isElectronic;

    public Kniga(int chisloStr, String nazvanie, boolean isElectronic){
        this.chisloStr = chisloStr;
        this.nazvanie = nazvanie;
        this.isElectronic = isElectronic;
    }
    public String getter(){
        String l = "chislo stranits: " + chisloStr + "\n" + "nazvanie: " + nazvanie + "\n" +
                "isElectronic book: " + isElectronic ;
        return l;
    }
}
