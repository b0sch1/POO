import javax.swing.JOptionPane;
public class Teste{
   public static void main(String[] args){
      Rede rede = new Rede();
      int menu;
      String nome = null;
      String sexo = null;
      do{
         menu = Integer.parseInt(JOptionPane.showInputDialog(
            "1 add amigo\n2 block amigo\n3 procura amigo"+
            "\n4 envia mensagem\n5 lista velhos\n6 sair"+
            "\n7 listar todos"));
         if(menu == 1){
            nome = JOptionPane.showInputDialog("Nome:");
            sexo = JOptionPane.showInputDialog("Sexo:");
            int idade = Integer.parseInt(
               JOptionPane.showInputDialog("Idade:"));
            rede.addAmigo(nome, sexo, idade);
         }
         else if(menu == 2){
            nome = JOptionPane.showInputDialog("Nome para remover:");
            if(rede.blockAmigo(nome)){
               JOptionPane.showMessageDialog(null, "Removido");
            }
            else {
               JOptionPane.showMessageDialog(null, "Nao encontrado");
            }
         }
         else if(menu == 3){
            nome = JOptionPane.showInputDialog("Nome para"+
               " procurar:");
            int posicao = rede.procurarAmigo(nome);
            if(posicao >= 0){
               JOptionPane.showMessageDialog(null, "Encontrado em "
                  +posicao);
            }
            else {
               JOptionPane.showMessageDialog(null, "Nao encontrado");
            }
         }
         else if(menu == 4){
            String mensagem = JOptionPane.showInputDialog(
               "Mensagem:");
            nome = JOptionPane.showInputDialog("Nome para enviar:");
            if(rede.enviarMensagem(nome, mensagem)){
               JOptionPane.showMessageDialog(null,
                  "Mensagem enviada");
            
            }
            else {
               JOptionPane.showMessageDialog(null,
                  "Nao encontrado");
            }
         }
         else if(menu == 5){
            Amigo[] amigos = rede.procurarVelhos();
            for(int i = 0; i < amigos.length; i++){
               System.out.println(amigos[i]);
            }
         }
         else if(menu == 6){
         }
         else if(menu == 7){
            rede.listarAmigos();
         }
         else {
            JOptionPane.showMessageDialog(null,
               "Opcao invalida");
         }
      }while(menu != 6);
   }
}