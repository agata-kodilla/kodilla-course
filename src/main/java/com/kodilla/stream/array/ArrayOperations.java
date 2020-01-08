package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers) {
        IntStream.range(numbers[0], numbers[numbers.length-1])
                .forEach(n -> System.out.println(n));

        return OptionalDouble.of(IntStream.range(numbers[0], numbers[numbers.length-1]).average().orElseGet(() -> {
            System.out.println("-1");
            return 0;
        }));
    }
}
