import java.util.Scanner;
public class JoaoPedro20 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      String[] nome_usuario = new String[5];
      int[] num_conta = new int[5];
      float[] saldo_conta = new float[5];

      System.out.println("====================");
      System.out.println("| SISTEMA BANCÁRIO |");
      System.out.println("====================");
      System.out.println("CADASTRANDO USUÁRIO");
      System.out.println("===============================");
      for (int i = 0; i < nome_usuario.length; i++) 
      {
         System.out.print("Digite seu nome de usuário: ");
         nome_usuario[i] = teclado.nextLine();
         System.out.println("===============================");
         boolean contaValida;
         do {
               contaValida = true;
               System.out.print("Digite o número da sua conta: ");
               num_conta[i] = teclado.nextInt();
               for (int j = 0; j < i; j++) 
               {
                  if (num_conta[i] == num_conta[j]) 
                  {
                     contaValida = false;
                     System.out.println("Número de conta já existe. Tente novamente.");
                     break;
                  }
               }
         }while (!contaValida);

         System.out.print("Digite o saldo da sua conta: ");
         saldo_conta[i] = teclado.nextFloat();
         teclado.nextLine(); 
         System.out.println("===============================");
      }
      int operacao;
      do {
         System.out.println(" ");
         System.out.println("Menu de Operações: ");
         System.out.println("1. Efetuar depósito;");
         System.out.println("2. Efetuar saque;");
         System.out.println("3. Consultar saldo em conta;");
         System.out.println("4. Finalizar o programa;");
         System.out.println("===============================");
         System.out.print("Digite qual operação você quer fazer: ");
         operacao = teclado.nextInt();
         System.out.println("===============================");
         switch (operacao) 
         {
               case 1: 
                  System.out.print("Digite o número da conta: ");
                  int contaDeposito = teclado.nextInt();
                  boolean contaEncontrada = false;
                  for (int i = 0; i < num_conta.length; i++) 
                  {
                     if (num_conta[i] == contaDeposito) 
                     {
                           System.out.print("Digite o valor do depósito: ");
                           float valorDeposito = teclado.nextFloat();
                           saldo_conta[i] += valorDeposito;
                           System.out.println("Depósito realizado! Novo saldo: " + saldo_conta[i]);
                           contaEncontrada = true;
                           break;
                     }
                  }
                  if (!contaEncontrada) 
                  {
                     System.out.println("Conta não encontrada!");
                  }
                  break;
               case 2: 
                  System.out.print("Digite o número da conta: ");
                  int contaSaque = teclado.nextInt();
                  contaEncontrada = false;
                  for (int i = 0; i < num_conta.length; i++) 
                  {
                     if (num_conta[i] == contaSaque) 
                     {
                           System.out.print("Digite o valor do saque: ");
                           float valorSaque = teclado.nextFloat();
                           if (saldo_conta[i] >= valorSaque) 
                           {
                              saldo_conta[i] -= valorSaque;
                              System.out.println("Saque realizado! Novo saldo: " + saldo_conta[i]);
                           } 
                           else 
                           {
                              System.out.println("Saldo insuficiente!");
                           }
                           contaEncontrada = true;
                           break;
                     }
                  }
                  if (!contaEncontrada) 
                  {
                     System.out.println("Conta não encontrada!");
                  }
                  break;
               case 3: 
                  System.out.print("Digite o número da conta: ");
                  int contaConsulta = teclado.nextInt();
                  contaEncontrada = false;

                  for (int i = 0; i < num_conta.length; i++) 
                  {
                     if (num_conta[i] == contaConsulta) 
                     {
                           System.out.println("Saldo da conta " + contaConsulta + ": " + saldo_conta[i]);
                           contaEncontrada = true;
                           break;
                     }
                  }
                  if (!contaEncontrada) 
                  {
                     System.out.println("Conta não encontrada!");
                  }
                  break;
               case 4: 
                  System.out.println("Programa finalizado.");
                  break;

               default:
                  System.out.println("Opção inválida!");
         }
      } while (operacao != 4);

      teclado.close();
    }
}