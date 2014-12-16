

package GUIeTUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Scanner;

public class TUI implements View{
    
    private Scanner scanner;
    private ActionListener actionlistener;      
    private ActionListener controller;
    

    public void start() {
        // ainda está buggado, mas o objetivo é ser a parte do texto do jogo
        scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Aguardando sua jogada...");
			scanner.nextLine();
			ActionEvent ev = new ActionEvent(this, 10, "ping");
			controller.actionPerformed(ev);
		}
    }

    public void addController(ActionListener controller) {
        System.out.println("View      : adding controller");
		this.controller = controller;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println ("View      : Observable is " + o.getClass() + ", object passed is " + arg.getClass());

                // Comunicação tipo 'push' (obtém valor do objeto recebido como parâmetro)
        System.out.println("" + ((Integer)arg).intValue());
    }
    
    
}
