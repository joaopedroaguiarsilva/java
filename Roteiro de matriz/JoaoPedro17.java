import java.util.Scanner;

public class JoaoPedro17 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      int redesocial[][] = new int[5][5];

      System.out.println("Preencha a matriz de rede social com 1 se a pessoa da linha é amiga da pessoa da coluna e 0 se elas não são amigas.");

     
      preencheMatriz(redesocial, teclado);
      calculaAmigos(redesocial);

      teclado.close();
   }

   public static void preencheMatriz(int matriz[][], Scanner teclado) {
      for (int i = 0; i < matriz.length; i++) 
      {
         for (int j = i + 1; j < matriz[0].length; j++) {  
            System.out.println("Digite 1 se a pessoa " + i + " é amiga da pessoa " + j + ", ou 0 caso contrário:");
            int amizade = teclado.nextInt();
            
            matriz[i][j] = amizade;  
            matriz[j][i] = amizade;  
         }
         matriz[i][i] = 0;  
      }
   }

   public static void calculaAmigos(int matriz[][]) {
      for (int i = 0; i < matriz.length; i++) 
      {
         int contadorAmigos = 0;
         for (int j = 0; j < matriz[0].length; j++) 
         {
            if (matriz[i][j] == 1) 
            {
               contadorAmigos++;
            }
         }
         System.out.println("A pessoa " + i + " tem " + contadorAmigos + " amigos.");
      }
   }
}
