public class Main {
    public static void main(String[] args) {
        int[] array1 = { 5, 7, 1, 9, 3, 2 };
        int temp = array1[0];
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] < array1[j]) {
                    temp = array1[j];
                    array1[j] = array1[i];
                    array1[i] = temp;
                }
            }
        }
        System.out.println("Dãy số được xếp theo thứ tự tăng dần là: ");
        show(array1);
    }

    public static void show(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
