import java.util.Scanner; 
public class JoaoPedro4{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);


   int N, diasacima = 0;
   System.out.println("Digite o número de semanas: ");
   N = teclado.nextInt();

   double prod[][]= new double[N][7];
   double menor[] = new double[N];
   int diamenor[] = new int[N];

   double media, soma=0;
   int TAM1 = prod.length, TAM2= prod[0].length;

   for(int i=0; i<prod.length;i++)
   {
        for(int j=0; j<prod[0].length; j++)
        {
            System.out.println("Digite a produção do dia "+ (j+1)+" semana "+(i+1)+":");
            prod[i][j] = teclado.nextDouble();
            soma += prod[i][j];
        }
   }
   media = soma/(TAM1*TAM2);
   System.out.println("Média de produção das "+ N+" semanas: "+ media);

   for(int i=0; i<prod.length;i++)
   {
        for(int j=0; j<prod[0].length; j++)
        {
            if (j==0) 
            {
                menor[i] = prod[i][j];
                diamenor[i] = j;
            }
            else if (prod[i][j]< menor[i]) 
            {
                menor[i] = prod[i][j];
                diamenor[i] = j;
            }
            if (prod[i][j] > media) 
            {
                diasacima++;
            }
        }
   }        

   System.out.println("Dias acima da média: "+ diasacima);
   System.out.println("Dias de menor produção: " );
   for(int i=0; i < TAM1; i++)
   {
        System.out.printf("Semana %d: DIA %d PRODUÇÃO %.2f \n", (i+1), diamenor[i]+1, menor[i] );
   }
   teclado.close();
   }
}