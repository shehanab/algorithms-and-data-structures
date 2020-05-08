package visa.ip4;

public class Ipv4Validator {

    public static void main(String[] args) {
/*        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }*/

        System.out.println("000.12.12.034".matches(new MyRegex().pattern));
        System.out.println("121.234.12.12".matches(new MyRegex().pattern));
        System.out.println("23.45.12.56".matches(new MyRegex().pattern));
        System.out.println("00.12.123.123123.123".matches(new MyRegex().pattern));
        System.out.println("122.23".matches(new MyRegex().pattern));
        System.out.println("Hello.IP".matches(new MyRegex().pattern));

    }

    //Write your code here
    static class MyRegex {
        String pattern;

        MyRegex() {
            String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
            pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;

        }
    }
}
