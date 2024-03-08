package com.assignment.day04.part01.question8;

public class Matrix {

    private int[][] matrix;
    private int rows;
    private int columns;

    public Matrix() {
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
    }
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            matrix[i][j] = value;
        } else {
            System.out.println("Invalid position.");
        }
    }
    public Matrix add(Matrix otherMatrix) {
        if (rows != otherMatrix.getRows() || columns != otherMatrix.getColumns()) {
            System.out.println("Matrices cannot be added.");
            return null;
        }

        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = this.matrix[i][j] + otherMatrix.matrix[i][j];
            }
        }

        return result;
    }
    public Matrix multiply(Matrix otherMatrix) {
        if (columns != otherMatrix.getRows()) {
            System.out.println("Matrices cannot be multiplied.");
            return null;
        }
        Matrix result = new Matrix(rows, otherMatrix.getColumns());
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                for (int k = 0; k < columns; k++) {
                    result.matrix[i][j] += this.matrix[i][k] * otherMatrix.matrix[k][j];
                }
            }
        }
        return result;
    }
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
