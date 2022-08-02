public class btvn {
    public static void main(String[] args) {
        /* BT1 */
        int i = 10;
        int n = i++ % 5;
        System.out.println(i);
        System.out.println(n);

        i = 10;
        n = ++i % 5;
        System.out.println(i);
        System.out.println(n);

        /* BT2 */
        double farenheit;
        double celsius;
        farenheit = 51.0;
        celsius = (farenheit - 32.0) * 5 / 9;
        System.out.print("gia tri doi 49 do F sang do C la: ");
        System.out.println(celsius);

        /* BT3 */
        double d = 9 / 5;
        System.out.println(d);

        /* d không ra bằng 1.8 mà ra bằng 1.0 */
        /* -> Sửa double thành float là được */

        float e = 9 / 5f;
        System.out.println(e);

        /* BT4 */
        int x;
        int y;
        x = 18;
        y = 3;

        boolean yeucau1 = x > 0;
        System.out.println(yeucau1);
        System.out.println("x la so duong");

        int a = x % y;
        boolean yeucau2 = a == 0;
        System.out.println(yeucau2);
        System.out.println("x chia het cho y");

        boolean yeucau3 = (x >= 2) && (x <= 15);
        System.out.println(yeucau3);
        System.out.println("x khong nam trong khoang 2 den 15");

        int b = x - y;
        boolean yeucau4 = b < 5;
        System.out.println(yeucau4);
        System.out.println("hieu cua x va y khong nho hon 5");

        boolean yeucau5 = x > 9999;
        System.out.println(yeucau5);
        System.out.println("x la so khong co nhieu hon 4 chu so");

        boolean yeucau6 = (x >= 100000) && (x <= 999999);
        System.out.println(yeucau6);
        System.out.println("x khong co chinh xac 6 chu so");
    }
}
