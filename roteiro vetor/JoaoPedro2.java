import java.util.Scanner;
public class JoaoPedro2 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      int [] original = new int[10];
      int [] invertido = new int[10];

      int auxiliar;  
      int tam = original.length;

      auxiliar = tam - 1;

      for (int i =0; i < tam; i++)
      {
            System.out.println("Digite a posição "+ i +" do seu vetor original: ");
            original[i] = teclado.nextInt();
      }

      for (int i = 0; i < tam; i++)
      {
            invertido[auxiliar] = original [i];
            auxiliar = auxiliar - 1;
      }

      for (int i = 0; i < tam; i++)
      {
            if (i == 9)
            {
                System.out.print(invertido[i]);
                System.out.print(".");
            }
            else
            {
                System.out.print(invertido[i]);
                System.out.print(", ");
            }

      }



      teclado.close();
   
}
}

