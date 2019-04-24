import javax.swing.JOptionPane;

public class TotalPalavras {
   public static void main (String args[]) {
      String pal1, pal2, pal3;
      
      pal1 = JOptionPane.showInputDialog ("Digite a palavra 1");
      pal2 = JOptionPane.showInputDialog ("Digite a palavra 2");
      pal3 = JOptionPane.showInputDialog ("Digite a palavra 3");
      
      int tam1 = pal1.length();
      int tam2 = pal2.length();
      int tam3 = pal3.length();
      
      
      int com = (tam1 + tam2 + tam3);
      
      JOptionPane.showMessageDialog(null, com);
   }
}