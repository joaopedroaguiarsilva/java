import java.util.Scanner; 
public class JoaoPedro2 {
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);
   
   double [] [] matriz = new double [3] [5];
   double[] vet = new double [3];
   
   
   for(int i = 0; i < 3; i++)
   {
      for(int j = 0; j < 5; j++)
      {
         System.out.println("Digite o valor da coluna "+ (j+1)+" e da linha "+ (i+1)+ " : ");
         matriz[i] [j] = teclado.nextInt();
      }
   }

   double maiorvalor = 0;

   for(int i = 0; i < 3; i++)
   {
      for(int j = 0; j < 5; j++)
      {
         vet[i] += + matriz[i] [j];
      }
      if (vet[i] > maiorvalor) 
      {
         maiorvalor = i+1;
      }
   }

   System.out.println("");
   System.out.println("Valores de cada linha: ");
   for(int i = 0; i < 3; i++)
   {
      System.out.println(vet[i]+" ");
   }
   System.out.println("");
   System.out.println("Linha com maior valor: "+ maiorvalor);
   
   teclado.close();
      
   }
}