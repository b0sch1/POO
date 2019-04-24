import javax.swing.JOptionPane;

public class SuperDivisão15{
   public static void main (String[] args){
      JOptionPane.showMessageDialog(null, "Digite dois números inteiros que te mostrarei o divisor, dividendo, quociente e resto");
      int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
      int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
      
      JOptionPane.showMessageDialog(null,"O Dividendo é " + num1 + "\nO Divisor é " + num2 + "\nO Quociente é " + (num1/num2) + "\nE o Resto é " + (num1%num2) );
   }
}