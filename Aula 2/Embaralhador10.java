/*
 Crie um algoritmo que embaralhe mensagens fazendo o seguinte:
 leia três frases, separe cada uma delas ao meio.
 Então junte nesta ordem: primeira metade da segunda,
 segunda metade da terceira, segunda metade da segunda,
 primeira metade da primeira, primeira metade da terceira,
 segunda metade da primeira. Concatene então as três frases originais e imprima o resultado.
 Na linha de baixo, escreva a frase embaralhada e compare o resultado.
 */
import javax.swing.JOptionPane;

public class Embaralhador10 {
   public static void main (String[] args){
      String frase1 = JOptionPane.showInputDialog("Digite a primeira frase");
      String frase2 = JOptionPane.showInputDialog("Digite a segunda frase");
      String frase3 = JOptionPane.showInputDialog("Digite a terceira frase");
      
      int part1 = frase1.length();
      int part2 = frase2.length();
      int part3 = frase3.length();
      
      JOptionPane.showMessageDialog(null, "Originalmente as frases eram:\n" + frase1 + "\n" 
      + frase2 + "\n" + frase3 + "\n\nEmbaralhado ficou:\n" + frase2.substring(0,part2/2) + frase3.substring(part3/2,part3) 
      + "\n" + frase2.substring(part2/2,part2) + frase1.substring(0,part1/2) + "\n" + frase3.substring(0,part3/2) 
      + frase1.substring(part1/2,part1));
   }
}