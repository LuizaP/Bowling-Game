

package GUIeTUI;


public class Main {
    
    private int start_value = 10;
    
    public Main() {
        GUI gui = new GUI();
        
        View myView = new TUI();
        
        Model myModel 	= new Model();
        
	myModel.addObserver(myView);
        
        controller myController = new controller();
	myController.addModel(myModel);
	myController.addView(myView);
	myController.initModel(start_value);
	 
	//myView.addController(myController);
        myView.start();
    }
    
    public static void main(String[] args) {
        Main main = new Main();
    }
    
}
