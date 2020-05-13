package org.test.parallelStream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void checkPerformance(int numberOfTimes){
        for (int i=0;i<numberOfTimes;i++){
            sum_parallel_stream();
            sum_seq_stream();
        }
    }

    public static int sum_seq_stream(){
        return IntStream.rangeClosed(1,100000).sum();
    }
    public static int sum_parallel_stream(){
        return IntStream.rangeClosed(1,100000).sum();
    }
    public static void main(String[] args) {
     //   System.out.println(checkPerformance(ParallelStreamExample::sum_parallel_stream);
        System.out.println(sum_seq_stream());
        System.out.println(Runtime.getRuntime().availableProcessors());

    }
}
