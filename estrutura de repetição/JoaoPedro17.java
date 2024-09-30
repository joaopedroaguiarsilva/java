import java.util.Scanner; 
public class JoaoPedro17 {
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   int N1, N2, resto;

   System.out.println("Digite o primeiro número: ");
   N1 = teclado.nextInt();
   
   System.out.println("Digite o segundo número: ");
   N2 = teclado.nextInt();


   while (N2 != 0)
   {  
      resto = N1 % N2;
      N1 = N2;
      N2 = resto;
   }

   System.out.println("MDC: "+ N1);

  
   teclado.close();
   }
}