package generic;

import java.io.Serializable;

public class Rice extends Eat implements Serializable {

    int kcal;               // 칼로리
    String kindValue;       // 음식 종류 (쌀)

    public Rice(int kcal, String kindValue) {
        super(kcal, kindValue);
    }


}
