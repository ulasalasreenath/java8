package org.speakingcs.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTester {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("Print all numbers");

        eval(list, num -> true);
        System.out.println("Print even numbers");
        eval(list, num -> num%2 == 0);
        System.out.println("Print odd numbers");
        eval(list, num -> num%2 == 1);
        System.out.println("Print numbers greater than 3");
        eval(list, num -> num > 3);

    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate)
    {
        list.forEach(num -> {
            if(predicate.test(num))
            {
                System.out.println(num + " ");
            }
        });
    }
}
