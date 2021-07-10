package com.tom;

public class ForTester {
    public static void main(String[] args) {
        int row = 10;
        int col = 10;
        /*
        for (int i=0 ; i<row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==j || j==col-1-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */
        row = 15;
        col = 30;
        for (int i=0 ; i<row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==j || j==col-1-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
