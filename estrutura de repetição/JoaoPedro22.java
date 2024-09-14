import java.util.Scanner; 
public class JoaoPedro22{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   int anoultrapassagem, cont;
   double habA, habB;

   habA = 500000;
   habB = 700000;
   cont = 0;
   
   while (habB > habA)
   {
      habA = habA * 1.03;
      habB = habB * 1.02;
      cont = cont + 1;
   }

   anoultrapassagem = 2015 + cont;

   System.out.print("Em "+ anoultrapassagem + " a população do país A passará a população do país B");
  
   teclado.close();
   }
}