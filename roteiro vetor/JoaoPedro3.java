import java.util.Scanner;
public class JoaoPedro3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int N;
  
    System.out.println("Digite até qual valor você quer que sua série vá: ");
    N = teclado.nextInt();

    if (N <= 0)
    {
        System.out.println("Por favor, digite um número inteiro positivo");
        teclado.close();
        return;
    }

    int [] fibonacci = new int[N];

    fibonacci [0] = 1;
    fibonacci [1] = 1;

    for(int i= 2; i < N; i++)
    {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }

    for (int i= 0; i < N; i++)
    {
        if (i == (N - 1)) 
        {
            System.out.print(fibonacci[i]);
            System.out.print(".");
        }
        else
        {
            System.out.print(fibonacci[i]);
            System.out.print(", ");
        }
    }



    teclado.close();

    }
}

