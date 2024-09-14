import java.util.Scanner;
public class JoaoPedro16 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      int[] vet = new int[10];
      int fatorial = 1;

      for (int i = 0; i < 10; i++) 
      {
         if(i == 0)
         {
            vet[i] = 0;
         }
         else
         {
            fatorial = i * fatorial;
            vet[i] = fatorial;
         }
      }
      
      System.out.println(" ");
      System.out.println(" ");

      for (int i = 0; i < 10; i++) 
      {
         System.out.print("{"+vet[i]+"} ");
      }


      teclado.close();
   }
}