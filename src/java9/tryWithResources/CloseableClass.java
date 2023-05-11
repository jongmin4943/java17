package java9.tryWithResources;

public class CloseableClass implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("close!!");
    }
}
