//Classe
public class Amigo{
//Atributos   
   private String nome, sexo, mensagem;
   private int idade;
//Construtor   
//Metodos consultores
   public String getNome(){
      return nome;
   }
   public String getSexo(){
      return sexo;
   }

   public String getMensagem(){
      return mensagem;
   }
   public int getIdade(){
      return idade;
   }
//Metodos modificadores   
   public void setNome(String nome){
      this.nome = nome;
   }
   public void setSexo(String sexo){
      this.sexo = sexo;
   }
   public void setMensagem(String mensagem){
   //tamanho da mensagem e no maximo 144
      if(mensagem.length() <= 144){
         this.mensagem = mensagem;
      } else {
      //trunca se for maior
         this.mensagem = mensagem.substring(0, 144);
      }
   }
   public void setIdade(int idade){
      this.idade = idade;
   }
//Metodo de mensagem   
   public String toString(){
      return "[Nome: "+nome+"] [Sexo: "+sexo+"] [Idade: "+idade+
         "]\n[Mensagem: "+mensagem+"]";
   }
}