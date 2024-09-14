import java.util.Scanner; 
public class JoaoPedro20{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in, "ISO-8859-1");

   double somapares, somaimpares, mediapares, mediaimpares, N, contpar, contimpar,maiorpar, menorimpar, restdiv;
   contpar = 0;
   contimpar = 0;
   somapares = 0;
   somaimpares = 0;
   mediaimpares = 0;
   mediapares = 0;
   maiorpar = 0;
   menorimpar = 999999999;

   
   System.out.println("-------------------------------------");
   System.out.println("CALCULADORA DE MÉDIA DA MÉDIA DE PARES E ÍMPARES DIGITDOS");
   System.out.println("---------------------------------------");
   System.out.println("Regras para usar a calculadora: ");
   System.out.println("---------------------------------------");
   System.out.println("Para usar digite qualquer número e para sair digite um número negativo");
   System.out.println("---------------------------------------");
   System.out.println("Digite qualquer número: ");
   N = teclado.nextDouble();

   
   while (N >= 0)
   {
        restdiv = N % 2;
        if (restdiv == 1) 
        {
            contimpar = contimpar + 1;
            somaimpares = somaimpares + N;
            if (N < menorimpar)
            {
                menorimpar = N;
            }
        }
        else if (restdiv == 0)
        {
            if (N > maiorpar)
            {
                maiorpar = N;
            }
            contpar = contpar + 1;
            somapares = somapares + N;
        }
        
        System.out.println("Digite qualquer número: ");
        N = teclado.nextDouble();
   }

   if (contimpar == 0)
   {
    System.out.println("Você não digitou nenhum número ímpar!");
   }
   else
   {
        mediaimpares = somaimpares / contimpar;
        System.out.printf("Média de todos os números ímpares digitados: %.2f \n" , mediaimpares);
        System.out.printf("Menor número ímpar digitado: %.2f \n", menorimpar);
   }

   if (contpar == 0)
   {
    System.out.println("Você não digitou nenhum número par!");
   }
   else
   {
        mediapares = somapares / contpar;
        System.out.printf("Média de todos os números ímpares digitados: %.2f \n" , mediapares);
        System.out.printf("Menor número ímpar digitado: %.2f \n", maiorpar);
   }

   teclado.close();
}
}