import java.util.Scanner;
public class JoaoPedro23 {

    public static int contarInversoes(int[] array) {
        return mergeSort(array, 0, array.length - 1);
    }

    private static int mergeSort(int[] array, int esquerda, int direita) 
    {
        int inversoes = 0;
        if (esquerda < direita) 
        {
            int meio = (esquerda + direita) / 2;
            inversoes += mergeSort(array, esquerda, meio);
            inversoes += mergeSort(array, meio + 1, direita);
            inversoes += merge(array, esquerda, meio, direita);
        }
        return inversoes;
    }
    private static int merge(int[] array, int esquerda, int meio, int direita) 
    {
        int[] auxiliar = new int[direita - esquerda + 1];
        int i = esquerda, j = meio + 1, k = 0;
        int inversoes = 0;
        while (i <= meio && j <= direita) 
        {
            if (array[i] <= array[j]) 
            {
                auxiliar[k++] = array[i++];
            } 
            else 
            {
                auxiliar[k++] = array[j++];
                inversoes += (meio + 1 - i);  
            }
        }
        while (i <= meio) 
        {
            auxiliar[k++] = array[i++];
        }
        while (j <= direita) 
        {
            auxiliar[k++] = array[j++];
        }
        for (i = esquerda; i <= direita; i++) 
        {
            array[i] = auxiliar[i - esquerda];
        }
        return inversoes;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] pregosHorizontais = new int[N];

        for (int i = 0; i < N; i++) 
        {
            pregosHorizontais[i] = scanner.nextInt();
        }
        int cruzamentos = contarInversoes(pregosHorizontais);
        System.out.println(cruzamentos);

        scanner.close();
    }
}
