import java.util.Scanner;
public class JoaoPedro8 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      double[] vetor1 = new double[10];
      double[] vetor2 = new double[10];
      double[] vetor3 = new double[10];

      int tam = vetor1.length;

      for(int i = 0; i < tam; i++)
      {
         System.out.println("Digite o valor da posição " +i+ " no seu vetor1 :");
         vetor1[i] = teclado.nextDouble();
         System.out.println("Digite o valor da posição " +i+ " no seu vetor2 :");
         vetor2[i] = teclado.nextDouble();
      }

      for(int i = 0; i < tam; i++)
      {
         if (vetor1[i] == vetor2[i]) 
         {
            vetor3[i] = 1;
         }
         else 
         {
            vetor3[i] = 0;
         }
      }

      System.out.println("Vetor3:");
         for (int i = 0; i < tam; i++) {
             System.out.println("Posição " + i + ": " + vetor3[i]);
         }

      teclado.close();
   }
}