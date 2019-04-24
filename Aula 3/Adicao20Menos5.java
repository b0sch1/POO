import javax.swing.JOptionPane;

public class Adicao20Menos5{
   public static void main (String[] args){
      JOptionPane.showMessageDialog(null, "Farei a soma de dois números, se o resultado for maior ou igual a 20, apresentarei o valor subtraindo 5");
      int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
      int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
      int resultado = num1 + num2;
      if (resultado >= 20){
         resultado = resultado - 5;
         JOptionPane.showMessageDialog(null, resultado);
      }  
   }
}