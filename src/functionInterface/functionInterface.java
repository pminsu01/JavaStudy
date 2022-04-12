package functionInterface;

import generic.Meat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class functionInterface {

    public static void main(String[] arg){

/*      PredicateEx predicateEx = new PredicateEx();
        predicateEx.PredicateRunMethod();*/


/*      ConsumerEx consumerEx = new ConsumerEx();
        consumerEx.consumerMethod();*/

        List<Meat> meatList = Arrays.asList(new Meat(400,"한우"), new Meat(500,"돼지"), new Meat(300,"닭"), new Meat(150,"닭가슴살"));
        FunctionEx functionEx = new FunctionEx();
        functionEx.FunctionMethod(meatList, functionEx.paymentInterFaceByMeat());

        meatList.stream().map(functionEx.paymentInterFaceByMeat()).forEach(System.out::println);


    }




}
