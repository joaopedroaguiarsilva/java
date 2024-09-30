import java.util.Scanner; 
public class JoaoPedro3 {
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);
   
   
   int linhas, colunas;

   System.out.println("Digite o número de linhas da sua segunda matriz: ");
   linhas = teclado.nextInt();
   System.out.println("Digte o número de colunas da sua segunda matriz: ");
   colunas = teclado.nextInt();

   double A[][]= new double[3][4];
   double B[][]= new double[linhas][colunas];

   preencherMatriz(A, teclado);
   preencherMatriz(B, teclado);

   if(linhas == 4)
   {
      double C[][]= new double[3][colunas];

   }
   else
   {
      System.out.println("Não é possível realizar uma multiplicação entre essas duas matrizes! ");
   }

   teclado.close();
   }

   public static void preencherMatriz (double matriz [] [], Scanner teclado)
   {
      for(int i=0; i<matriz.length; i++) 
      {
         for(int j=0; j<matriz[0].length; j++) 
         {
            System.out.println("Digite o valor da linha "+(i+1) +" coluna "+(j+1)+":");
            matriz[i][j] = teclado.nextDouble();
         }
      }    
   }

   public static void imprimeMatriz(double matriz[][]) {    	
      for(int i=0; i<matriz.length; i++) 
      {
         for(int j=0; j<matriz[0].length; j++) 
         {
            System.out.print(matriz[i][j]+"\t");
         }
         System.out.println("");
      }    
   }  
}