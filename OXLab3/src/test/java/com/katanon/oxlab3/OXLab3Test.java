/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.katanon.oxlab3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author AVI003
 */
public class OXLab3Test {
    
    public OXLab3Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   @Test
   public void swapTurn_X_O(){
       char currentPlayer = 'X';
       char result = OXLab3.swapTurn(currentPlayer);
       assertEquals('O', result);
   }
   
   @Test
   public void swapTurn_O_X(){
       char currentPlayer = 'O';
       char result = OXLab3.swapTurn(currentPlayer);
       assertEquals('X', result);
   }
   
   @Test
   public void checkWinner_Row1_true_byX(){
        char[][] board = {{'X', 'X', 'X'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char currentPlayer = 'X';
        boolean result = OXLab3.checkWinner(board, currentPlayer);
        assertTrue(result);
   }
   
    @Test
   public void checkWinner_Row2_true_byX(){
        char[][] board = {{'-', '-', '-'},{'X', 'X', 'X'}, {'-', '-', '-'}};
        char currentPlayer = 'X';
        boolean result = OXLab3.checkWinner(board, currentPlayer);
        assertTrue(result);
   }
   
   @Test
   public void checkWinner_Row3_true_byX(){
        char[][] board = {{'-', '-', '-'}, {'-', '-', '-'},{'X', 'X', 'X'}};
        char currentPlayer = 'X';
        boolean result = OXLab3.checkWinner(board, currentPlayer);
        assertTrue(result);
   }
   @Test
   public void checkWinner_Col1_true_byX(){
        char[][] board = {{'X', '-', '-'}, {'X', '-', '-'},{'X', '-', '-'}};
        char currentPlayer = 'X';
        boolean result = OXLab3.checkWinner(board, currentPlayer);
        assertTrue(result);
   }
   
   @Test
   public void checkWinner_Col2_true_byX(){
        char[][] board = {{'-','X', '-'}, {'-', 'X', '-'},{'-','X', '-'}};
        char currentPlayer = 'X';
        boolean result = OXLab3.checkWinner(board, currentPlayer);
        assertTrue(result);
   }
   
   @Test
   public void checkWinner_Col3_true_byX(){
        char[][] board = {{'-','-', 'X'}, {'-', '-', 'X'},{'-','-', 'X'}};
        char currentPlayer = 'X';
        boolean result = OXLab3.checkWinner(board, currentPlayer);
        assertTrue(result);
   }
   
   @Test
   public void checkWinner_Diag1_true_byX(){
        char[][] board = {{'X','-', '-'}, {'-', 'X', '-'},{'-','-','X'}};
        char currentPlayer = 'X';
        boolean result = OXLab3.checkWinner(board, currentPlayer);
        assertTrue(result);
   }
   
   @Test
   public void checkWinner_Diag2_true_byX(){
        char[][] board = {{'-','-', 'X'}, {'-', 'X', '-'},{'X','-', '-'}};
        char currentPlayer = 'X';
        boolean result = OXLab3.checkWinner(board, currentPlayer);
        assertTrue(result);
   }
   
   @Test
   public void checkWinner_Row1_false_byX(){
        char[][] board = {{'X', 'X', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char currentPlayer = 'X';
        boolean result = OXLab3.checkWinner(board, currentPlayer);
        assertFalse(result);
   }
   
   @Test
   public void checkWinner_Row1_true_byO(){
        char[][] board = {{'O', 'O', 'O'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char currentPlayer = 'O';
        boolean result = OXLab3.checkWinner(board, currentPlayer);
        assertTrue(result);
   }
   
   @Test
   public void checkWinner_Col1_true_byO(){
        char[][] board = {{'O', '-', '-'}, {'O', '-', '-'}, {'O', '-', '-'}};
        char currentPlayer = 'O';
        boolean result = OXLab3.checkWinner(board, currentPlayer);
        assertTrue(result);
   }
   @Test
   public void checkWinner_Col1_false_byO(){
        char[][] board = {{'O', '-', '-'}, {'O', '-', '-'}, {'-', '-', '-'}};
        char currentPlayer = 'O';
        boolean result = OXLab3.checkWinner(board, currentPlayer);
        assertFalse(result);
   }
   @Test
   public void checkDraw_boardFull_true(){
        char[][] board = {{'O', 'X', 'O'}, {'O', 'X', 'O'}, {'X', 'O', 'X'}};  
        boolean result = OXLab3.checkDraw(board);
        assertTrue(result);
   }
   
   @Test
   public void playAgain_yes_true(){
       String play = "yes";
       boolean result = OXLab3.playAgain(play);
       assertTrue(result);
   }
}
