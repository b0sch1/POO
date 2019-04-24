import javax.swing.JOptionPane;

public class Divisivel2ou5e10{
   public static void main (String[] args){
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
      
      if (numero % 5 == 0 && numero % 10 != 0){
         JOptionPane.showMessageDialog(null, "Este número é divisivel por 5");
      }
      else {
         if (numero % 2 == 0 && numero % 10 != 0){
            JOptionPane.showMessageDialog(null, "Este número é divisivel por 2");
         }
         else {           
            if (numero % 10 == 0){
               JOptionPane.showMessageDialog(null, "Este número é divisivel por 10");
            }
            else {
               JOptionPane.showMessageDialog(null, "Este número não é divisivel por 2, 5 ou 10");                     
            }
         }
      }
   }
}