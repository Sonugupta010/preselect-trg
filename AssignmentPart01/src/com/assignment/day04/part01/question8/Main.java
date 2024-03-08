package com.assignment.day04.part01.question8;

public class Main extends Matrix{
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(0, 2, 3);
        matrix1.setElement(1, 0, 4);
        matrix1.setElement(1, 1, 5);
        matrix1.setElement(1, 2, 6);

        Matrix matrix2 = new Matrix(2, 3);
        matrix2.setElement(0, 0, 7);
        matrix2.setElement(0, 1, 8);
        matrix2.setElement(0, 2, 9);
        matrix2.setElement(1, 0, 10);
        matrix2.setElement(1, 1, 11);
        matrix2.setElement(1, 2, 12);

        Matrix matrix3 = new Matrix(3, 2);
        matrix3.setElement(0, 0, 1);
        matrix3.setElement(0, 1, 2);
        matrix3.setElement(1, 0, 3);
        matrix3.setElement(1, 1, 4);
        matrix3.setElement(2, 0, 5);
        matrix3.setElement(2, 1, 6);

        Matrix matrix4 = new Matrix(2, 2);
        matrix4.setElement(0, 0, 1);
        matrix4.setElement(0, 1, 2);
        matrix4.setElement(1, 0, 3);
        matrix4.setElement(1, 1, 4);

        System.out.println("Matrix 1:");
        matrix1.printMatrix();
        System.out.println("Matrix 2:");
        matrix2.printMatrix();
        System.out.println("Matrix 3:");
        matrix3.printMatrix();
        System.out.println("Matrix 4:");
        matrix4.printMatrix();

        System.out.println("Adding Matrix 1 and Matrix 2:");
        Matrix sumMatrix = matrix1.add(matrix2);
        if (sumMatrix != null) {
            sumMatrix.printMatrix();
        }

        System.out.println("Adding Matrix 1 and Matrix 3:");
        sumMatrix = matrix1.add(matrix3);
        if (sumMatrix != null) {
            sumMatrix.printMatrix();
        }

        System.out.println("Multiplying Matrix 1 and Matrix 4:");
        Matrix productMatrix = matrix1.multiply(matrix4);
        if (productMatrix != null) {
            productMatrix.printMatrix();
        }

        System.out.println("Multiplying Matrix 1 and Matrix 3:");
        productMatrix = matrix1.multiply(matrix3);
        if (productMatrix != null) {
            productMatrix.printMatrix();
        }
    }
}
