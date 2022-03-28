package functionInterface;

import generic.Meat;
import java.util.Objects;
import java.util.function.Function;

public class FunctionEx {


  public <T,String> Function<T,String> FunctionEx() {

    return new Function<T, String>() {
      @Override
      public String apply(T t) {

        Meat meat = (Meat) t;

        if(Objects.equals(meat.getKindValue(), "한우")) return (String) "임원 법인카드";
        if(Objects.equals(meat.getKindValue(), "양")) return (String) "팀장 법인카드";
        if(Objects.equals(meat.getKindValue(), "돼지")) return (String) "부가급 나온달 개인카드";
        if(Objects.equals(meat.getKindValue(), "닭")) return (String) "개인카드";
        return (String) "굶자";
      }
    };
  }
}
