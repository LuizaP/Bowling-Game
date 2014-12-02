
package GUIeTUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI extends JFrame{
    private Button botao = new Button("Jogar");
    Panel pn1 = new Panel();
    Panel pn2 = new Panel();
    Panel pnbotao = new Panel();
    Label label1 = new Label("Jogo de Boliche");
    Label label2 = new Label("Digite sua jogada");
    JTextField textfield = new JTextField(5);
    Container cp;
       
    public GUI(){
        setSize(300,200);
        setTitle("Jogo de Boliche");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
        cp = getContentPane();
        
        pn1.setLayout(new GridLayout(2, 1));
        pn2.setLayout(new GridLayout(2, 1));
        pnbotao.setLayout(new GridLayout(1, 1));
        
        pn1.setBackground(Color.LIGHT_GRAY);
        pn1.add(label1);        
        pn2.add(label2);
        pn2.add(textfield);
        pnbotao.add(botao);
          
        cp.add(pn1);
        cp.add(pn2);
        cp.add(pnbotao);
        
        System.out.println("t");
        
        
        setLocationRelativeTo(this);
        
        botao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int coiso = Integer.parseInt(textfield.getText());
                                        
                }catch (Exception a){
                    textfield.requestFocus();
                    textfield.selectAll();
                    
                }

            }
        });
        setVisible(true);
       

        
    }
    
    
}
