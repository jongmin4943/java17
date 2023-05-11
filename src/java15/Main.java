package java15;

public class Main {
    public static void main(String[] args) {
        executeString();


    }

    private static void executeString() {
        String json = """
                {
                    "name" : "종민",
                    "email" : "jongmin4943@byulsoft.com"
                }""";

        String json2 = """
                {\
                "name" : "종민",\
                "email" : "jongmin4943@byulsoft.com"\
                }\
                """;
        System.out.println("--------------------------");
        System.out.println("json = " + json);
        System.out.println("--------------------------");
        System.out.println("json2 = " + json2);
        System.out.println("--------------------------");


        final String myName = "name: $s".formatted("Jongmin");
        System.out.println("myName = " + myName);
    }
}
