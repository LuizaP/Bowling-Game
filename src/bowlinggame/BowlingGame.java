
package bowlinggame;

import java.util.Observable;

public class BowlingGame extends Observable{

   
    
    private int jogada = 0;
    private int pontos[] = new int[21];
    
    public int getjogada() {
        return jogada;
    }
    
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

    public void roll(int i) {  // TODO: verifique se a quantidade 'i' é válida (entre 0 e 10) e, caso não seja, lance uma exceção IllegalArgumentException
        pontos[jogada] = i;
        if (i>10) {
            System.out.println("Você não pode derrubar mais de 10 pinos");
        }else if (i<0) {
            System.out.println("Não existe a possibilidade de derrubar menos de zero pinos");
        }else{
            jogada++;
            this.setChanged();
            this.notifyObservers();
        }
       
                        
    }
    
}
