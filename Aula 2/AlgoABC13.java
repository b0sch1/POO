/*
Escrever um algoritmo que leia tres numeros reais (a, b e c),
calcula e escreve o resultado da expressa o x = 2 * ( ( a – c ) / 8 ) – b * 5. 
*/

import javax.swing.JOptionPane;

public class AlgoABC13{
   public static void main (String[] args){
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
      int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
      
      JOptionPane.showMessageDialog(null, ( 2 * ( ( a - c ) / 8 ) - b * 5 ) );
   }
}