package java10.varType;

public class Main {
//    var c = "c"; // error

    public static void main(String[] args) {
        var a = "A";
        String b = "b";
        System.out.println("a+b = " + a+b);
        System.out.println("a.toLowerCase() = " + a.toLowerCase());
    }
}
