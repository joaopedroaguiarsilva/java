import java.util.Scanner;
public class JoaoPedro15 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      int[] vet = new int[5];
      
      for(int i = 0; i < 5; i++)
      {
         System.out.println("Digite a posição "+ (i + 1)+" do seu vetor: ");
         vet[i] = teclado.nextInt();
      }

      int somatorio = 0, produtorio = 1 ;

      for(int i = 0; i < 5; i++)
      {
         somatorio = somatorio + vet[i];
         produtorio = produtorio * vet[i];
      }

      System.out.println(" ");
      System.out.println(" ");
      System.out.println(somatorio);
      System.out.println(produtorio);

      System.out.println(" ");
      System.out.println(" ");

      teclado.close();
   }
}