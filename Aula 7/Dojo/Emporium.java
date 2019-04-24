public class Emporium {
   public static void main (String args []) {
      /* Produto p1 = new Produto ("arroz", 3.57, 5);
      Produto p2 = new Produto ("tomate", 6.89, 0.5);
      System.out.println(p1.gastoComProduto()); 
      System.out.println(p2.gastoComProduto());  */
      
      Carrinho car = new Carrinho ();
      car.colocarProdutoNoCarrinho("Banana", 0.99, 50);
      car.colocarProdutoNoCarrinho("Laranja", 2.4, 3);
      
      //System.out.println(car.listaDeProdutos());
      
      Cliente cli = new Cliente ("Gil", "12345689" );
      //System.out.println(cli.getDados());
      
      Caixa cx = new Caixa(cli, car);
      System.out.println(cx.imprimirCompra());
      
      /* Produto p = car.removeProdutoDoCarrinho(0); //Removeu produto na primeira posiÃ§Ã£o do arraylist e atribuiu a p
      System.out.println("produto removido: \n " + p.gastoComProduto()); */
      
   }
}  
