package visa;

public class Test {


    public static void main(String[] args) {
/*        try {
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b + d);
        } catch (NumberFormatException e) {
            System.out.println("bad number");
        }*/

        System.out.println(devide(4, 0));

    }

    public static int devide(int a, int b) {
        int c = -1;

        try {
            c = a / b;
        } catch (Exception e) {
            System.err.print("Exception");
        } finally {
            System.err.print("Finally");
        }
        return c;
    }

}
