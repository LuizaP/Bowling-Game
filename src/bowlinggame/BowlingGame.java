/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bowlinggame;

/**
 *
 * @author a1243276
 */
public class BowlingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private int jogada = 0;
    private int pontos[] = new int[21];
    
    
    public int getScore() {
        int cont = 1;
        int soma = 0;
        for (int i = 0; i < (pontos.length - 2); i++) {
            soma+= pontos[i];
            if (cont==1) {
                if (pontos[i]== 10) {
                    soma+= pontos[i+2];
                    soma+= pontos[i+3];                  
                    pontos[i+1] = 0;
                }
            }
            if (cont==2) {
                if ((pontos[i-1]+ pontos[i])== 10) {                    
                    soma+= pontos[i+1];                    
                } 
                cont = 1;
            } else {
                cont= 2;                
            }
                        
        }
        
        if ((pontos[18] + pontos[19])== 10) {
                    soma+= pontos[20];
                }
        
        return soma;
    }

    public void roll(int i) {
        pontos[jogada] = i;
        jogada++;
        
                
    }
    
}
