package java8lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableLambda {

    public static void main(String[] args) {

        final List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        Callable<Integer> callableObject = () -> {
            int result = integers.stream().mapToInt(i -> i.intValue()).sum();
            return result;
        };

        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Integer> future = es.submit(callableObject);
        Integer result = 0;
        try {
            result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Sum: " + result);
    }

}
