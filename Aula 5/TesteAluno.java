import javax.swing.JOptionPane;
public class TesteAluno { 

// cadastrar um novo aluno no metodo main  
   public static void main(String[] args) { 
   
   // coletando os dados do aluno a ser cadastrado 
   
      String nome = JOptionPane.showInputDialog("Nome");   
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));   
      double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));  
   // pega o primeiro caracter da String e retorna como char
      char sexo = JOptionPane.showInputDialog("Sexo M/F").charAt(0); 
   
   // cria um objeto aluno 
      Aluno aluno = new Aluno(nome, idade, peso, sexo); 
   
   // monta a String de saida chamando os metodos de acesso do aluno
      String msg = "Nome: " + aluno.getNome() + "\nIdade: "
           + aluno.getIdade() + " anos" + "\nPeso: " + aluno.getPeso()
           + " kg";   
      if (aluno.getFormando()) {   
         msg += "\nFormando: sim";
      } 
      else { 
         msg += "\nFormando: nao";   
      } 
      if (aluno.getSexo() == 'M') {
         msg += "\nsexo: masculino";
      }
      else {  
         msg += "\nsexo: feminino";
      }   
   // mostra o aluno 
      JOptionPane.showMessageDialog(null, msg); 
   
   // altera informacoes; nao precisa criar todas as variaveis novamente 
      idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
      peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
   // tem que digitar true ou false
      boolean formando = Boolean.parseBoolean(JOptionPane     .showInputDialog("E' formando?true/false")); 
   
   // muda usando os metodo modificadores
      aluno.setIdade(idade);
      aluno.setPeso(peso); 
      aluno.setFormando(formando); 
   
   // mostra novamente o cadastro do aluno 
      JOptionPane.showMessageDialog(null, msg);
   // monta a String de saida chamando os metodos de acesso do aluno  
      msg = "Nome: " + aluno.getNome() + "\nIdade: " + aluno.getIdade()
         + " anos" + "\nPeso: " + aluno.getPeso() + " kg";
      if (aluno.getFormando()) {
         msg += "\nFormando: sim";
      }
      else {
         msg += "\nFormando: nao";
      }
      if (aluno.getSexo() == 'M') {
         msg += "\nsexo: masculino";
      } 
      else {
         msg += "\nsexo: feminino";
      } 
   
   // mostra o aluno
      JOptionPane.showMessageDialog(null, msg);  
   } 
}