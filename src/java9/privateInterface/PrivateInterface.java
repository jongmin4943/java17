package java9.privateInterface;

public interface PrivateInterface {
    void callPublic();
    static void callStaticPublic() {
        System.out.println("public static!");
    }
    default void callDefaultAndPrivate() {
        System.out.println("default!");
        callPrivate();
    }

    default void callDefaultAndPublic() {
        System.out.println("default!");
        callPublic();
    }

    private void callPrivate() {
        System.out.println("private!");
    }

    private static void callStaticPrivate() {
        System.out.println("private static!");
    }

}
