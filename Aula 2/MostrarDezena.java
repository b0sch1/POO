import javax.swing.JOptionPane;

public class MostrarDezena {
   public static void main (String[] args){
      String numero = JOptionPane.showInputDialog("Digite um número de 3 dígitos");
      String mostrador = numero.substring(1,2);
      JOptionPane.showMessageDialog(null, mostrador);
   }
}