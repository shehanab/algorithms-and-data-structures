package visa.inner;

public class Test4 {
    private final boolean flag = true;

    public Test4() {
        (new Inner()).test();
    }

    public static void main(String[] args) {
        new Test4();
    }

    public void sample() {
        System.out.println("sample");
    }

    class Inner {
        void test() {
            if (Test4.this.flag) {

                sample();
            }
        }
    }
}
