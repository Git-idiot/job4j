package ru.job4j.array;

public class MatrixCheck {
    public boolean check (boolean[][] matrix){
        boolean result = true;
        for (int i = 0; i < matrix.length-1; i++){
            if ((matrix[i][i] != matrix[i+1][i+1])||(matrix[i][matrix.length-i-1]!= matrix[i+1][matrix.length-i-2])){
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean mtr[][] = {{true, true, false}, {false, false, true},{true, false, true}};
        boolean res = matrixCheck.check(mtr);
        System.out.println(res);
    }
}
