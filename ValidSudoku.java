/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validsudoku;

/**
 *
 * @author nayan
 */
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        // Check each row
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i)) {
                return false;
            }
        }

        // Check each column
        for (int j = 0; j < 9; j++) {
            if (!isValidColumn(board, j)) {
                return false;
            }
        }

        // Check each 3x3 sub-box
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidSubBox(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValidRow(char[][] board, int row) {
        Set<Character> seen = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            char current = board[row][j];
            if (current != '.' && !seen.add(current)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidColumn(char[][] board, int col) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            char current = board[i][col];
            if (current != '.' && !seen.add(current)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidSubBox(char[][] board, int startRow, int startCol) {
        Set<Character> seen = new HashSet<>();
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                char current = board[i][j];
                if (current != '.' && !seen.add(current)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println("Is the Sudoku board valid? " + isValidSudoku(board));
    }
}

