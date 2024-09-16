import java.util.Scanner;

public class JoaoPedro24 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
    
        double[] distanciasQuadrado = new double[N];
        int totalPenalidade = 0;
        
    
        for (int i = 0; i < N; i++) 
        {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            double distanciaQuadrado = X * X + Y * Y;
            int penalidade = 0;
            for (int j = 0; j < i; j++) 
            {
                if (distanciasQuadrado[j] <= distanciaQuadrado) 
                {
                    penalidade++;
                }
            }
            
            distanciasQuadrado[i] = distanciaQuadrado;
            totalPenalidade += penalidade;
        }
        
      
        System.out.println(totalPenalidade);
        
        
        scanner.close();
    }
}
