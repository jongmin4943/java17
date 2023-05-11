package java16.utilMethods;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;


class A {
    public void helloA() {
        System.out.println("hello A!");
    }
}

class B extends A {
    public void helloB() {
        System.out.println("hello B!");
    }
}

public class Main {
    public static void main(String[] args) {
//        executeStream();

        executePatternMatching();

    }

    private static void executePatternMatching() {
        Object obj = new B();

        if(obj instanceof A a) {
            a.helloA();
        }

        if(obj instanceof String s) {
            System.out.println(s.strip());
        }

        if(obj instanceof B b) {
            b.helloB();
        }

        if(!(obj instanceof BigDecimal bigDecimal)) {
            return;
        }

        final BigDecimal added = bigDecimal.add(BigDecimal.ONE);
        System.out.println("added = " + added);
    }

    private static void executeStream() {
        //        final List<Integer> list2 = Stream.of(1, 2, 3, 4, 5).filter(n -> n < 3).collect(Collectors.toList());
        final List<Integer> list = Stream.of(1, 2, 3, 4, 5).filter(n -> n < 3).toList();

        System.out.println("list = " + list);


        final List<Object> list1 = Stream.of("morning", "work", "lunch", "work", "bye")
                .mapMulti((n, consumer) -> {
                    consumer.accept("1." + n);
                    consumer.accept("2." + n);
                    consumer.accept("3." + n);
                }).toList();

        System.out.println("list1 = " + list1);
    }
}
