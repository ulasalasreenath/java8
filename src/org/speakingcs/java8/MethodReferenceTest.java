package org.speakingcs.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        names.add("Sreenath");
        names.add("Ulasala");
        names.add("Altisource");
        names.add("RealDoc");

        // static method reference
        names.forEach(System.out::println);
    }
}
