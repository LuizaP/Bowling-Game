

package GUIeTUI;

import bowlinggame.BowlingGame;
import java.io.IOException;


public class Main {
    
    private int start_value = 10;
    
    public Main() {
        GUI gui = new GUI();
        
        View myView = new TUI();
        
        BowlingGame jogo = new BowlingGame();
        
	jogo.addObserver(myView);
	jogo.addObserver(gui);
        
        controller myController = new controller();
	myController.addModel(jogo);
	myController.addView(myView);
	myController.initModel(start_value);
	 
	myView.addController(myController);
        myView.start();
    }
    
    public static void main(String[] args) {
        Main main = new Main();
    }
    
}
