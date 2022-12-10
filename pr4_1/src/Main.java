public class Main {
    public enum Seasons {
        SUMMER(18) {
            public String getDescription() {
                return "Warm season.";
            }
        },
        AUTUMN(3.7), WINTER(-10), SPRING(4.3);
        private double avgTemp;
        Seasons(double temp) {
            this.avgTemp = temp;
        }
        public double getAvgTemp() {
            return this.avgTemp;
        }
        public String getDescription() {
            return "Cold season.";
        }
    };

    static public void out(Seasons seasons) {
        switch (seasons) {
            case SUMMER:
                System.out.println("I love summer!");
                break;
            case WINTER:
                System.out.println("I love winter!");
                break;
            case SPRING:
                System.out.println("I love spring!");
                break;
            case AUTUMN:
                System.out.println("I love autumn!");
                break;
        }
    }

    public static void main(String[] args) {
        Seasons myfav = Seasons.SUMMER;
        Main.out(myfav);
        System.out.println("");

        Seasons[] seasons = Seasons.values();
        for (Seasons s : seasons) {
            System.out.println(s + ": average temperature: " + s.getAvgTemp() + ". " + s.getDescription());
        }
    }
}