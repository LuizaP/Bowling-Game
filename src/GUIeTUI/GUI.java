
package GUIeTUI;

import bowlinggame.BowlingGame;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI extends JFrame{
    private Button botao = new Button("Jogar");
    Panel pn1 = new Panel();
    Panel pn2 = new Panel();
    Panel pn3 = new Panel();
    Panel pnbotao = new Panel();
    Label label1 = new Label("Jogo de Boliche");
    Label label2 = new Label("Digite sua jogada");
    Label label3 = new Label("Pontos");
    Label label4 = new Label();
    Label label5 = new Label("Jogada:");
    Label label6 = new Label();
    JTextField textfield = new JTextField(5);
    Container cp;
       
    public GUI(){
        setSize(500,400);
        setTitle("Jogo de Boliche");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 1));
        cp = getContentPane();
        
        pn1.setLayout(new GridLayout(2, 1));
        pn2.setLayout(new GridLayout(2, 1));
        pn3.setLayout(new GridLayout(2, 1));
        pnbotao.setLayout(new GridLayout(1, 1));
        
        pn1.setBackground(Color.LIGHT_GRAY);
        pn1.add(label1);        
        pn2.add(label2);
        pn2.add(textfield);
        pnbotao.add(botao);
        
        pn3.add(label3);
        pn3.add(label4);
        pn3.add(label5);
        pn3.add(label6);
        
          
        cp.add(pn1);
        cp.add(pn2);        
        cp.add(pnbotao);
        cp.add(pn3);
        
        System.out.println("t");
        
        
        setLocationRelativeTo(this);
        
        BowlingGame jogo = new BowlingGame();

        
        botao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    //Pega o valor dentro do textfield e manda pro jogo
                    int x = Integer.parseInt(textfield.getText());
                    textfield.requestFocus();
                    textfield.selectAll();   
                    // nao deixa o jogador tentar jogar mais de 10 pinos
                    if (x>10) {
                        label4.setText("Você não pode derrubar mais de 10 pinos.");
                    }else{
                        jogo.roll(x);
                        label4.setText(jogo.getScore() + "");
                        // avisa quando chegar o fim do jogo
                        if (jogo.getjogada()==21) {
                            label6.setText("Fim de Jogo!!");
                        }else{
                            label6.setText(jogo.getjogada()+ "");
                        }
                        
                    }
                    
                    
                    
                    
                                        
                }catch (Exception a){
                    
                    
                }

            }
        });
        setVisible(true);
       

        
    }
    
    
}
