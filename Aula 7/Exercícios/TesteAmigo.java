public class TesteAmigo {
   public static void main (String args []){
      Amigo imaginario = new Amigo ();
      System.out.println(imaginario);
      imaginario.setNome("Gal");
      imaginario.setSexo("fem");
      imaginario.setIdade(56);
      System.out.println(imaginario);
      
      Amigo daOnca = new Amigo();
      daOnca.setNome("Mogli");
      daOnca.setSexo("masc");
      daOnca.setIdade(8);
      
      Rede meuFace = new Rede();
      meuFace.addAmigo(imaginario);
      meuFace.addAmigo(daOnca);
      
      int posicao = meuFace.buscar("Mogli");
      System.out.println("Encontrei o Mogli na posicao " + posicao);
      
      posicao = meuFace.buscar("Brad");
      if (posicao >=0){
         System.out.println("Brad esta no meuFace");
      }
      else{
         System.out.println("Brad nem apareceu");
      }
   }
}