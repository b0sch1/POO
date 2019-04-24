/*
Crie um algoritmo para calcular a área de um círculo,
com base no seu raio (Área = PI*raio*raio, onde PI = 3.14159).
Use variáveis reais.
*/
import javax.swing.JOptionPane;

public class AreaCirculo14{
   public static void main (String[] args){
      double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo e te retornarei a área"));
      
      JOptionPane.showMessageDialog(null, String.format("%.2f",(3.14159*Math.pow(raio,2))));
   }
}