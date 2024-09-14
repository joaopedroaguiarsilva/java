import java.util.Scanner; 
public class JoaoPedro33e34{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   String nome;
   long CPF, dv1, dv2, idade, soma1, soma2, pos, dig, v1, v2, telefone;

   System.out.println("======================");
   System.out.println("| VALIDADOR DE CPF   |");
   System.out.println("======================");
   System.out.println("Digite seu nome completo: ");
   nome = teclado.nextLine();
   System.out.println("======================");
   System.out.println("Digite sua idade: ");
   idade = teclado.nextLong();
   System.out.println("======================");
   System.out.println("Digite seu telefone: ");
   telefone = teclado.nextLong();
   System.out.println("======================");
   System.out.println("Digite seu CPF apenas com números: ");
   CPF = teclado.nextLong();
   System.out.println("======================");
   
   dv2 = CPF % 10;
   CPF /= 10;
   dv1 = CPF % 10;
   CPF /= 10;
   soma1 = 0;
   pos = 2;
   soma2 = 0;

   while (CPF != 0) 
   {
      dig = CPF % 10;
      CPF /=10;
      soma1 = soma1 + dig * pos;
      soma2 = soma2 + dig* (pos + 1);
      pos ++;
   }
   v1 = 11;
   if (soma1 % 11 < 2)
   {
      v1 = 0;
   }
   else{
      v1 = 11 - (soma1 % 11);
   }

   soma2 = soma2 + v1 * 2;
   v2 = 11;


   if(soma2 % 11 < 2)
   {
      v2 = 0;
   }
   else
   {
      v2 = 11 - (soma2 % 11);
   }

   while (v1 != dv1 && v2 != dv2)
   {
      System.out.println("CPF INVÁLIDO!");
      System.out.println("======================");
      System.out.println("| VALIDADOR DE CPF   |");
      System.out.println("======================");
      teclado.nextLine();
      System.out.println("Digite seu nome completo: ");
      nome = teclado.nextLine();
      System.out.println("======================");
      System.out.println("Digite sua idade: ");
      idade = teclado.nextLong();
      System.out.println("======================");
      System.out.println("Digite seu telefone: ");
      telefone = teclado.nextLong();
      System.out.println("======================");
      System.out.println("Digite seu CPF apenas com números: ");
      CPF = teclado.nextLong();
      System.out.println("======================");
   
      dv2 = CPF % 10;
      CPF /= 10;
      dv1 = CPF % 10;
      CPF /= 10;
      soma1 = 0;
      pos = 2;
      soma2 = 0;

      while (CPF != 0) 
      {
         dig = CPF % 10;
         CPF /=10;
         soma1 = soma1 + dig * pos;
         soma2 = soma2 + dig* (pos + 1);
         pos ++;
      }
      v1 = 11;
      if (soma1 % 11 < 2)
      {
         v1 = 0;
      }
      else
      {
         v1 = 11 - (soma1 % 11);
      }

      soma2 = soma2 + v1 * 2;
      v2 = 11;


      if(soma2 % 11 < 2)
      {
         v2 = 0;
      }
      else
      {
         v2 = 11 - (soma2 % 11);
      }
   
   }
   
   if (v1 == dv1 && v2 == dv2)
   {
      System.out.println(nome+ " seu CPF é VÁLIDO, você tem "+ idade+ " anos e seu telefone é"+ telefone);
      System.out.println("======================");
   }


    teclado.close();
   }
}