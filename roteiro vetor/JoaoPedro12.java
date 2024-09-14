import java.util.Scanner;
public class JoaoPedro12 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      int[] A = new int[10];

      int j  =0 , auxiliar = 0;

      for (int i = 0; i < 10; i++) 
      {
         System.out.println("Preencha a posição "+ (i+1)+" do seu vetor: ");
         A[i] = teclado.nextInt();
      }

      // ordem crescente

      for (int i = 0; i < 9; i++) 
      {
         for(j = i + 1; j < 10; j++)
         {
            if (A[i] > A[j]) 
            {
               auxiliar = A[i];
               A[i] = A[j];
               A[j] = auxiliar;
            }       
         }
      }  

      System.out.println("Vetor crescente: ");
      for (int i = 0; i < 10; i++) 
      {
         System.out.print("{"+A[i]+"}" + " ");
      }   
      
      System.out.println("");


      // ordem decrescente
      for (int i = 0; i < 9; i++) 
      {
         for(j = i + 1; j < 10; j++)
         {
            if (A[i] < A[j]) 
            {
               auxiliar = A[i];
               A[i] = A[j];
               A[j] = auxiliar;
            }       
         }
      }  

      System.out.println("Vetor decrescente: ");
      for (int i = 0; i < 10; i++) 
      {
         System.out.print("{"+A[i]+"}" + " ");
      }   
      System.out.println(" ");
      System.out.println(" ");


      teclado.close();
   }
}