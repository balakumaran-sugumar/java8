package com.kumaran.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java_Lambda_2 {

    public static void main(String[] args){
        Comparator<String> compareStrings = (String str1,String str2) -> {
              return str2.length() - str1.length();
        };
        List<String> patternList = Arrays.asList("*", "**","***", "*****", "****");
        patternList.sort(compareStrings);
        System.out.println(patternList);
    }
}


