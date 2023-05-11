package java9.privateInterface;

public class Main {
    public static void main(String[] args) {
        PrivateInterface privateInterface = new ImplClass();

        PrivateInterface.callStaticPublic();

        privateInterface.callDefaultAndPrivate();

        privateInterface.callDefaultAndPublic();

        privateInterface.callPublic();
    }
}
