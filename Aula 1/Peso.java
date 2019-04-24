import javax.swing.JOptionPane;

public class Peso{
   public static void main (String[] args){
      double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
      JOptionPane.showMessageDialog(null, "O peso informado foi " + peso + "kg.");
   }
}