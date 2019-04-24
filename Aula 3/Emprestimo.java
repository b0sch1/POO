//propositalmente sem acentos
import javax.swing.JOptionPane;
public class Emprestimo
{
   public static void main(String[] args) {
   //ler os valores do salario e do emprestimo
      String sSalario = JOptionPane.showInputDialog(
         "Digite o valor do salario: ");
      String sPrestacao = JOptionPane.showInputDialog(
         "Digite o valor da prestacao: ");
      //converter para real
      double salario = Double.parseDouble(sSalario);
      double prestacao = Double.parseDouble(sPrestacao);
      //calcular relacao entre prestacao e salario e imprimir
      double relacao = 100.0*prestacao/salario;
      System.out.println("Relacao entre parcela e salario: "
         + relacao + "%");
      //testar a condicao e informar o resultado
      if(relacao > 30){
         System.out.println("O valor de parcela excede 30% do"
            + " salario");
         System.out.println("Emprestimo negado.");
      } else {
         System.out.println("Emprestimo concedido.");
        }
   }
}