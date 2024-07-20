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
       char turn = 'X';
       char result = OXLab3.swapTurn(turn);
       assertEquals('O', result);
   }
   
   @Test
   public void swapTurn_O_X(){
       char currentPlayer = 'O';
       char result = OXLab3.swapTurn(currentPlayer);
       assertEquals('X', result);
   }
   
   
}
