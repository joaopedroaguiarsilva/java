import java.util.Scanner; 
public class JoaoPedro29{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   int A, B, cont;
   cont = 0;

   System.out.println("Digite o primeiro número inteiro positivo: ");
   A = teclado.nextInt();

   int primeiro = A;

   System.out.println("Digite o segundo número inteiro positivo: ");
   B =teclado.nextInt();

   while (A >= B) 
   {
      A -= B;
      cont += 1;
   }
   
   System.out.println("Quociente da divisão de "+ primeiro +" por "+ B + " = "+ cont);
   System.out.println("");
   System.out.println("Resto da divisão de "+ primeiro +" por "+ B + " = "+ A);

   
    teclado.close();
   }
}