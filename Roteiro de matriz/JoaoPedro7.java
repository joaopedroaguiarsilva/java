import java.util.Scanner; 
public class JoaoPedro7 {
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);
   
   int A [][] = new int [4][7]; 

   preencheMatriz(A, teclado);


   int menorelemento = Integer.MAX_VALUE;
   int linhadomenor = Integer.MAX_VALUE;

   for(int i =0; i < A.length; i++)
   {
      for(int j=0; j < A[0].length; j++)
      {
         if(A[i][j] < menorelemento)
         {
            menorelemento = A[i][j];
            linhadomenor = i;
         }
      }
   }

   int MINMAX = Integer.MIN_VALUE, colunaminmax = Integer.MAX_VALUE;

   for(int i =0; i < A.length; i++)
   {
      for(int j=0; j < A[0].length; j++)
      {
         if(A[linhadomenor][j] > MINMAX)
         {
            MINMAX = A[linhadomenor][j];
            colunaminmax = j;
         }
      }
   }

   System.out.println("MINMAX: "+ MINMAX);
   System.out.println("Na linnha: "+ linhadomenor);
   System.out.println("Na coluna "+ colunaminmax);


   teclado.close();


   
   }
   public static void preencheMatriz(int matriz[][], Scanner teclado) {
      System.out.println("Inteira");
      for(int i=0; i<matriz.length; i++) 
      {
         for(int j=0; j<matriz[0].length; j++) 
         {
            System.out.println("Digite o valor da linha "+i+" coluna "+j+":");
            matriz[i][j] = teclado.nextInt();
         }
      }    
   }
}