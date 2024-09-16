import java.util.Scanner;

public class JoaoPedro22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int F = scanner.nextInt();
        int R = scanner.nextInt();
        
     
        int[] posicoes = new int[R];

        for (int i = 0; i < R; i++) 
        {
            posicoes[i] = scanner.nextInt();
        }
        
        int maximoDias = 0;
        maximoDias = Math.max(maximoDias, posicoes[0] - 1);
        maximoDias = Math.max(maximoDias, F - posicoes[R - 1]);

        for (int i = 1; i < R; i++) 
        {
            int distancia = (posicoes[i] - posicoes[i - 1]) / 2;
            maximoDias = Math.max(maximoDias, distancia);
        }
        System.out.println(maximoDias);
        scanner.close();
    }
}

       
 