package java16.record;

public record FullName(String first, String last) {

    static final String PREFIX = "my name is ";
    public void print() {
        System.out.println(first + " " + last);
    }

    public String withPrefix() {
        return PREFIX + first + " " + last;
    }

}
