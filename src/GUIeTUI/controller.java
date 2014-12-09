
package GUIeTUI;

import bowlinggame.BowlingGame;
import java.awt.event.ActionEvent;

class controller {
    
    private BowlingGame bowlingGame;
    private View view;
    
    public controller() {
        System.out.println ("Controller()");
    }
    
   
    

    static void actionPerformed(ActionEvent ev) {
        System.out.println("Controller: recebeu evento e tratará o evento com alteração no modelo");
	System.out.println("Controller: evento recebido foi " + ev.getActionCommand() + ", com os parâmetros " + ev.paramString());
	//bowlingGame.roll();

    }
    
     public void addModel(Model m){
		System.out.println("Controller: adding model");
		//this.bowlingGame = m;
	}
    public void addView(View v){
		System.out.println("Controller: adding view");
		this.view = v;
	}
    public void initModel(int x){
		//model.setValue(x);
	}

    
}
