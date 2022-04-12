package functionInterface;

import generic.Meat;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class FunctionEx {


  // T,R : 제네릭 T를 받아서 R을 리턴한다.
  public <T,String> Function<T,String> paymentInterFaceByMeat() {

    return new Function<T, String>() {
      @Override
      public String apply(T t) {

        Meat meat = (Meat) t;

        if(Objects.equals(meat.getKindValue(), "한우")) return (String) "임원 법인카드";
        if(Objects.equals(meat.getKindValue(), "양")) return (String) "팀장 법인카드";
        if(Objects.equals(meat.getKindValue(), "돼지")) return (String) "부가급 나온달 개인카드";
        if(Objects.equals(meat.getKindValue(), "닭")) return (String) "부모님 카드";
        return (String) "개인카드";
      }
    };
  }

  public <T> void FunctionMethod(List<Meat> meatList, Function<T, Object> functionIf) {

        for (Meat meat: meatList) {
          String cardValue = (String) functionIf.apply((T) meat);
          System.out.println(meat.getKindValue() + "을/를 먹을 때에는 " + cardValue +"로 결제해야 한다.");
  }

}



}
