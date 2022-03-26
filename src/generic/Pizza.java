package generic;

import java.io.Serializable;



public class Pizza extends Eat implements Serializable {

    int kcal;           // 칼로리
    String kindValue;   // 음식 종류 (피자)

    public Pizza(int kcal, String kindValue) {
        super(kcal,kindValue);
        this.kcal =kcal;
        this.kindValue = kindValue;
    }

    public int getPizzaKcal() {
        return this.kcal;
    }

    public String getPizzaValue() {
        return this.kindValue;
    }


}
