import java.util.Scanner; 
public class JoaoPedro16 {
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   long bits, binario;
   long decimal, exp; 
   decimal = 0;
   long cont;
   cont = 0;
   boolean teste;
   teste = false;
   
   System.out.println("Digite um número binário qualquer: ");
   binario = teclado.nextLong();   
   exp = 0;

   while(binario != 0)
   {
      bits = binario % 10;
      if (bits == 1 || bits == 0)
      {
         decimal = decimal + (bits * ((long) Math.pow(2,exp)));
         exp = exp + 1;   
         teste = true;  
      }
      else 
      {
         System.out.println("Você não digitou um número binário! ");
         break;
      }
      binario = binario / 10;
      
   }

   if(teste == true)
   {
      System.out.println("Esse número em decimal é: "+ decimal);
      long restdivoctal, octal, copiadecimal01;
      copiadecimal01 = decimal;
      octal = 0;
      
      while (copiadecimal01 != 0)
      {
         restdivoctal = copiadecimal01 % 8;
         copiadecimal01 = copiadecimal01 / 8;
         octal += restdivoctal * Math.pow(10, cont);
         cont ++;
      }
      System.out.println("Esse número em octal é: "+ octal);
      
      long copiadecimal02, restdivhexadecimal;
      copiadecimal02 = decimal;
      cont = 0;
      String digitohexadecimal = "";
      String hexadecimal = "";
      while (copiadecimal02 != 0)
      {
         restdivhexadecimal = copiadecimal02 % 16;
         copiadecimal02 = copiadecimal02 / 16;
         if (restdivhexadecimal == 10)
         {
            digitohexadecimal = "A";
         }
         else if (restdivhexadecimal == 11)
         {
            digitohexadecimal = "B";
         }
         else if (restdivhexadecimal == 12)
         {
            digitohexadecimal = "C";
         }
         else if (restdivhexadecimal == 13)
         {
            digitohexadecimal = "D";
         }
         else if (restdivhexadecimal == 14)
         {
            digitohexadecimal = "E";
         }
         else if (restdivhexadecimal == 15)
         {
            digitohexadecimal = "F";
         }
         else
         {
            digitohexadecimal =  restdivhexadecimal + "";
         }
         hexadecimal = digitohexadecimal + hexadecimal;
      
      }
      System.out.println("Esse número em hexadecimal é: "+ hexadecimal);
   }
  
   teclado.close();
   }
}
