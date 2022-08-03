package com.company.Complex_Problem_4;

public class RubikMain {
    public static void main(String[] args) {
        // Variables
        FlatRubikPuzzle cube = new FlatRubikPuzzle();

        System.out.println("----- Steps To Solve Puzzle -----");
        System.out.println("Start");
        cube.solve();
    }
}
