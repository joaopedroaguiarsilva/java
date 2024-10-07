import java.util.Scanner; 
public class JoaoPedro10 {
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);
   
        System.out.println("Digite o número de cidades: ");
        int n = teclado.nextInt();

        int[][] matrizCustos = new int[n][n];

        System.out.println("Digite a matriz de custos de transporte entre as cidades:");
        for (int i = 0; i < n; i++)  
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.println("Custo de transporte da cidade " + i + " para a cidade " + j + ":");
                matrizCustos[i][j] = teclado.nextInt();
            }
        }

        
        int[] rota = new int[n];

        System.out.println("Digite a rota do caminhão (ordem das cidades visitadas):");
        for (int i = 0; i < n; i++) 
        {
            rota[i] = teclado.nextInt();
        }

        
        int custoTotal = 0;
        for (int i = 0; i < n - 1; i++) 
        {
            int cidadeAtual = rota[i];
            int proximaCidade = rota[i + 1];
            custoTotal += matrizCustos[cidadeAtual][proximaCidade];
        }

      
        System.out.println("O custo total da rota é: " + custoTotal);

        teclado.close();
    }
}

