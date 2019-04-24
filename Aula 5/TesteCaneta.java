public class TesteCaneta{
   public static void main (String[] args){
      Caneta c1 = new Caneta( "azul", "tinteiro" );
      Caneta c2 = new Caneta( "rosa", "gel" );
   
      System.out.println("caneta 1\ncor: " + c1.getCor() + "\ntipo: " + c1.getTipo() + "\n");
      System.out.println("caneta 2\ncor: " + c2.getCor() + "\ntipo: " + c2.getTipo() + "\n");
      
      c1.setCor("verde");
      c2.setTipo("esferografica");
      
      System.out.println("caneta 1\ncor: " + c1.getCor() + "\ntipo: " + c1.getTipo() + "\n");
      System.out.println("caneta 2\ncor: " + c2.getCor() + "\ntipo: " + c2.getTipo() + "\n");
   }
}