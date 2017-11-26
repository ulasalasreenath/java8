package org.speakingcs.java8;

interface MathOperation
{
    int operation(int a, int b);
}

interface GreetingService
{
    void sayMessage(String message);
}

public class LambdaTest {

    static MathOperation mathOperation = (int a, int b) -> a+b;
    static MathOperation subtraction = (a, b) -> a-b;
    static MathOperation multiplication = (int a, int b) -> {
        return a*b;
    };
    static MathOperation division = (int a, int b) -> a/b;


    public static void main(String[] args) {
        System.out.println("addition of 5, 6 is "  + mathOperation.operation(5,6));
        System.out.println("subtraction of 5, 6 is "+ subtraction.operation(5, 6));
        System.out.println("multiplication of 5, 6 is " + multiplication.operation(5, 6));
        System.out.println("division of 5, 6 is " + division.operation(5, 6));

        GreetingService greetingService1 = message -> System.out.println("Hello " + message);
        GreetingService greetingService2 = message -> System.out.println("Hello Hello " + message);

        greetingService1.sayMessage("Sreenath");
        greetingService2.sayMessage("Ulasala");


    }

}
