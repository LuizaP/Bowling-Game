package GUIeTUI;

import bowlinggame.BowlingGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Scanner;

public class TUI implements View{
    controller c;   
    Scanner scanner = new Scanner(System.in);    
    int pts = 0;    
       public TUI(){          
                         
       }                                       
        /**
	 * Chamado pelo modelo quando este é atualizado.
	 */
        public void update(Observable obs, Object obj) {
                // Mostra quem é observável e o valor que ele está repassando
	    BowlingGame jogo = (BowlingGame) obs;
            System.out.println("Jogador1 --> Pontuação:" + jogo.getScore() + "\n");
            System.out.println("Rodada" + jogo.getjogada());
            System.out.println("Pressione ENTER Para Jogar!\n");
            scanner.nextLine();
            }

    @Override
    public void start() {
        System.out.println("  ---> Bem Vindo ao maravilhoso Mundo do Boliche <--- \n");
           System.out.println("Pressione ENTER Para Começar o Jogo!\n");
           scanner.nextLine();         
           
           while (true) {			
			//System.out.println("Pontuação: " );
                        System.out.println("Digite seu lançamento: ");
                        pts = scanner.nextInt();
                        
                        ActionEvent ev = new ActionEvent(this, 1, "" + pts);
			c.actionPerformed(ev);}
    }
    @Override
    public void addController(ActionListener controller) {
        c = (controller) controller;
    }
}