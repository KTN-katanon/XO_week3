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
public class CalculateTest {
    
    public CalculateTest() {
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
    public void addOneOneTwo(){
        int num1 = 1;
        int num2 = 1;
        int result = Calculate.add(num1, num2);
        assertEquals(2, result);
    }
    
    @Test
    public void add_TwoPlusTwo_Four(){
        int num1 = 2;
        int num2 = 2;
        int result = Calculate.add(num1, num2);
        assertEquals(4, result);
    }
}
