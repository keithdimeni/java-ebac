package com.keith.lambdas;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;

public class TesteLambdas {
    public static void main(String[] args) {

        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };
        System.out.println(intBinaryOperator.applyAsInt(2, 7));
        System.out.println();

        BiFunction<Integer, Integer, Integer> biFunction = (Integer a, Integer b) -> {
            return a + b;
        };
        Integer resultBiFunction = biFunction.apply(10, 13);
        System.out.println( resultBiFunction);
        System.out.println();

        Long longResult = calcular(2L, 5L, (  Long v1, Long v2) -> {
            return v1 + v2;
        });
        System.out.println(longResult);
        System.out.println();

        Runnable hello_world = () -> System.out.println("Hello  World");
        Consumer<String> stringConsumer = (String s) -> {
            System.out.println(s);
        };
        stringConsumer.accept("Value");


    }

    public static Long calcular(Long t, Long u, BiFunction<Long, Long, Long> function) {
        return function.apply(t, u);
    }
}
