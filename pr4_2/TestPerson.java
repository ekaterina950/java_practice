public class TestPerson {
    public static void main(String[] args) {
        Person ppl1 = new Person();
        Person ppl2 = new Person("Oleg", 19);

        ppl2.move();
        ppl2.talk();
    }
}
