import java.util.Scanner;
public class JoaoPedro14 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      int[] vet1 = new int[10];
      int[] vet2 = new int[10];
      int[] vet3 = new int[10];

      for (int i = 0; i < 10; i++) 
        {
            System.out.println("Digite o valor "+ (i+1) +" do  primeiro vetor: ");
            vet1[i] = teclado.nextInt();

            System.out.println("Digite o valor "+ (i+1) +" do  segundo vetor: ");
            vet2[i] = teclado.nextInt();           
        }

        for (int i = 0; i < 10; i++) 
        {
            vet3[i] = vet1[i] + vet2[i];
        }

        System.out.println("");
        System.out.println("Vetor 3:");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(vet3[i]);
        }

      teclado.close();
   }
}