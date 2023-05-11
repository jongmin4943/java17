package java14;
import java.util.Random;

class Empty {
    private String name;

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------Collections-------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(executeSwitch());
        }

        executeNullException();
    }

    private static String executeSwitch() {
        return switch (new Random().nextInt(10)) {
            case 1 -> "1이다";
            case 2 -> "2이다";
            case 3 -> "3이다";
            case 4 -> "4이다";
            default -> "?";
        };
    }

    private static void executeNullException() {
        Empty empty = new Empty();

        System.out.println(empty.getName().toLowerCase());
    }
}
