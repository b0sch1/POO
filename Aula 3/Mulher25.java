import javax.swing.JOptionPane;

public class Mulher25{
   public static void main (String[] args){
      String nome = JOptionPane.showInputDialog("Digite seu nome");
      String sexo = JOptionPane.showInputDialog("Digite seu sexo");
      int idade = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade"));
   
      if ( sexo.equalsIgnoreCase("Feminino") && idade < 25 ){
         JOptionPane.showMessageDialog(null, nome + " ACEITA");
      }
      else if ( sexo.equalsIgnoreCase("Feminino") ){
         JOptionPane.showMessageDialog(null, nome + " NÃO ACEITA");
      }
      else if ( sexo.equalsIgnoreCase("Masculino") ){
         JOptionPane.showMessageDialog(null, nome + " NÃO ACEITO");
      }
      else {
         JOptionPane.showMessageDialog(null, "ERRO");
      }
   }
}