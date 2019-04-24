import javax.swing.JOptionPane;

public class IMC {
   public static void main (String[] args){
      double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
      double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
      double imc = peso / (Math.pow(altura,2));
      if ( imc <= 0 || peso == 0 || altura == 0){
         JOptionPane.showMessageDialog(null,"Valor Inválido");
      }
      else if ( imc < 18.5 ){
         JOptionPane.showMessageDialog(null, "Magreza");
      }
      else if ( imc < 25.0 ){                            // não é necessário perguntar se é >= 18.5 pois o else ja deixa claro que é
         JOptionPane.showMessageDialog(null, "Saudável");
      }
      else if ( imc < 30.0 ){
         JOptionPane.showMessageDialog(null, "Sobrepeso");
      }
      else if ( imc < 35.0 ){
         JOptionPane.showMessageDialog(null, "Obesidade Grau I");
      }
      else if ( imc < 40.0 ){
         JOptionPane.showMessageDialog(null, "Obesidade Grau II (Severa)");
      }
      else {
         JOptionPane.showMessageDialog(null, "Obesidade Grau III (Mórbida)");
      }
   }
}