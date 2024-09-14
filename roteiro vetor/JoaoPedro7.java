import java.util.Scanner;

public class JoaoPedro7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] notas = new int[80];
        int[] frequenciaAbsoluta = new int[11];  
        int tam = notas.length;

       
        for (int i = 0; i < tam; i++) 
        {
            do 
            {
               System.out.println("Digite a nota da posição " + i + " do seu vetor (entre 0 e 10): ");
               notas[i] = teclado.nextInt();

               if (notas[i] < 0 || notas[i] > 10) 
               {
                  System.out.println("Você deve digitar uma nota entre 0 e 10!");
               }
            } 
            while (notas[i] < 0 || notas[i] > 10);
            frequenciaAbsoluta[notas[i]]++;
            // o vetor frequencia absoluta vai receber como sua posição a leitura do vetor nota na posição i e incrementar mais um, pois o vetor nota está um atrás 
        }

        
        double[] frequenciaRelativa = new double[11];
        for (int i = 0; i <= 10; i++) 
        {
            frequenciaRelativa[i] = (double) frequenciaAbsoluta[i] / tam;
        }

        System.out.println("\nNota\tFrequência Absoluta\tFrequência Relativa (%)");

        for (int i = 0; i <= 10; i++) 
        {
            System.out.printf("%d\t\t%d\t\t\t%.2f%%\n", i, frequenciaAbsoluta[i], frequenciaRelativa[i] * 100);
        }

        teclado.close();
    }
}