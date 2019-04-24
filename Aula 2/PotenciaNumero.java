import javax.swing.JOptionPane;

public class PotenciaNumero {
   public static void main (String args []) {
     int num = Integer.parseInt(
               JOptionPane.showInputDialog("Digite o número que queira elevar ao quadrado"));
     double pow = Math.pow(num,2);
     JOptionPane.showMessageDialog (null, pow);

   }
}