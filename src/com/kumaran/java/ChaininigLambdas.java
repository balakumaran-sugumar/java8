package com.kumaran.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChaininigLambdas {

    public static void main(String ... args){

        List<String> list1 = Arrays.asList("One", "two", "three", "four", "five");

        List<String> list2 = new ArrayList<>();

        Consumer<String> c1 = System.out::println;
        //c1.accept("**** First List : list1 : " + list1.toString() + " ****");

        Consumer<String> c2 = list2::add;

        //adding the contents of list1 to list2
        list1.forEach(c1.andThen(c2));

        //Print the second list
        c1.accept("Second list : list2 : " + list2.toString() + " ****");


    }
}
