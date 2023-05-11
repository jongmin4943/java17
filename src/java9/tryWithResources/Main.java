package java9.tryWithResources;

public class Main {
    public static void main(String[] args) {
        CloseableClass temp = new CloseableClass();
        try (temp) {
            System.out.println("hi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}