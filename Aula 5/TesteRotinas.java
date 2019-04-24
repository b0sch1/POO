public class TesteRotinas{
   
   public static int soma (int x, int y){
      return x + y;
   }
   
   public static int multiplica (int x, int y){
      return x * y;
   }
   
   public static void main (String args[]){
      int a = soma(34,56);
      int b = multiplica(11,3);
      int c = soma(soma(1,4),multiplica(2,8));
      
      System.out.print(a + " " + b + " " + c);
   }
}