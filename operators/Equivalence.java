public class Equivalence {
    static void show(String desc, Integer n1, Integer n2) {
        System.out.println(desc + ":");
        System.out.printf(
                "%d==%d %b %b%n", n1, n2, n1 == n2, n1.equals(n2));
    }

    @SuppressWarnings("deprecation")
    public static void test(int value) {
        Integer i1 = value;
        Integer i2 = value;
        show("Automatic", i1, i2);
        // 在Java9及更新版本中已被弃用的旧方式;
        Integer r1 = new Integer(value);
        Integer r2 = new Integer(value);
        show("new Integer()", r1, r2);
        // java9及更新版本中提倡的方式
        int x = value;
        int y = value;
        // x.equals(y); // 无法编译
        System.out.println("Primitive int:");
        System.out.printf("%d==%d %b%n", x, y, x == y);
    }

    public static void main(String[] args) {
        test(127);
        test(128);
    }
}
