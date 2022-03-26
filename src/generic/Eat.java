package generic;


public class Eat {

    int kcal;
    String kindValue;

    public Eat(int kcal, String kindValue) {
        this.kcal = kcal;
        this.kindValue = kindValue;
    }


    // Generic 1개 Argument
    public <T extends Eat> void printEat(T genericT) {
        System.out.println(genericT.kcal);
        System.out.println(genericT.kindValue);
    }  
    
    // Generic 2개의 Argument
    public <T extends Eat, V> void printDoubleParamEat(T genericT, V genericT2) {

        System.out.println(genericT.kcal);
        System.out.println(genericT.kindValue);

        System.out.println(genericT2);
    }
}
