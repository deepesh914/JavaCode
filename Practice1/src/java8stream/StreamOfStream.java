package java8stream;

import java.util.stream.Stream;

public class StreamOfStream {

    public static void main(String[] args) {
        // Group of values
        Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
        s.forEach(System.out::println);
        // For arrays also
        Double[] d = { 10.0, 10.1, 10.2, 10.3, 10.4 };
        Stream<Double> st = Stream.of(d);
        st.forEach(System.out::println);

    }

}
