import java.util.Scanner; 
public class JoaoPedro31{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   int codigo, cont1, cont2, cont3, cont4, contnulo, contbranco;

   cont1 = 0;
   cont2 = 0;
   cont3 = 0;
   cont4 = 0;
   contbranco = 0;
   contnulo = 0;

   System.out.println("Programa para contabilizar votos da eleição");
   System.out.println("Se você digitar o código 0 o programa será fechado");
   System.out.println(" Código:"); 
   System.out.println("1: Voto para candidato 1 ");
   System.out.println("2: Voto para candidato 2 ");
   System.out.println("3: Voto para candidato 3 ");
   System.out.println("4: Voto para candidato 4"); 
   System.out.println("5: Voto em branco"); 
   System.out.println("Qualquer valor fora: Voto nulo");

    System.out.println("Digite o código para votar:");
    codigo = teclado.nextInt();

    while(codigo != 0)
    {
        switch(codigo) 
        {
            case 1:
              cont1 += 1;
              break;
            case 2:
              cont2 += 1;
              break;
            case 3:
              cont3 += 1;
              break;
            case 4:
              cont4 += 1;
              break; 
            case 5:
              contbranco += 1;
              break;    
            default:
              contnulo += 1;
          }
        System.out.println("Digite o código para votar:");
        codigo = teclado.nextInt();
    }

    System.out.println("Total de votos candidato 1: "+ cont1);
    System.out.println("Total de votos candidato 2: "+ cont2);
    System.out.println("Total de votos candidato 3: "+ cont3);
    System.out.println("Total de votos candidato 4: "+ cont4);
    System.out.println("Total de votos em branco: "+ contbranco);
    System.out.println("Total de votos total de votos nulos: "+ contnulo);

    teclado.close();
   }
}