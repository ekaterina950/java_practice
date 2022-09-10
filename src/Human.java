

/*
2.Создать класс, описывающий тело человека(Human).
Для описания каждой части тела создать отдельные классы(Head, Leg, Hand).
Описать необходимые свойства и методы для каждого класса. Протестировать работу класса Human.*/

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;
    public Human(String colorEyes1,int size11,int legL1, int handL1){
        head = new Head(colorEyes1, size11);
        leg = new Leg(legL1);
        hand = new Hand(handL1);
    }
    public String toString(){
        return "Color eyes: " + head.getterEyes() + "  Size: " + head.getterSize() + "  length leg: " + leg.getterlegL() + "  length hand: " + hand.getterhandL();
    }

    public class Head{
        private String colorEyes;
        private int size1;
        public Head(String colorEyes, int size1){
            this.colorEyes = colorEyes;
            this.size1 = size1;
        }
        public String getterEyes(){
            return colorEyes;
        }
        public int getterSize(){
            return size1;
        }
        public void setterEyes(String colorEyes){
            this.colorEyes = colorEyes;
        }
        public void setterSize(int size1){
            this.size1 = size1;
        }
    }
    public class Leg{
        private int legL;
        public Leg(int legL){
            this.legL=legL;
        }
        public int getterlegL(){
            return legL;
        }
        public void setterlegL(int legL){
            this.legL = legL;
        }
    }
    public class Hand{
       private int handL;
       public Hand(int handL){
           this.handL = handL;
       }
       public int getterhandL(){
           return handL;
       }
       public void setterhandL(int handL){
           this.handL = handL;
       }

    }
}
