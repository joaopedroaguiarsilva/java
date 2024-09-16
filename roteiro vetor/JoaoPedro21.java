import java.util.Scanner;
public class JoaoPedro21 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int[] montanha = new int[N];
      
      for (int i = 0; i < N; i++) 
      {
          montanha[i] = sc.nextInt();
      }
      boolean maisDeUmPico = false;
      for (int i = 1; i < N - 1; i++) 
      {
          if (montanha[i - 1] > montanha[i] && montanha[i] < montanha[i + 1]) 
          {
              maisDeUmPico = true;
              break;
          }
      }
      if (maisDeUmPico) 
      {
          System.out.println("S");
      } else 
      {
          System.out.println("N");
      }
      
      sc.close();
  }
}
     