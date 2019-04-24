public class Produto{
   private String nome;
   private double preco;
   private Etiqueta etiqueta;
   
   public Produto(String nome, double preco, Etiqueta etiqueta){
      setNome(nome);
      setPreco(preco);
      setEtiqueta(etiqueta);
   }
   
   public String getNome(){
      return nome;
   }
   
   public double getPreco(){
      return preco;
   }
   
   public Etiqueta getEtiqueta(){
      return etiqueta;
   }
   
   public String getDados(){
      return "Produto: " + getNome() + "\nPreço: " + getPreco() + "\n" + etiqueta.getDados();
     }
   
   public void setNome(String nome){
      this.nome = nome;
   }
   
   public void setPreco(double preco){
      this.preco = preco;
   }
   public void setEtiqueta(Etiqueta etiqueta){
      this.etiqueta = etiqueta;
   }
   
}
