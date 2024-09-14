import java.util.Scanner;
public class JoaoPedro5 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      double [] alturas = new double[20];
      
      int tam = alturas.length;
      double  soma, media;
      soma = 0;

      for(int i = 0; i < tam; i++)
      {
         System.out.println("Qual é a altura do atleta "+ i +" : ");
         alturas[i] = teclado.nextDouble();

         soma = alturas[i] + soma;
      }

      media = soma / tam;

      System.out.printf("Média: %.2f \n ",  media); 

      for(int i = 0; i < tam; i++)
      {
         if (alturas[i] >= media)
         {
            System.out.println("O atleta "+ i +" pode participar da competição,pois possui altura acima da média!" );
         }
      }

      teclado.close();
   }
}