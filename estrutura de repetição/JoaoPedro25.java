import java.util.Scanner; 
public class JoaoPedro25{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   double PI, S, cont;
   int controle, termo,restdiv;

    S = 0;
    PI = 0;
    cont = 1;
    controle = 1;
    termo = 1;
    restdiv = 0;


     while (controle <= 51)
    {   
        restdiv = termo % 2;

        if (restdiv == 1 )
        {
            S += 1/(Math.pow(cont,3));
        }
        else if (restdiv == 0) 
        {
            S -= 1/(Math.pow(cont,3));
        }
        cont+= 2;
        controle += 1;
        termo += 1;
    }
   
    

     PI = Math.cbrt(S * 32);
     System.out.printf("PI: %.2f", PI);
   
    teclado.close();
   }
}