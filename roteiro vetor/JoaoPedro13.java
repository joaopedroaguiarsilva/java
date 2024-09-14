import java.util.Scanner;
public class JoaoPedro13 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      int NA, NB;

      System.out.println("Digite o número de elementos do conjunto A: ");
      NA = teclado.nextInt();

      int[] A = new int[NA];
      int tamA = A.length;

      for (int i = 0; i < tamA; i++) 
        {
            System.out.println("Digite o valor "+ (i+1) +" do vetor A: ");
            A[i] = teclado.nextInt();
        }
   
      System.out.println("Digite o número de elementos do conjunto B: ");
      NB = teclado.nextInt();
      
      int[] B = new int[NB];
      int tamB = B.length;

      for (int i = 0; i < tamB; i++) 
      {
         System.out.println("Digite o valor "+ (i+1) +" do vetor B: "); 
         B[i] = teclado.nextInt();
      }


      int[] C = new int[NA + NB];

      int tamC = C.length;

      
      // preenchendo o vetor c

      int ajuste =0;
      for (int i = 0; i < tamA; i++) 
      {
         C[ajuste++] = A[i];
      }
      for (int i = 0; i < tamB; i++) 
      {
         C[ajuste++] = B[i];
      }



      int auxiliar = 0;

      // colocando o vetor C em ordem crescente

      for(int i = 0; i < tamC - 1; i++)
      {
         for(int j = i + 1; j < tamC; j++)
         {
            if (C[i] > C[j])
            {
               auxiliar = C[i];
               C[i] = C[j];
               C[j] = auxiliar;
            }
         }
      }



      System.out.println("");

      System.out.println("Vetor C: ");

      for(int i = 0; i < tamC; i++)
      {
         System.out.print("{"+C[i]+"}" + " ");
      }

      System.out.println("");

      teclado.close();
   }
}