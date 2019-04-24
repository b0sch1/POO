import javax.swing.JOptionPane;

public class RaizPowPN {
   public static void main (String[] args){
      JOptionPane.showMessageDialog(null, "<html><body>Digite um número,<br> Se ele for positivo, mostrarei a raiz quadrada dele,<br> Se for negativo o mostrarei ao quadrado,<br> Se for 0 não farei nada :(</body></html>"); 
      double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
      if (numero > 0){
         double raiz = Math.sqrt(numero);
         JOptionPane.showMessageDialog(null, "<html><body>Você colocou um número positivo,<br> Então a raiz de " + numero + String.format(" é %.2f", raiz) + "</body></html>");
      }
      else{
         if (numero < 0){
            double pow = Math.pow(numero,2);
            JOptionPane.showMessageDialog(null, "<html><body>Você colocou um número negativo,<br> Então " + numero + " elevado ao quadrado" + String.format(" é %.2f", pow) + "</body></html>");
         }
         else
            JOptionPane.showMessageDialog(null, ":(");
      }
   }
}