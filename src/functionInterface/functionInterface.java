package functionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class functionInterface {

    public static void main(String[] arg){

        List<String> stringList = Arrays.asList("er", "juer", "min", "lg","uplus","mac","iphone");
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 10, 11, 12, 13);



        /*
        * List<String> filtering 메소드
        * 1) List<String> 객체를 filtering 메소드 활용
        * 2) Predicate<String> 함수형 인터페이스 활용
        * 3) Predicate<String> lambda 활용
        * 4) Predicate<String> lambda 표현식그리고 Stream filter 활용
        */

        // List<String> 객체를 filtering 메소드 활용
       // System.out.println(filterString(stringList));

        // Predicate<String> 함수형 인터페이스 활용
        Predicate<String> predicateStringEq =  PredicateStringEq();
        //System.out.println(filter(stringList, predicateStringEq));

        // Predicate<String> lambda 활용
        Predicate<String> predicateStringLambda = (String str) -> str.contains("e");
        //System.out.println(filter(stringList, predicateStringLambda));


        // Predicate<String> lambda 표현식그리고 Stream filter 활용
        stringList.stream().filter(s-> s.contains("e")).forEach(
                System.out::println
        );



        /*
         * List<Integer> filtering 메소드
         * 1) List<Integer> 객체를 filtering 메소드 활용
         * 2) Predicate<Integer> 함수형 인터페이스 활용
         * 3) Predicate<Integer> lambda 활용
         * 4) Predicate<String> lambda 표현식그리고 Stream filter 활용
         */

        // List<Integer> 객체를 filtering 메소드 활용
        //System.out.println(filterInteger(integerList));

        // Predicate<Integer> 함수형 인터페이스 활용
        Predicate<Integer> PredicateIntEq =  PredicateIntEq();
        //System.out.println(filter(integerList, PredicateIntEq));

        // Predicate<Integer> lambda 활용
        Predicate<Integer> predicatIntegerLambda = (Integer num) -> num < 10;
        //System.out.println(filter(integerList, predicatIntegerLambda));


        // Predicate<Integer> lambda 표현식 그리고 Stream filter 활용
        integerList.stream().filter(i-> i<10).forEach(
                System.out::println
        );


    }

    // 10보다 작은지 여부 판별
    public static boolean integerEq(int num){
        return num < 10;
    }

    // 문자열이 "e"를 포함했는지 여부를 판별
    public static boolean stringEq(String str) {
        return str.contains("e");
    }


    // Predicate<String>을 리턴하는 메소드
    // 문자열이 "e"를 포함했는지 여부를 판별
    public static Predicate<String> PredicateStringEq() {
        return new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.contains("e"); // 메소드를 활용할 것인지 객체간 boolean을 판별할지 모르겠지만 무조건 boolean값을 반환해야함.
            }
        };
    }

    // Predicate<Integer>을 리턴하는 메소드
    // 숫자가 10보다 작은지 여부를 판별
    public static Predicate<Integer> PredicateIntEq() {
        return new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                return num < 10;// 메소드를 활용할 것인지 객체간 boolean을 판별할지 모르겠지만 무조건 boolean값을 반환해야함.
            }
        };
    }


    // Input : List<T>
    // Return : List<T>
    // filtering 조건을 만족하는 값들을 List 객체로 Return : filter 메소드 활용
    public static <T> List<T> filterString(List<T> list) {
        List<T> result = new ArrayList<>();
        for( T t: list){
            if(stringEq((String) t)){
                result.add(t);
            }
        }
        return result;
    }

    // Input : List<T>
    // Return : List<T>
    // filtering 조건을 만족하는 값들을 List 객체로 Return : filter 메소드 활용
    public static <T> List<T> filterInteger(List<T> list) {
        List<T> result = new ArrayList<>();
        for( T t: list){
            if(integerEq((Integer) t)){
                result.add(t);
            }
        }
        return result;
    }

    // Input : List<T>, Predicate<T>
    // Return : List<T>
    // Predicate 조건을 만족하는 값들을 List 객체로 Return
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for( T t: list){
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }


    public void abc(){

        Predicate<String> nonEmptyStringPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return !s.isEmpty();
            }
        };

        Predicate<String> nonEMptySTringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmtpy = filter(new ArrayList<>(), nonEMptySTringPredicate);

    }

    public <T> void forEach(List<T> list, Consumer<T> c) {
        for(T t: list){
            c.accept(t);
        }
    }
}
