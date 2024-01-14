package Recursion;
import java.util.*;
public class PascalsTriangle {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>(rowIndex + 1) {
            {
                add(1);
            }
        };

        for (int i = 0; i < rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
        }

        return row;
    }

    private int getNumRecur(int row, int col) {
        if (row == 0 || col == 0 || row == col) {
            return 1;
        }

        return getNumRecur(row - 1, col - 1) + getNumRecur(row - 1, col);
    }

    public List<Integer> getRowRecur(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            ans.add(getNumRecur(rowIndex, i));
        }

        return ans;
    }
}
