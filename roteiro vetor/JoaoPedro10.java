import java.util.Scanner;
public class JoaoPedro10 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      Double[] A = new Double[10];
      int tam = A.length;
      
      for(int i = 0; i < tam; i++)
      {
         System.out.println("Digite o valor da posição "+ i+ ":");
         A[i] = teclado.nextDouble();
      }

      double S = 0;

      S = (Math.pow(A[0]-A[9],2))+ (Math.pow(A[1]- A[8],2))+ (Math.pow(A[2] - A[7], 2))+ (Math.pow(A[3]- A[6], 2)) + (Math.pow(A[4] - A[5], 2));

      System.out.println("S: "+ S);

      teclado.close();
   }
}