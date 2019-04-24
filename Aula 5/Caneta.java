import javax.swing.JOptionPane;

public class Caneta {
   private String tipo; // Atributos ou Variaveis de Instância
   private String cor;
  
   //Construtor
   public Caneta (String cor, String tipo) {
      this.cor = cor;
      this.tipo = tipo;
   }
   
   //Metodos de Acesso
   public String getCor () {
      return this.cor;
   }
   public String getTipo () {
      return this.tipo;
   }
   public void setCor(String novaCor){
      this.cor = novaCor;
   }
   public void setTipo(String novaTipo){
      this.tipo = novaTipo;
   }
}