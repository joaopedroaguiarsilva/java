import java.util.Scanner;
public class JoaoPedro19 {
   public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);

   int v[] = new int[10];
   int valor;

   for(int i=0; i<v.length;i++)
   {
      System.out.println("Digite o valor da posição "+(i+1));
      v[i] = teclado.nextInt();
   }       
   System.out.println("Digite um valor a ser pesquisado no vetor: ");        
   valor = teclado.nextInt();
   int posicao = pesquisa(v, valor);
   if(posicao==-1)
   {
      System.out.println(valor+" não encontrado!");
   }
   else
   {
      System.out.println(valor+" encontrado na posição "+(posicao+1));
   }


     
   teclado.close();
   }
   public static int pesquisa(int vetor[], int chave){
      for(int i=0; i<vetor.length;i++)
      {
         if(chave==vetor[i])
         {
            return i;
         }
      }
      return -1;

    }
}
