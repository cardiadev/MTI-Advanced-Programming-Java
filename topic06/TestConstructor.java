package topic06;

public class TestConstructor {
    int var1;
    double var2;
    String var3;

    public TestConstructor() {
        var3 = "Hello";
    }

    public void test() {
        System.out.println("var1= " + var1);
        System.out.println("var2= " + var2);
        System.out.println("var3= " + var3);
    }

    public static void main(String[] args) {
        TestConstructor testConstructor1 = new TestConstructor();
        TestConstructor testConstructor2 = new TestConstructor();
        TestConstructor testConstructor3 = new TestConstructor();

        testConstructor1.test();
        testConstructor2.test();
        testConstructor3.test();
    }
}
