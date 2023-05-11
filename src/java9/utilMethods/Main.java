package java9.utilMethods;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------Optional------------------");
        executeOptional();

        System.out.println("------------------IntStream------------------");
        executeIntStream();

        System.out.println("------------------StreamFn------------------");
        executeStreamFn();

        System.out.println("------------------Optimization------------------");
        executeOptimization();

        System.out.println("------------------Collections------------------");
        executeCollections();

        System.out.println("------------------Arrays------------------");
        executeArrays();

    }

    private static void executeOptional() {
        getOptionalInteger()
                .or(Optional::empty)
                .or(() -> Optional.of(10))
                .or(() -> Optional.of(20))
                .ifPresentOrElse(
                        integer -> System.out.println("integer = " + integer),
                        () -> System.out.println("null value!")
                );

        /*
            getOptionalInteger().ifPresent((1)->{})
            getOptionalInteger().orElse(()->{})
            따로 하던걸 한번에 할 수 있게 변경
         */
    }

    private static void executeIntStream() {
        IntStream
                .iterate(2, i -> i < 20, i -> i * i)
                .forEach(System.out::println);
    }

    private static void executeStreamFn() {
        System.out.println("------------------takeWhile------------------");
        Stream.of(1, 2, 3, 4, 5, 6, 1).takeWhile(i -> i <= 3).forEach(System.out::println);
        Stream.of(1, 6, 5, 2, 3, 4, 1).takeWhile(i -> i <= 3).forEach(System.out::println);
        System.out.println("------------------dropWhile------------------");
        Stream.of(1, 2, 3, 4, 5, 6, 1).dropWhile(i -> i <= 3).forEach(System.out::println);
        Stream.of(1, 6, 5, 2, 3, 4, 1).dropWhile(i -> i <= 3).forEach(System.out::println);

    }

    private static void executeOptimization() {
        // 자체 최적화
        final long count = Stream.of(1, 6, 5, 2, 3, 4, 1)
                .map(integer -> {
                    System.out.println("integer = " + integer);
                    return integer;
                })
                .count();
        System.out.println("count = " + count);
    }

    private static void executeCollections() {
        List<String> immutableList = List.of("one", "two", "three");
        Set<String> immutableSet = Set.of("one", "two", "three");
        Map<Integer, String> immutableMap = Map.of(1, "one", 2, "two", 3, "three");

        System.out.println("immutableList = " + immutableList);
        System.out.println("immutableSet = " + immutableSet);
        System.out.println("immutableMap = " + immutableMap);
    }

    private static void executeArrays() {
        int[] list1 = new int[]{1,2,3,4};
        int[] list2 = new int[]{1,2,3,4};
        int[] list3 = new int[]{1,2,4,3};

        System.out.println("Arrays.compare(list1, list2)");
        System.out.println(Arrays.compare(list1, list2));

        System.out.println("Arrays.compare(list1, list3)");
        System.out.println(Arrays.compare(list1, list3));

        System.out.println("Arrays.mismatch(list1, list3)");
        System.out.println(Arrays.mismatch(list1, list3));
    }

    private static Optional<Integer> getOptionalInteger() {
        return Optional.empty();
    }
}
