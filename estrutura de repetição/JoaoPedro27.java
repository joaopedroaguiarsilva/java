import java.util.Scanner; 
public class JoaoPedro27{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   int N, resultado, cont;
   cont =1;
   resultado =0; 

   System.out.println("Digite um valor inteiro positivo para ver sua tabuada: ");
   N = teclado.nextInt();

   while (cont < 10)
   {
    cont += 1;
    resultado = N * cont;
    System.out.println(resultado);
   }
    
    teclado.close();
   }
}