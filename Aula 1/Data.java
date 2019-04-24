import javax.swing.JOptionPane;

public class Data {
   public static void main (String args []) {
   
      int dia =Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o dia: "));
      int mes =Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o mes: "));
      int ano =Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o ano: "));
      
      JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
      }
}