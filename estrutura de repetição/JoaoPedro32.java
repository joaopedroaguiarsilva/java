import java.util.Scanner; 
public class JoaoPedro32{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   double num, restdiv;
   long cont, divisor, somadivisor, contperfeito;
   cont = 1;
   divisor = 0;
   somadivisor = 0;
   contperfeito = 0;

   num = 1;

   while (contperfeito < 5)
   {
      somadivisor = 0;
      cont = 1;
      while (cont < num) 
      {
         restdiv = num % cont;
         if (restdiv == 0)
         {
            divisor = cont;
            somadivisor += divisor;
         }
         cont += 1;
      }
      if (somadivisor == num)
         {
            System.out.println(num + " é um número perfeito!");
            contperfeito ++;
         }
      num ++; 
   }     

   
    teclado.close();
   }
}