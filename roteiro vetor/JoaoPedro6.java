import java.util.Scanner;
public class JoaoPedro6 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      int N;

      System.out.println("Digite o tamanho do seu conjunto: ");
      N = teclado.nextInt();

      if (N > 100)
      {
         System.out.println("Por favor, digite um número menor ou igual a 100! ");
        teclado.close();
        return;
      } 
      else if (N == 0)
      {
         System.out.println("Você digitou o número 0, logo seu conjunto não tem tamanho! ");
         System.exit(0);
      }

      int [] conjunto = new int[N];

      for(int i = 0; i < N; i++)
      {
         System.out.println("Digite o número que vai entrar na posição "+ i+":");  
         conjunto[i] = teclado.nextInt();
      }

      int restdiv = 0 , contpar = 0, contimpar = 0;

      for(int i = 0; i < N; i++)
      {
         restdiv = conjunto[i] % 2;
         if (conjunto[i] > 0 && restdiv == 0) 
         {
            contpar = contpar + 1;
         }
         else if(conjunto[i] < 0 || restdiv != 0)
         {
            contimpar = contimpar + 1;
         }
      }

      int [] conjuntopar = new int[contpar];
      int [] conjuntoimpar = new int[contimpar];

      int auxiliarimpar = 0, auxiliarpar = 0;

      for(int i = 0; i < N; i++)
      {
         restdiv = conjunto[i] % 2;
         if (conjunto[i] > 0 && restdiv == 0) 
         {
               conjuntopar[auxiliarpar] = conjunto[i]; 
               auxiliarpar = auxiliarpar + 1;
         }
         else if(conjunto[i] < 0 || restdiv == 1)
         {
               conjuntoimpar[auxiliarimpar] = conjunto[i];
               auxiliarimpar = auxiliarimpar + 1;
         }
      }

      System.out.println("");

      System.out.print("Conjunto 1: ");
      for (int j = 0; j < contpar; j++)
      {
         System.out.print(conjuntopar[j]);
         System.out.print(" ");
      }

      System.out.println("");

      System.out.print("Conjunto 2: ");
      for (int j = 0; j < contpar; j++)
      {
         System.out.print(conjuntoimpar[j]);
         System.out.print(" ");
      }

      System.out.println("");
      System.out.println("");

      teclado.close();
   }
}