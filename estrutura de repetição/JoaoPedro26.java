import java.util.Scanner; 
public class JoaoPedro26{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   double X, seno,  exp, fatorial, numerador;
  
   fatorial = 1;
   exp =1;
   seno = 0;
  
   System.out.println("Digite o valor do ângulo em graus do ângulo que você quer saber o seno: ");
   X = teclado.nextInt();

    X = (3.14 * X) / 180;
   
   for (int i=1; i <= 15; i++)
    {
      numerador = Math.pow(X, exp);
      fatorial = 1;
      for(int  j = 1; j <= exp; j++)
      {
        fatorial = fatorial * j;
      }
      if (i % 2 == 0)
      {
        seno -= numerador/fatorial;
      }
      else{
        seno += numerador/fatorial; 
      }
      exp = exp + 2;
    }
   System.out.printf("Seno: %.2f \n", seno);
   
   teclado.close();
   }
}