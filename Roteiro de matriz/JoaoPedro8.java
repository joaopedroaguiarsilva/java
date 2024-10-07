import java.util.Scanner;
public class JoaoPedro8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int colunas, linhas;

        System.out.println("Digite o número de linhas que sua matriz vai ter: ");
        linhas = teclado.nextInt();
        System.out.println("Digite o número de colunas que sua matriz vai ter:");
        colunas = teclado.nextInt();

        int[][] matriz = new int[linhas][colunas];

        preencheMatriz(matriz, teclado);

        if (colunas == linhas) 
        {
            if (ehMatrizPermutacao(matriz)) 
            {
                System.out.println("É uma matriz permutação!");
            } 
            else 
            {
                System.out.println("Não é uma matriz permutação!");
            }
        } 
        else 
        {
            System.out.println("Não é uma matriz permutação! (A matriz não é quadrada)");
        }

        teclado.close();
    }

    public static void preencheMatriz(int[][] matriz, Scanner teclado) {
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[0].length; j++) 
            {
                System.out.println("Digite o valor da linha " + i + " coluna " + j + ":");
                matriz[i][j] = teclado.nextInt();
            }
        }
    }

    public static boolean ehMatrizPermutacao(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        
        for (int i = 0; i < linhas; i++) 
        {
            int cont1 = 0;
            for (int j = 0; j < colunas; j++) 
            {
                if (matriz[i][j] == 1) 
                {
                    cont1++;
                } 
                else if (matriz[i][j] != 0) 
                {
                    return false;
                }
            }
            if (cont1 != 1) 
            {
                return false; 
            }
        }
        for (int j = 0; j < colunas; j++) 
        {
            int cont1 = 0;
            for (int i = 0; i < linhas; i++) 
            {
                if (matriz[i][j] == 1) 
                {
                    cont1++;
                }
            }
            if (cont1 != 1) 
            {
                return false;
            }
        }
        return true;   
    }
}
