
package GUIeTUI;

import bowlinggame.BowlingGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class controller implements ActionListener{
    
    private BowlingGame bowlingGame;
    private View view;
    
    public controller() {
        System.out.println ("Controller()");
    }
    
   
    

     public void actionPerformed(ActionEvent ev) {
        System.out.println("Controller: recebeu evento e tratará o evento com alteração no modelo");
	//System.out.println("Controller: evento recebido foi " + ev.getActionCommand() + ", com os parâmetros " + ev.paramString());
         System.out.println(ev.getActionCommand());
        int c= Integer.valueOf(ev.getActionCommand());
        bowlingGame.roll(c);

    }
    
     public void addModel(BowlingGame jogo){
		System.out.println("Controller: adding model");
		this.bowlingGame = jogo;
	}
    public void addView(View v){
		System.out.println("Controller: adding view");
		this.view = v;
	}
    public void initModel(int x){
		//model.setValue(x);
	}

    
}
