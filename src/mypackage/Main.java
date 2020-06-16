package mypackage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

//=============================================================================
//        Runnable runnable1 = () -> {
//            String stringToSplit = "Let's split this text into an array";
//            String[] fragments = stringToSplit.split(" ");
//            for (String fragment : fragments){
//                System.out.println(fragment);
//            }
//        };
//=============================================================================


//=============================================================================
//        Supplier<String> iLoveJava = () -> {
//            return "I love Java";
//        };
//        String supplierResult = iLoveJava.get();
//        System.out.println(supplierResult);
//=============================================================================


//=============================================================================
//        Function <String,String> everySecondChar = s -> {
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < s.length(); i++){
//                if (i % 2 == 1){
//
//                    returnVal.append(s.charAt(i));
//                }
//            }
//            return returnVal.toString();
//        };
//        System.out.println(everySecondChar.apply("1234567890"));
//=============================================================================


//=============================================================================
//        List<String> names = Arrays.asList(
//                "john", "jack", "emily", "bob", "rob", "oliver", "jamie", "charlie", "harry", "jacob"
//        );
//=============================================================================


//=============================================================================
//        names
//                .stream()
//                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
//                .sorted()
//                .forEach(System.out::println);
//=============================================================================


//=============================================================================
//        long numOfNamesWithA = names
//                .stream()
//                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
//                .filter(name -> name.startsWith("A"))
//                .count();
//
//        System.out.println(numOfNamesWithA);
//=============================================================================

    }

//=============================================================================
//    public static String everySecondChar (Function <String,String> func) {
//        return func.apply("1234567890");
//    }
//=============================================================================





}
