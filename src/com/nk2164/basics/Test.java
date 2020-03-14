package com.nk2164.basics;

import java.util.ArrayList;
import java.util.List;
 
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(51);
        list.add(25);
        list.add(15);
        list.add(25);
        list.remove(Integer.valueOf('3')); // CHAR '3' == 51 
 
        System.out.println(list); // Will print [25, 15, 25]
    }
}