/*Exibir um menu com opções + - * /, ler 2 inteiros, executar a opção pedida
e exibir a resposta adequada*/

import javax.swing.JOptionPane;

public class CalculadoraModulo {
   static char menu(){
      char opcao = JOptionPane.showInputDialog("Digite uma operação\n+ -> soma\n- -> subtração\n* -> multiplicação\n/ -> divisão").charAt(0);
      return opcao;
   }
   static int soma(int a, int b){
      return a+b;
   }
   static int subtracao(int a, int b){
      return a-b;
   }
   static int multiplicacao(int a,int b){
      return a*b;
   }
   static double divisao(double a, double b){
      return a/b;
   }
   public static void main (String[] args){
      int num1, num2, result; 
      char op = menu();
      
      while (op != '+' && op != '-' && op != '*' && op != '/') {
         op = menu();
      }
      
      num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
      num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
      
      if ( op == '+'){
         result = soma(num1,num2);
         JOptionPane.showMessageDialog(null, "soma = " + result); 
      }
      else if (op == '-'){
         result = subtracao(num1,num2);      
         JOptionPane.showMessageDialog(null, "subtração = " + result);
      }
      else if (op == '*'){
         result = multiplicacao(num1,num2);
         JOptionPane.showMessageDialog(null, "multiplicação = " + result);
      }
      else if (op == '/'){

      }
   }
}