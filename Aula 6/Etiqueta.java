public class Etiqueta{
   private String tamanho;
   private Marca marca;
   
   public Etiqueta(Marca marca, String tamanho){
      this.marca = marca;
      setTamanho(tamanho);
   }   
   
   public String getTamanho(){
      return tamanho;
   }
   
   public String getDados(){
	   return "Etiqueta: \n" + marca.getDados() + "\nTamanho: " + tamanho;
   }
   
   public void setMarca(Marca marca){
      this.marca = marca;
   }
   
   public void setTamanho(String tamanho){
      if (tamanho.equalsIgnoreCase("P") || 
          tamanho.equalsIgnoreCase("M") ||
          tamanho.equalsIgnoreCase("G") ||
          tamanho.equalsIgnoreCase("XG")||
          tamanho.equalsIgnoreCase("XXG") ){
         this.tamanho = tamanho;
      }
      else {
         this.tamanho = "U";
      }
   }
}