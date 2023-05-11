package java12.stringClass;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        final BigDecimal transform = "20220303".transform(BigDecimal::new);
        System.out.println("transform = " + transform.add(BigDecimal.ONE));
    }
}
