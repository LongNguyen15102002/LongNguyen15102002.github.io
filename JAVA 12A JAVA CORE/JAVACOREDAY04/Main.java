package JAVACOREDAY04;

public class Main {
    public static void main(String[] args) {

        String[] text = new String[4];
        text[0] = "Toi la java coder";
        text[1] = "Toi dang hoc java co ban";
        text[2] = "Toi se hoc lap trinh web";
        for (int index = 0; index < text.length; index++) {
            System.out.println(text[index]);
        }

        int[][] twoDimensionArray;
        twoDimensionArray = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                // System.out.println(twoDimensionArray[i][j]);
                twoDimensionArray[i][j] = 1;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(twoDimensionArray[i][j]);
            }
        }
        for (int index = 0; index < text.length; index++) {
            System.out.println("for:" + text[index]);
            if (text[index] == null) {
                text[index] = "chuoi khac null";
            }
        }

        for (String t: text){
            System.out.println("for each: " + t);
        }
    }
}
