import java.util.Scanner; 
public class JoaoPedro9 {
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);
   
   double A [][] = new double [8][8];

   preencheMatriz(A, teclado);

   boolean simetria = true;

   for(int i =0; i < A.length; i++)
   {
      for(int j=0; j < A[0].length; j++)
      {
         if (A[i][j] != A[j][i]) 
         {
            simetria= false;
            break;
         }
      }
   }

   if(simetria == true)
   {
      System.out.println("Essa matriz é simétrica! ");
   }
   else
   {
      System.out.println("Essa matriz não é simétrica! ");
   }


   teclado.close();
   }
   public static void preencheMatriz(double[][] matriz, Scanner teclado) {
      for (int i = 0; i < matriz.length; i++) 
      {
          for (int j = 0; j < matriz[0].length; j++) 
          {
              System.out.println("Digite o valor da linha " + i + " coluna " + j + ":");
              matriz[i][j] = teclado.nextInt();
          }
      }
  }
}