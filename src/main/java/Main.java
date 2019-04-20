import mathematics.Multiplication;
import matrix.MatrixPyramid;
import matrix.MatrixSnake;

public class Main {
    public static void main(String[] args) {
        System.out.println("Table of multiplication");
        Multiplication multiplication = new Multiplication();
        multiplication.getMultiplicationTable(46);
        System.out.println("Matrix-Snake");
        MatrixSnake matrixSnake = new MatrixSnake();
        matrixSnake.createMatr(7);
        System.out.println("Matrix-Pyramid");
        MatrixPyramid matrixPyramid = new MatrixPyramid();
        matrixPyramid.createMatr(5);
    }
}
