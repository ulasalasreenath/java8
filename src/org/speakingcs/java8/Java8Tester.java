package org.speakingcs.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8Tester {

    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("SREENATH");
        names1.add("ULASALA");
        names1.add("ALTISOURCE");
        names1.add("APPLE");
        names1.add("IPHONE");

        sortCollection(names1);

    }

    private static void sortCollection(List<String> names1) {

        Collections.sort(names1, (str1, str2) -> {
            return str1.compareTo(str2);
        });

        names1.forEach(name -> {
            System.out.println(name);
        });

    }
}
