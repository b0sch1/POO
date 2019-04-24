public class Marca{
   private String marca;
   private String cnpj;
   
   public Marca(String marca, String cnpj){
      this.marca = marca;
      this.cnpj = cnpj;
   }
   
   public String getMarca(){
      return marca;
   }
   
   public String getCNPJ(){
      return cnpj;
   }
         
   public String getDados(){
      return "Marca: " + marca + "\nCNPJ: " + cnpj;
   }
   
   public void setMarca(String marca){
      this.marca = marca;
   }
   
   public void setCNPJ(String cnpj){
      this.cnpj = cnpj;      
   }
  
}
