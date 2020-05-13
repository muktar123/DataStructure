package org.test.lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside run");
            }
        };
        new Thread(runnable).start();

        Runnable runnableLambda = () -> {
            System.out.println("Inside run lambda 1");
        };
        new Thread(runnableLambda).start();
//OR
        Runnable runnableLambda1 = () -> System.out.println("Inside run lambda 2");
        new Thread(runnableLambda1).start();
//OR
        new Thread(() -> System.out.println("inside run lambda 3")).start();


    }
}



