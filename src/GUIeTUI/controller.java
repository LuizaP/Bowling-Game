
package GUIeTUI;

import java.awt.event.ActionEvent;

class controller {
    
    private Model model;
    private View view;
    
    public controller() {
        System.out.println ("Controller()");
    }
    
    public void addModel(Model m){
		System.out.println("Controller: adding model");
		this.model = m;
	}
    public void addView(View v){
		System.out.println("Controller: adding view");
		this.view = v;
	}
    public void initModel(int x){
		model.setValue(x);
	}

    

    static void actionPerformed(ActionEvent ev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
