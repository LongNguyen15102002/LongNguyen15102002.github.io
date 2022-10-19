package CTDLGTBUOI7MIDTEST;

import java.util.HashSet;

public class Q36 {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> number = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentNumber = board[i][j];
                if (currentNumber != '.') {
                    if (!number.add(currentNumber + " in row " + i) ||
                            !number.add(currentNumber + " in column " + j) ||
                            !number.add(currentNumber + " in subbox " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
