import java.util.Scanner; 
public class JoaoPedro15 {
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   int cont, N, T1, T2;
   T1 = 1;
   cont = 1;
   T2 = 0;

   /*
    1,1,2,3,5,8 


   print T1
   T2 = T2 + T1
   print T2
   T1= T1 + T2
    */

   System.out.println("Digite até qual termo você quer que sua série de Fibonacci va: ");
   N = teclado.nextInt();   


   while (cont <= (N - 1))
   {  
      if (cont == (N - 1))
      {
         System.out.print(T1+ ", ");
         T2 = T2 + T1;
         System.out.print(T2+ ". ");
         T1 = T1 + T2; 
         cont = cont + 2; 
      }
      else
      {
         System.out.print(T1+ ", ");
         T2 = T2 + T1;
         System.out.print(T2+ ", ");
         T1 = T1 + T2;
         cont = cont + 2;  
      }
   }

  
   teclado.close();
   }
}