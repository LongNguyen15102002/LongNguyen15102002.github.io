package BTVNDAY03;

public class hw3fixed {
    public static void main(String[] args) {
        String text = "Toi la   t coder";

        String[] array = text.split(" ");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
            String word = array[index];
            if (word.length() > 0) {
                if (word.equals("t")) {
                String firstCharacter = word.substring(0, 1);
                System.out.println(firstCharacter);
                firstCharacter = firstCharacter.toUpperCase();
                String last = word.substring(1);
                System.out.println(last);
                System.out.println(firstCharacter + last);}
            }
        }
    }

}
