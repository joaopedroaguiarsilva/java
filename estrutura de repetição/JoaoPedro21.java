import java.util.Scanner; 
public class JoaoPedro21{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   int N, copiaN, digito, testeN;
  
   testeN = 0;

   System.out.println("Digite um número: ");
   N = teclado.nextInt();
   
   copiaN = N;

   while (copiaN != 0)
   {  
      digito = copiaN % 10;
      copiaN = copiaN / 10;
      testeN =  digito + testeN * 10;
   }


    if (testeN == N)
    {
        System.out.println("Esse número é palíndromo");
    }
    else
    {
        System.out.println("Esse número não é palíndromo");
    }

   

  
   teclado.close();
   }
}