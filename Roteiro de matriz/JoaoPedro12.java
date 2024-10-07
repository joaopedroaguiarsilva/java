import java.util.Scanner;
public class JoaoPedro12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int P[][] = new int[5][3];
        int SL[] = new int[4]; 
        double C[] = new double[4]; 

        for (int i = 0; i < P.length; i++) 
        {
            for (int j = 0; j < P[0].length; j++) 
            {
                if (i < 4) 
                {
                    System.out.print("Digite o valor da linha " + i + " na coluna " + j + ": ");
                    P[i][j] = teclado.nextInt();
                } 
                else 
                {
                    System.out.print("Digite o custo de estocagem do produto " + j + ": ");
                    P[i][j] = teclado.nextInt();
                }
            }
        }

        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                SL[i] += P[i][j];
                C[i] += P[i][j] * P[4][j]; 
            }
        }

        System.out.println("Quantidade de itens armazenados em cada armazém:");
        for (int i = 0; i < SL.length; i++) 
        {
            System.out.println("Armazém " + (i + 1) + ": " + SL[i]);
        }

       
        int A2 = 0; 
        for (int i = 1; i < SL.length; i++) 
        {
            if (P[i][1] > P[A2][1]) 
            { 
                A2 = i;
            }
        }
        System.out.println("Armazém com maior estoque do produto 2: Armazém " + (A2 + 1));

        int amenor = 0; 
        for (int i = 1; i < SL.length; i++) 
        {
            if (SL[i] < SL[amenor]) 
            {
                amenor = i;
            }
        }
        System.out.println("Armazém com menor estoque: Armazém " + (amenor + 1));

        
        int amaior = 0; 
        double maiorCusto = C[0];
        for (int i = 1; i < C.length; i++) 
        {
            if (C[i] > maiorCusto) 
            {
                amaior = i;
                maiorCusto = C[i];
            }
        }
        System.out.println("Armazém com maior custo de estocagem: Armazém " + (amaior + 1));

        teclado.close();
    }
}
