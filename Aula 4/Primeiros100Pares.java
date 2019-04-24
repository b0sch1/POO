import javax.swing.JOptionPane;

public class Primeiros100Pares {
   public static void main (String[] args){
      String result = "";
      int quebralinha = 18;
      for (int cont = 0; cont <= 198; cont+=2){     
         if (cont < 10)
            result = result + " | " + "00" + cont;
         else {
            if (cont < 100){
               result = result + " | " + "0" + cont;
            }
            else{
               result = result + " | " + cont;
            }
         }
         if (cont == quebralinha){
            result = result + " |\n";
            quebralinha = quebralinha + 20;
         }
      }
      JOptionPane.showMessageDialog(null, result);
   }
}