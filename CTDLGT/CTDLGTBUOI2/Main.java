import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "Java123";
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));

        for (char c : arr) {
            if (Character.isDigit(c)) {
                System.out.println(c);
            }
        }

        char c = 65;
        System.out.println(c);
        System.out.println((int)'a');

        String str = "";
        for (int i = 0; i < 3; i++){
            str = str + i + " - ";
        }
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder("ABC");
        System.out.println(stringBuilder);
        stringBuilder.append("XYZ");
        System.out.println(stringBuilder);
        stringBuilder.insert(2, "acb");
        System.out.println(stringBuilder);
        stringBuilder.replace(2, 5, "xyz");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}