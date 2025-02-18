/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.katanon.oxlab3;

/**
 *
 * @author nonku
 */
import java.util.*;

public class OXLab3 {

    public final static int SIZE = 3;
    public static char[][] board = new char[SIZE][SIZE];
    public static char currentPlayer = 'X';
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        currentPlayer = swapTurn(currentPlayer);
        createBoard();
//        while (true) {
//
//            printWelcome();
//            createBoard();
//            while (true) {
//                printBoard();
//                printTurn();
//                move();
//                if (results()) {
//                    break;
//                }
////                swapTurn();
//            }
//            if (!playAgain()) {
//                System.out.println("Thanks for playing!");
//                break;
//            }
//        }
    }

    public static void printWelcome() {
        System.out.println("Welcome to XO");
    }

    public static void createBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printTurn() {
        System.out.println("Turn " + currentPlayer);
    }

    public static void move() {
        while (true) {
            try {
                System.out.print("Please input row,col: ");
                int row = sc.nextInt();
                int col = sc.nextInt();

                // Check for errors
                if (row <= 0 || row > SIZE || col <= 0 || col > SIZE) {
                    System.out.println("This position is outside of the board!");
                } else if (board[row - 1][col - 1] != '-') {
                    System.out.println("Player is already in that spot!");
                } else {
                    // Add player symbol to the board
                    board[row - 1][col - 1] = currentPlayer;
                    break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input! Please input integers!");
                sc.next(); // Clear the invalid input
            }
        }
    }

    public static char swapTurn(char currentPlayer) {
        if (currentPlayer == 'X') {
            return 'O';
        } else{
            return 'X';
        }
    }

    //check win
    public static boolean checkWinner(char [][] board,char currentPlayer) {
        // check row
        if ((board[0][0] == currentPlayer && board[0][1] == currentPlayer && board[0][2] == currentPlayer)
                || (board[1][0] == currentPlayer && board[1][1] == currentPlayer && board[1][2] == currentPlayer)
                || (board[2][0] == currentPlayer && board[2][1] == currentPlayer && board[2][2] == currentPlayer)) {
            return true;
        } // check col
        else if ((board[0][0] == currentPlayer && board[1][0] == currentPlayer && board[2][0] == currentPlayer)
                || (board[0][1] == currentPlayer && board[1][1] == currentPlayer && board[2][1] == currentPlayer)
                || (board[0][2] == currentPlayer && board[1][2] == currentPlayer && board[2][2] == currentPlayer)) {
            return true;
        } // check X
        else if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer
                || board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    public static boolean checkDraw(char [][] board) {
        // check draw
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

//    public static boolean results() {
//        if (checkWinner()) {
//            printBoard();
//            System.out.println("Player " + currentPlayer + " win!!!");
//            return true;
//        } else if (checkDraw()) {
//            printBoard();
//            System.out.println("Draw!!!");
//            return true;
//        }
//        return false;
//    }

    public static boolean playAgain(String play) {
        System.out.println("Do you want to play again? (y/n, other to no): ");
//        String play = sc.next().trim().toLowerCase();
        if (play.equals("yes") || play.equals("y")) {
            currentPlayer = 'X';
            return true;
        } else {
            return false;
        }
    }
}
