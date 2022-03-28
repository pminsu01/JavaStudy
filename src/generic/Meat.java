package generic;

public class Meat {

  int kcal;           // 칼로리
  String kindValue;   // 음식 종류 (고기)

  public Meat(int kcal, String kindValue) {
    this.kcal = kcal;
    this.kindValue = kindValue;
  }

  public int getKcal(){
    return this.kcal;
  }

  public String getKindValue(){
    return this.kindValue;
  }
}
