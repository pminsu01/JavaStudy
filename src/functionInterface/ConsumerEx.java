package functionInterface;

import generic.Eat;
import generic.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {

    public <T> Consumer<T> consumerEx() {

        return new Consumer<T>() {
            @Override
            public void accept(T t) {
                if((Integer) t < 10) System.out.println(t + ": 10보다 작은 수");
                else System.out.println(t + ": 10보다 크거나 같은 수");
            }
        };
    }

    public <T> Consumer<T> consumerLambdaEx() {

        return t -> {
            if((Integer) t < 10) System.out.println(t + ": 10보다 작은 수");
            else System.out.println(t + ": 10보다 크거나 같은 수");
        };
    }


    public <T> Consumer<T> pizzaConsumerEx() {

        return new Consumer<T>() {
            @Override
            public void accept(T t) {

                Pizza pizza = (Pizza) t;
                if(pizza.getPizzaKcal() > 500) System.out.println(pizza.getPizzaValue() + ", "+ pizza.getPizzaKcal() + "kcal : 맛있으니 조금만 더 먹어도 되는 피자");
                else System.out.println(pizza.getPizzaValue() + ", "+ pizza.getPizzaKcal() + "kcal : 칼로리가 낮으니 조금만 더 먹어도 되는 피자");

            }
        };
    }

    public <T> Consumer<T> pizzaConsumerLambdaEx() {

        return t -> {

            Pizza pizza = (Pizza) t;
            if(pizza.getPizzaKcal() > 500) System.out.println(pizza.getPizzaValue() + ", "+ pizza.getPizzaKcal() + "kcal : 맛있으니 조금만 더 먹어도 되는 피자");
            else System.out.println(pizza.getPizzaValue() + ", "+ pizza.getPizzaKcal() + "kcal : 칼로리가 낮으니 조금만 더 먹어도 되는 피자");

        };
    }


    public <T> void forEachByConsumer(List<T> list, Consumer<T> consumer) {
        for(T t: list){
            consumer.accept(t);
        }
    }

    public <T> void forEachByMethod(List<T> list) {
        for(T t: list){
            printNumberSize((Integer) t);
        }
    }


    public void consumerMethod(){

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 10, 11, 12, 13, 14);
        List<Pizza> pizzaList = Arrays.asList(new Pizza(300, "콤비네이션 피자"), new Pizza(250,"야채 피자"), new Pizza(600,"치즈 피자"), new Pizza(550, "고구마 피자"));
        forEachByConsumer(integerList, consumerEx());

        System.out.println("====================");
        forEachByMethod(integerList);

        // pizza Consumer
        forEachByConsumer(pizzaList, pizzaConsumerEx());


        // stream에서의 consumer 객체 활용
        // integerlist consumer accept 메소드 적용
        integerList.stream().forEach(consumerEx());

        System.out.println("=======================");

        // pizzaList consumer accept 메소드 적용
        pizzaList.stream().forEach(pizza -> {
            if(pizza.getPizzaKcal() > 500) System.out.println(pizza.getPizzaValue() + ", "+ pizza.getPizzaKcal() + "kcal : 맛있으니 조금만 더 먹어도 되는 피자");
            else System.out.println(pizza.getPizzaValue() + ", "+ pizza.getPizzaKcal() + "kcal : 칼로리가 낮으니 조금만 더 먹어도 되는 피자");
        });



    }

    public void printNumberSize(Integer num) {
        if(num < 10) System.out.println(num + ": 10보다 작은 수");
        else System.out.println(num + ": 10보다 크거나 같은 수");
    }








}
