import java.util.Scanner; 
public class JoaoPedro18{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   int operacao;
   double N1, N2, resultado;
   resultado = 0;
   
   System.out.println("------------------------");
   System.out.println("Calculadora do João");
   System.out.println("------------------------");
   System.out.println("Para usar a calculadora \ndigite o número referente a cada operção");
   System.out.println("------------------------");
   System.out.println("Opções:");
   System.out.println("1- Soma");
   System.out.println("2- Subtração");
   System.out.println("3- Multiplicação");
   System.out.println("4- Divisão");
   System.out.println("5- Sair");
   System.out.println("------------------------");
   System.out.println("Digite qual operação você quer fazer: ");
   operacao = teclado.nextInt();   
   System.out.println("------------------------");
   
   
   while (operacao != 5)
      {
         System.out.println("Digite o primeiro número da sua operação: ");
         N1 = teclado.nextDouble(); 
         System.out.println("------------------------");
         System.out.println("Digite o segundo número da sua operação: ");
         N2 = teclado.nextDouble();
         System.out.println("------------------------");

         switch (operacao) 
         {
            case 1:
               resultado = N1 + N2;
               System.out.printf("Resultado da soma: %.2f \n", resultado);
               break;
            case 2:
               resultado = N1 - N2;
               System.out.printf("Resultado da subtração: %.2f \n", resultado);
               break;
            case 3:
               resultado = N1 * N2;
               System.out.printf("Resultado da multiplicação: %.2f \n", resultado);
               break;
            case 4:
               resultado = N1 / N2;
               System.out.printf("Resultado da divisão: %.2f \n", resultado);
               break;
            default:
               System.out.println("Número inválido  ");               
         }
         System.out.println("Digite qual operação você quer fazer: ");
         operacao = teclado.nextInt();
      }
      System.out.println("");
      System.out.println("");
      if (operacao == 5)
      {
         System.out.println("----------------------");
         System.out.println("Saindo da calculadora...");
      }
      System.out.println("");
      System.out.println("");
   teclado.close();
   }
}