import java.util.Scanner;
public class JoaoPedro4 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      double [] quadrado = new double[10];

      double tam = quadrado.length;


      for(int i = 0; i < tam; i++)
      {
         quadrado[i] = Math.pow(i,2) ;
         System.out.print(quadrado[i]);
         System.out.print("  ");
      }


      teclado.close();
   }
}