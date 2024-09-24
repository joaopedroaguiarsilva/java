import java.util.Scanner; 
public class JoaoPedro1{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);
   int [] [] matriz = new int [2] [2];
   
   int maior_valor = 0;

   
   for(int i = 0; i < 2; i++)
   {
      for(int j = 0; j < 2; j++)
      {
         System.out.print("Digite o valor dessa posição: ");
         matriz[i] [j] = teclado.nextInt();
         
         if(matriz[i] [j] > maior_valor)
            {
               maior_valor = matriz[i] [j];
            }

      }
   }
   
   System.out.print(" ");

    
   for(int i = 0; i < 2; i++)
   {
      for(int j = 0; j < 2; j++)
      {
         matriz[i] [j] = matriz[i] [j] * maior_valor;
         System.out.print(matriz[i] [j]  + "|");
      }
      System.out.print("\n");
   }

   
   


   teclado.close();


   
   }
}