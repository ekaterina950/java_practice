public class Comp {
    private int diagonal;
    private String podsvetka;

    public Comp(int diagonal, String podsvetka){
        this.diagonal = diagonal;
        this.podsvetka = podsvetka;
    }
    public String getPodsvetka(){
        return podsvetka;
    }
    public int getDiagonal(){
        return diagonal;
    }
    public void setPodsvetka(String podsvetka){
        this.podsvetka = podsvetka;
    }
    public void setDiagonal(int diagonal){
        this.diagonal = diagonal;
    }

    @Override
    public String toString(){
        String n = "diagonal: " + diagonal + "\n" + "podsvetka: " + podsvetka + "\n";
        return n;
    }
}
