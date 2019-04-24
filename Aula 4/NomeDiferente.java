import javax.swing.JOptionPane;

public class NomeDiferente{
   public static void main (String[] args){
      String nome = JOptionPane.showInputDialog("Digite FIM se quiser parar\nDigite um nome:");
      String nomes = "";
      while (!nome.equals("FIM")&&!nome.equals("")){
         nomes = nomes + "\n" + nome;
         nome = JOptionPane.showInputDialog("Digite FIM se quiser parar\nDigite o próximo nome:");
      }
      JOptionPane.showMessageDialog(null, "Lista de Nomes" + nomes);
   }
}