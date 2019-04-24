public class Produto {
   private String nome;
   private double preco;
   private int quantidade;
   
   public Produto (String nome, double preco, int quantidade) {
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;
   }
   public String getNome() {
      return this.nome;
   }
   public double getPreco() {
      return this.preco;
   }
   public int getQuantidade() {
      return this.quantidade;
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   public void setPreco(double preco) {
      this.preco = preco;
   }
   public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
   }
}