import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericEx {

    public static void main(String[] arg){

//        IntPrintGeneric intPrintGeneric  = new IntPrintGeneric(400);
//        intPrintGeneric.GenericPrint();
//
//        DoublePrintGeneric doublePrintGeneric  = new DoublePrintGeneric(29.99);
//        doublePrintGeneric.GenericPrint();
//
//        StringPrintGeneric stringPrintGeneric  = new StringPrintGeneric("LGU+");
//        stringPrintGeneric.GenericPrint();

        PrintGeneric<Pizza> pizzaPrintGeneric = new PrintGeneric(new Pizza(500, "고르곤 졸라 피자"));
        pizzaPrintGeneric.GenericPrint();

        PrintGeneric<Rice> ricePrintGeneric = new PrintGeneric(new Rice(300,"갓 지은 햇반"));
        ricePrintGeneric.GenericPrint();


        String genericTString = doubleParam("minsupark", "erjuer01");
        System.out.println("Generic T의 값은 : " + genericTString);

        List<String> sampleList = new ArrayList<>();

        System.out.println();
        List<String> stringList = Arrays.asList("2022년" ,"새해 복", "많이 받았으면" ,"좋겠네");
        questionList(stringList);



    }

//    static class IntPrintGeneric {
//
//        int genericNum;
//
//        public IntPrintGeneric(int genericNum){
//            this.genericNum = genericNum;
//        }
//
//        public void GenericPrint(){
//            System.out.println("GenericNum : " + genericNum);
//        }
//
//    }
//
//    static class DoublePrintGeneric{
//        Double genericDouble;
//
//        public DoublePrintGeneric(Double genericDouble){
//            this.genericDouble = genericDouble;
//        }
//
//        public void GenericPrint(){
//            System.out.println("GenericNum Double : " + genericDouble);
//        }
//
//    }
//
//    static class StringPrintGeneric {
//
//        String genericString;
//
//        public StringPrintGeneric(String genericString){
//            this.genericString = genericString;
//        }
//
//        public void GenericPrint(){
//            System.out.println("GenericNum String : " + genericString);
//        }
//
//    }

    // class and interface 순서대로
    static class PrintGeneric <T extends Eat & Serializable> {

        T genericT;

        public PrintGeneric(T genericT) {
            this.genericT = genericT;
        }

        public void GenericPrint(){

            System.out.println("===== Generic Print =====");
            System.out.println("클래스명 : " + genericT.getClass().getName());
            System.out.println("칼로리 : " + genericT.kcal);
            System.out.println("음식의 종류 : " + genericT.kindValue);
            System.out.println();
        }
    }

    private static <T, V> T doubleParam(T genericT, V genericV) {
        System.out.println(genericT);
        System.out.println(genericV);

        return genericT;
    }


    private static void questionList(List<?> list){
        System.out.println(list);
    }

}
