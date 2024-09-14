import java.util.Scanner; 
public class JoaoPedro19{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in, "ISO-8859-1");

   double soma, media, N, cont;
   soma = 0;
   cont = 0;
   media = 0;
   
   System.out.println("-------------------------------------");
   System.out.println("CALCULADORA DE MÉDIA  DOS POSITIVOS   ");
   System.out.println("---------------------------------------");
   System.out.println("Regras para usar a calculadora: ");
   System.out.println("---------------------------------------");
   System.out.println("Para usar digite qualquer número e para sair digite -1 ");
   System.out.println("---------------------------------------");
   System.out.println("Digite qualquer número: ");
   N = teclado.nextInt();

   
   while (N != -1)
   {
         if (N > 0)
         {
            soma = soma + N;
            cont = cont + 1;
         }      
         System.out.println("Digite qualquer número: ");
         N = teclado.nextDouble();
   }
   if  (cont > 0)
   {
      media = soma / cont;
      System.out.printf("Média de todos os números positivos digitados: %.2f",  media);
   }
   else
   {
      System.out.println("Você não digitou um número inteiro");
   }



   teclado.close();
}
}