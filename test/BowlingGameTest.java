/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bowlinggame.BowlingGame;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author a1243276
 */
public class BowlingGameTest {
    
    public BowlingGameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    @Test
    public void zero() {
    
    BowlingGame bowlinggame = new BowlingGame();
    
    bowlinggame.getScore();
        assertEquals(0, bowlinggame.getScore());
    
    }
    @Test
    public void round1() {
        BowlingGame bowlinggame = new BowlingGame();
        
        bowlinggame.roll(5);
        bowlinggame.roll(3);
        assertEquals(8, bowlinggame.getScore());
        
        
        
    }
    @Test
    public void round2() {
        BowlingGame bowlinggame = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            bowlinggame.roll(0);
        }
        assertEquals(0, bowlinggame.getScore());
    }
    @Test
    public void round3(){
        BowlingGame bowlinggame = new BowlingGame();
        bowlinggame.roll(5);
        bowlinggame.roll(5);        
        for (int i = 2; i < 20; i++) {
            bowlinggame.roll(1);
        }
        assertEquals(28, bowlinggame.getScore());

    }
}
