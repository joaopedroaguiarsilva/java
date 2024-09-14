import java.util.Scanner;

public class JoaoPedro28 {
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   int altura;

    System.out.println("Digite a altura do triângulo pelo seu número de linhas:");
    altura = teclado.nextInt();

   for (int i=1; i <= altura; i ++) 
   {
      for (int j=1; j <= i ; j ++)
      {
        System.out.print("#");
      }
      System.out.println("");
   }
   
    teclado.close();
   }
}