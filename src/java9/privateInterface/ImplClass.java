package java9.privateInterface;

public class ImplClass implements PrivateInterface {

    @Override
    public void callPublic() {
        System.out.println("call public");
    }

}
