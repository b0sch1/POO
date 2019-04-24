/*
   Data:01/03/2019
 Aula 01
   Calcular a área de um retângulo.
   Para isso:
   - solicitar, via teclado, a base e a altura do retângulo.
   - O programa deverá calcular a área e mostrá-la na tela.
*/

import javax.swing.JOptionPane;   //importar o gerenciador de janelas JOptionPane

public class BaseTriangulo {
   public static void main (String args[]){
   
      double altura;
      double base;
      double area;
      
      base = Double.parseDouble(
         JOptionPane.showInputDialog(null, "Digite o valor da base: ")
      );
      
      altura = Double.parseDouble(
         JOptionPane.showInputDialog(null, "Digite o valor da altura: ")
      );
      
      //2º.Calcular a área
      area = base * altura;
      
      //3º.Exibir o resultado
      JOptionPane.showMessageDialog(null, "O valor da área é: " + area);
      
   }
}

/*
A Aula de hoje não usamos o main, mas usamos o Java Workbench (botão azul do JGrasp)
clicamos em create, botao direito e em usamos o invoke
*/