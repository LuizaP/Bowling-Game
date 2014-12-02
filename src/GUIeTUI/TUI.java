

package GUIeTUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Scanner;

public class TUI implements View{
    
    private Scanner scanner;
    private ActionListener actionlistener;      
    

    public void start() {
        scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Aguardando sua jogada...");
			scanner.nextLine();
			ActionEvent ev = new ActionEvent(this, 10, "ping");
			controller.actionPerformed(ev);
		}
    }

    public void addController(ActionListener controller) {
    }

    @Override
    public void update(Observable o, Object arg) {
    }
    
    
}
