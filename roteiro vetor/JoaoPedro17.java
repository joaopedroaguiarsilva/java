import java.util.Scanner;
public class JoaoPedro17 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      int num =2, cont = 0;
      boolean primo = true;
      int primos[] = new int[100];

      while (cont < 100) 
      {
         primo = true;
         for(int i =2; i <= num /2; i ++)
         {
            if (num%i == 0) 
            {
               primo = false;
               break;
            }
         }
         if (primo == true) 
         {
            primos[cont] = num;
            cont ++;
         }
         num++;
      }
      System.out.println("Primos normal: ");
      for(int i = 0; i < primos.length; i++)
      {
         System.out.print("{"+primos[i]+"}");
      }


      int num1 = 3, cont1 = 0;
      int primos2[] = new int[100];
      primos2[0] = 2;
      boolean primo1 = true;
      

      while (cont1 < 100) 
      {
         primo1 = true;
         for(int i =0; i < cont1; i ++)
         {
            if (num1%primos2[i] == 0) 
            {
               primo1 = false;
               break;
            }
         }
         if (primo1 == true) 
         {
            primos2[cont1] = num1;
            cont1 ++;
         }
         num1++;
      }
      System.out.println("");
      System.out.println("");
      System.out.println("Primos Erastóstenes: ");
      for(int i = 0; i < primos2.length; i++)
      {
         System.out.print("{"+primos2[i]+"}");
      }
      teclado.close();
   }
}