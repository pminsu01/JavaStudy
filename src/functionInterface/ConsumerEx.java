package functionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {

    public <T> Consumer<T> ConsumerEx() {

        return new Consumer<T>() {
            @Override
            public void accept(T t) {
                if((int) t < 10) System.out.println(t + ": 10보다 작은 수");
                else System.out.println(t + ": 10보다 크거나 같은 수");
            }
        };
    }


    public <T> void forEach(List<T> list, Consumer<T> consumer) {
        for(T t: list){
            consumer.accept(t);
        }
    }

    public void ConsumerMethod(){

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 10, 11, 12, 13, 14);
        forEach(integerList, ConsumerEx());

    }








}
