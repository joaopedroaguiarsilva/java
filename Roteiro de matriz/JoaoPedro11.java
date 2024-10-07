import java.util.Scanner;

public class JoaoPedro11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número de municípios: ");
        int numCidades = teclado.nextInt();

        int[][] matrizConexoes = new int[numCidades][numCidades];

        System.out.println("Digite a matriz de conexões entre os municípios (1 = existe estrada, 0 = não existe):");
        for (int i = 0; i < numCidades; i++) 
        {
            for (int j = 0; j < numCidades; j++) 
            {
                System.out.println("Existe estrada direta da cidade " + i + " para a cidade " + j + "? (1 ou 0):");
                matrizConexoes[i][j] = teclado.nextInt();
            }
        }

        
        System.out.println("Digite o número da cidade para verificar as rotas que saem e chegam:");
        int cidade = teclado.nextInt();
        int rotasSaem = 0;
        int rotasChegam = 0;

        for (int i = 0; i < numCidades; i++) 
        {
            if (matrizConexoes[cidade][i] == 1) 
            {
                rotasSaem++;
            }
            if (matrizConexoes[i][cidade] == 1) 
            {
                rotasChegam++;
            }
        }

        System.out.println("A cidade " + cidade + " tem " + rotasSaem + " rotas que saem e " + rotasChegam + " rotas que chegam.");

        int cidadeMaisRotas = 0;
        int maxRotasChegam = 0;

        for (int l = 0; l < numCidades; l++) 
        {
            int contadorChegada = 0;
            for (int j = 0; j < numCidades; j++) 
            {
                if (matrizConexoes[j][l] == 1) 
                {
                    contadorChegada++;
                }
            }
            if (contadorChegada > maxRotasChegam) 
            {
                maxRotasChegam = contadorChegada;
                cidadeMaisRotas = l;
            }
        }

        System.out.println("A cidade com o maior número de rotas chegando é a cidade " + cidadeMaisRotas + " com " + maxRotasChegam + " rotas.");

        
        System.out.println("Cidades isoladas (sem rotas que chegam nem saem):");
        boolean cidadesIsoladas = false;

        for (int a = 0; a < numCidades; a++) 
        {
            boolean semSaida = true;
            boolean semChegada = true;

            for (int j = 0; j < numCidades; j++) 
            {
                if (matrizConexoes[a][j] == 1) 
                {
                    semSaida = false;
                }
                if (matrizConexoes[j][a] == 1) 
                {
                    semChegada = false;
                }
            }

            if (semSaida && semChegada) 
            {
                System.out.println("A cidade " + a + " é isolada.");
                cidadesIsoladas = true;
            }
        }

        if (!cidadesIsoladas) 
        {
            System.out.println("Não existem cidades isoladas.");
        }

        
        System.out.println("Digite o tamanho da rota (número de cidades visitadas):");
        int tamanhoRota = teclado.nextInt();
        int[] rota = new int[tamanhoRota];

        System.out.println("Digite as cidades da rota (de 0 a " + (numCidades - 1) + "):");
        for (int f = 0; f < tamanhoRota; f++) 
        {
            rota[f] = teclado.nextInt();
        }

        boolean rotaValida = true;
        for (int b = 0; b < tamanhoRota - 1; b++) 
        {
            int cidadeAtual = rota[b];
            int cidadeSeguinte = rota[b + 1];
            if (matrizConexoes[cidadeAtual][cidadeSeguinte] == 0) 
            {
                rotaValida = false;
                break;
            }
        }

        if (rotaValida) 
        {
            System.out.println("A rota é viável.");
        } 
        else 
        {
            System.out.println("A rota é inviável.");
        }

        teclado.close();
    }
}
