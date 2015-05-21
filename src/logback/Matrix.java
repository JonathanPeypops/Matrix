package logback;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Matrix {
    public static void main(String[] args) {
        RealMatrix realMatrixA = MatrixUtils.createRealMatrix(new double[][]{
                {1,2},
                {3,4},
                {5,6}
        });
        RealMatrix realMatrixB = MatrixUtils.createRealMatrix(new double[][]{
                {2,4,6},
                {1,2,3}
        });
        RealMatrix realMatrixC = realMatrixA.multiply(realMatrixB);
        System.out.println(realMatrixC);
    }
}
