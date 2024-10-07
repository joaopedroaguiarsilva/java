import java.util.Scanner;
public class JoaoPedro6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double prod[][] = new double[6][5];
        double med[] = new double[6];
        double dp[] = new double[6];

        for (int i = 0; i < prod.length; i++) 
        {
            for (int j = 0; j < prod[0].length; j++) 
            {
                System.out.println("Digite o valor da linha de produção " + (i + 1) + " e da amostra " + (j + 1) + ": ");
                prod[i][j] = teclado.nextDouble();
                med[i] += prod[i][j];
            }
            med[i] /= prod[0].length;
        }
        for (int i = 0; i < prod.length; i++) 
        {
            double somaQuadrados = 0;
            for (int j = 0; j < prod[0].length; j++) 
            {
                somaQuadrados += Math.pow((prod[i][j] - med[i]), 2);
            }
            dp[i] = Math.sqrt(somaQuadrados / (prod[0].length - 1));
            System.out.printf("Média da linha de produção %d: %.2f\n", (i + 1), med[i]);
            System.out.printf("Desvio padrão da linha de produção %d: %.2f\n", (i + 1), dp[i]);
            System.out.println();
        }

       
        for (int i = 0; i < dp.length; i++) 
        {
            if (dp[i] > 5) 
            {
               System.out.println("Linha " + (i + 1) + " revisar!");
            } 
            else 
            {
                System.out.println("Linha " + (i + 1) + " OK"); 
            }
        }

        teclado.close();
    }
}
