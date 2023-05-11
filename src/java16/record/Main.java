package java16.record;

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("Jongmin", "Yoon");
        FullName fullName2 = new FullName("Jongmin", "Yoon");

        System.out.println("fullName.first() = " + fullName.first());
        System.out.println("fullName.last() = " + fullName.last());
        System.out.println(fullName.withPrefix());

        fullName.print();

        System.out.println(fullName.equals(fullName2));
    }
}
