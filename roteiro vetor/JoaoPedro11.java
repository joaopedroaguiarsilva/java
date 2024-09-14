import java.util.Scanner;
public class JoaoPedro11 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      int[] A = new int[10];
      int[] B = new int[10];

      int tam = A.length;

      for (int i = 0; i < tam; i++) 
        {
            System.out.println("Digite o valor "+ (i+1) +" do primeiro vetor: ");
            A[i] = teclado.nextInt();

            System.out.println("Digite o valor "+ (i+1) +" do segundo vetor: "); 
            B[i] = teclado.nextInt();
        }

      int[] C = new int[20];




      for(int i = 0; i < tam; i++)
      {
         C[2 * i] = A[i];
         C[2 * i + 1] = B[i];
      }

      for(int i = 0; i < 20; i++)
      {
         System.out.println("Vetor resultante: "+ C[i]);
      }

      teclado.close();
   }
}