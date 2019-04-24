public class Aluno {  
// atributos  
   private String nome; 
   private int idade;  
   private double peso; 
   private boolean formando; 
   private char sexo; 
 
// método construtor  
   public Aluno(String n, int i, double p, char s) {
      nome = n;
      idade = i;
      peso = p;
      sexo = s;
      formando = false;
   }  
// métodos de acesso
   public String getNome() {
      return nome;
   } 
 
   public int getIdade() {
      return idade;
   } 
 
   public double getPeso() {   
      return peso;
   } 
 
   public boolean getFormando() {   
      return formando;
   } 
 
   public char getSexo() {   
      return sexo;
   }
// métodos modificadores  public void setNome(String n) {   nome = n;  } 
 
   public void setIdade(int i) {   
      idade = i;
   } 
 
   public void setPeso(double p) {   
      peso = p;  
   } 
 
   public void setFormando(boolean f) {   
      formando = f;  
   } 
 
   public void setSexo(char s) {  
      sexo = s;  
   } 
}