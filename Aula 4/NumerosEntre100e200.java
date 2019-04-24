import javax.swing.JOptionPane;

public class NumerosEntre100e200{
   public static void main (String[] args){
      int cont, numero;
      cont = numero = 0;
      char continuar = 's';
      while (continuar == 's' || continuar == 'S'){
         numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
         if (numero >= 100 && numero <=200){
            cont++;
         }else if (numero == 0)
            System.exit(0);
         continuar = JOptionPane.showInputDialog("Deseja continuar? s/n").charAt(0);
      }
      JOptionPane.showMessageDialog(null, "Foram digitados " + cont + " números entre 100 e 200");
   }
}