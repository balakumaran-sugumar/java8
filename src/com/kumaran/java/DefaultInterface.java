package com.kumaran.java;

import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
public interface DefaultInterface<E> {

    void printFuntionalData();

    Consumer<String> consumer = System.out::println;

    default void defaultFunctionalInterface(List<E> listData){
        for (E e : listData){
            consumer.accept(e.toString());
        }
    }


}
