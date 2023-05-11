package java16.record;

record Employee(String company, String department) implements Movable {
    public static final String BYULSOFT = "byulsoft";

    // Canonical 생성자 자동 생성된다.
//    Employee(final String company, final String department) {
//        this.company = company;
//        this.department = department;
//    }

    // 다른 생성자에서는 Canonical 생성자를 이용해야만 한다.
    public Employee(String name) {
        this(BYULSOFT, getDepartment(name));
    }

    // interface 사용 가능
    @Override
    public void move() {

    }

    // method 선언 가능
    private static String getDepartment(String name) {
        return BYULSOFT + "-" + name;
    }
}

interface Movable {
    void move();
}