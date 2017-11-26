package org.speakingcs.java8;

public class LambdaScopeTest {

    final static String salutation = "Hello! ";
    static String salutation2 = "Hi ";
    static int a = 0;

    public static void main(String[] args) {
        salutation2 += "Hello ";
        // no errors, even though we change salutation2
        GreetingService greetingService = message1 -> {
            System.out.println(salutation + message1);
            System.out.println(salutation2 + message1);
        };
        greetingService.sayMessage("Sreenath");

        for(; a < 10; a++)
        {
            new Thread(() -> {
                System.out.println("Current time is "+Thread.currentThread().getName() +" " + System.currentTimeMillis());
                System.out.println(Thread.currentThread().getName() + " " + a);
            }).start();
        }

        //int k = 0;
        /*for(int i = 0; i < 10; i++)
        {
            int k = i;
            new Thread(() -> {
                System.out.println(k);
            }).start();
        }*/
    }
}
