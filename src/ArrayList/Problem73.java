package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Problem73 {
    // a more efficient way to do the problem
    public void setZeroes(int[][] matrix) {
        List<Integer> row_list = new ArrayList<>();
        List<Integer> col_list = new ArrayList<>();
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row_list.add(i);
                    col_list.add(j);
                }
            }
        }
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(row_list.contains(i) || col_list.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
