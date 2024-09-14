import java.util.Scanner;
public class JoaoPedro18 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      double media= 0, desvio_padrao= 0, soma_latas=0 ;
      double latas[] = new double[20];

      for(int i=0; i < latas.length; i++)
      {
         System.out.println("Digite a quantidade de produto que a lata "+ (i+1)+" possui em militros: ");
         latas[i] = teclado.nextDouble();
         soma_latas += + latas[i];
      }

      media= soma_latas / latas.length;

      double variancia= 0;
      for(int i = 0; i < latas.length; i++)
      {
         variancia += + Math.pow((media - latas[i]),2);
      }
      
      variancia = variancia / (20 -1);

      desvio_padrao = Math.sqrt(variancia);

      System.out.println(" ");
      System.out.println(desvio_padrao);
      System.out.println("");
      
      if (media < 385 || media > 395 || desvio_padrao > 5) 
      {
         System.out.println("O processo precisa ser revisado.");
      } 
      else 
      {
         System.out.println("O processo está funcionando corretamente.");
      }

      teclado.close();
   }
}