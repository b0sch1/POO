import javax.swing.JOptionPane;

public class DiasVividos {
   public static void main (String args []) {
     int anos = Integer.parseInt(
               JOptionPane.showInputDialog("Quantos anos você tem?"));
     int dias = (anos * 365);
     JOptionPane.showMessageDialog (null, 
      "Você viveu por " + dias + " dias.");

   }
}