package com.kumaran.java;

//New package "java.util.function"
//Rich set of functional interface

// 4 Categories
   // * Supplier - returns an object, does not take any argument <>
   // * Consumer - consumes an object but doesnt return anything <T t>
   // * BiConsumer - consumer two objects which can be different <T t, U u>
   // * Predicate - take object and returns boolean <T t>
   // * BiPredicate - takes two objects and returns boolean <T t, U u>
   // * Function - takes one function and returns a function <T t, R r>
   // * BiFunction - take two function and returns a function <T t, U u, R r>

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Java_Lambda_3 {

    public static void main(String ... args){

        /*//Here we are not mentioning the type of parameter in the argument
        Comparator<String> compare = (s1, s2) -> {
            return Integer.compare(s1.length(),s2.length());
        };
        */

        //Method Reference
        Consumer<String> consume = System.out::println;

        Comparator<Integer> compareNumbers = Integer::compare;

        List<Integer> compareNumberList = Arrays.asList(1,100,400,10,20);
        compareNumberList.sort(compareNumbers);

        consume.accept("PRINTING METHOD REFERENCE ************************************* STARTS ");

        for(Integer num1 : compareNumberList)
            consume.accept(num1.toString());

        consume.accept("PRINTING METHOD REFERENCE ************************************* ENDS");

        consume.accept("\nFOR EACH EXAMPLE ************************************* STARTS ");
        //and equivalent is
        compareNumberList.forEach(System.out::println);

        consume.accept("FOR EACH EXAMPLE ************************************* ENDS ");

        consume.accept("\nPREDICATE ************************************* STARTS ");
        //example of Predicate
        Predicate<String> p1 = s1 -> s1.length() < 20;
        if(p1.test("Balakumaran")){
            consume.accept("First Condition is true");
        }

        Predicate<String> p2 = s2 -> s2.length() > 6;
        if(p2.test("Bala")){
            consume.accept("Second Condtion is true");
        }

        Predicate<String> p3 = p1.and(p2);

        if(p3.test("Bala"))
            consume.accept("Both the conditions hold true");
        else
            consume.accept("One of the condition fails");

        // Example of isEquals predicate
        Predicate<String> p4 = Predicate.isEqual("Ganesh");

        if(p4.test("Ganesh1")){
            consume.accept("The strings are same ...");
        }else{
            consume.accept("The strings are not same");
        }

        consume.accept("PREDICATE ************************************* ENDS ");



    }

}
