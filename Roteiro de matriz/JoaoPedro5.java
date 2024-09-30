import java.util.Scanner; 
public class JoaoPedro5 {
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);
   
   double [] [] alunos_prova = new double [10][5];

   String[] nomes = new String [10];
   
   preencherMatriz(alunos_prova, teclado);

   for(int i =0; i < nomes.length; i++)
   {
      teclado.nextLine();
      System.out.println("Digite o nome do "+ (i+1)+"* aluno: ");
      nomes[i] = teclado.nextLine();
   }

   double soma [] = new double[10];
   double media [] = new double [10];

   for(int i= 0; i < alunos_prova.length; i++)
   {
      soma[i] = 0;
      for(int j= 0; j < alunos_prova[0].length; j++)
      {
         soma[i] = soma[i] + alunos_prova[i][j];
      }
      media[i] = soma[i] /5;
   }

   for (int i = 0; i < alunos_prova.length; i++) 
   {
      if (media[i] >= 7) 
      {
         System.out.printf("Aluno %s foi aprovado com média de %.2f%n", nomes[i], media[i]);
      } 
      else if (media[i] >= 4 && media[i] < 7) 
      {
         System.out.printf("Aluno %s foi para o exame especial com média de %.2f%n", nomes[i], media[i]);
      } 
      else 
      {
         System.out.printf("Aluno %s foi reprovado com média de %.2f%n", nomes[i], media[i]);
      }
  }

   teclado.close();
   }
   
   public static void preencherMatriz (double matriz [] [], Scanner teclado)
   {
      for(int i=0; i<matriz.length; i++) 
      {
         for(int j=0; j<matriz[0].length; j++) 
         {
            System.out.println("Digite a nota do "+(i+1) +"* aluno na prova "+(j+1)+":");
            matriz[i][j] = teclado.nextDouble();
         }
      }    
   }
}