//Contador de 100 até 1
public class ForWhileDoWhile {
   public static void main (String[] args){
      int num;
      for (num=100; num>0; num--){  //Se declarar a variavel dentro do for ela é apagada fora dele
         System.out.println(num);
      }
      System.out.println("Depois que sai do for fica: " + num);
      
      num = 100;
      while (num>0){
         System.out.println(num);
         num--;
      }
      System.out.println("Depois que sai do while fica: " + num);
      
      num = 100;   
      do {
         System.out.println(num);
         num--;
      } while (num>0);
      System.out.println("Depois que sai do do-while fica: " + num);
   }
}