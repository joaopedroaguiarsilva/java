import java.util.Scanner;
public class JoaoPedro1 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      int[] idade = new int[40];
      String[] nome = new String[40];
      int tam = idade.length;

      int i, maior16, menorigual16, somaidade, maisnovo, maisvelho;

      String nomemaisnovo, nomemaisvelho;

      nomemaisnovo = "";
      nomemaisvelho = "";

      double mediaidade;

      maior16 = 0;
      somaidade = 0;
      menorigual16 = 0;
      mediaidade = 0;
      maisnovo = 1000;
      maisvelho = 0;

      for(i = 0; i < tam; ++i) 
      {
         System.out.println("Qual é o nome do aluno: ");
         nome[i] = teclado.nextLine();
         System.out.println("Digite a idade do aluno: ");
         idade[i] = teclado.nextInt();
         teclado.nextLine();

         if (idade[i] > 16)
         {
            maior16 += +1;
         }
         else if (idade[i] <= 16)
         {
            menorigual16 += +1;
         }
         somaidade = idade[i] + somaidade;

         if (idade [i] < maisnovo)
         {
            maisnovo = idade [i];
            nomemaisnovo = nome[i];
         }
         if (idade [i] > maisvelho)
         {
            maisvelho = idade [i];
            nomemaisvelho = nome [i];
         }
      }

      System.out.println("Total de alunos com idade menor ou igual a 16 anos: "+ menorigual16);
      System.out.println("=========================");
      System.out.println("Total de alunos com idade maior que 16 anos: "+ maior16);
      System.out.println("=========================");

      mediaidade = somaidade / tam;

      System.out.printf("Média das idades: %.2f \n", mediaidade);

      for (i = 0; i < tam; ++i)
      {
         if (idade [i] > mediaidade)
         {
            System.out.println(nome [i] + " está acima da média! ");
         }
      }
      System.out.println("==-------------------");
      System.out.println("Nome aluno mais novo: "+ nomemaisnovo);
      System.out.println("Idade aluno mais novo: "+ maisnovo);
      System.out.println("======================");
      System.out.println("Nome aluno mais velho: "+ nomemaisvelho);
      System.out.println("Idade aluno mais velho: "+ maisvelho);

      


      teclado.close();
   }
}