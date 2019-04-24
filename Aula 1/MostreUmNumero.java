import javax.swing.JOptionPane;

public class MostreUmNumero {
   public static void main (String args []) {
      int num =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));
      JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + num);

    /*  String num3 = JOptionPane.showInputDialog(null, "Digita alguma merda ai: ");
      int num2 = Integer.parseInt(num3);
      JOptionPane.showMessageDialog(null, "O valor é: " + num2);
    */
   } 
}