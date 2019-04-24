import javax.swing.JOptionPane;

public class MostrePalavras {
   public static void main (String args []) {
      String upal = JOptionPane.showInputDialog("Digite a ultima palavra:");
      String spal = JOptionPane.showInputDialog("Digite a segunda palavra:");
      String ppal = JOptionPane.showInputDialog("Digite a primeira palavra:");
      JOptionPane.showMessageDialog(null, ppal +" "+ spal +" "+ upal);
   } 
}