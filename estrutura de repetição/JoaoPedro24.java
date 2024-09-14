import java.util.Scanner; 
public class JoaoPedro24{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   int num_consumidor, codigo, cont1, cont2, validador;
   double consumo, preco_KWh, custototal,total1, total2,total3, media1, media2;



   preco_KWh= 0;
   cont1 = 0;
   cont2 = 0;
   total1 = 0; 
   total2 = 0;
   total3 = 0;
   media1 = 0;
   media2 = 0;
   
   System.out.println("------------------------");
   System.out.println("| Número do consumidor: |");
   num_consumidor = teclado.nextInt();
   System.out.println("------------------------");
   System.out.println("| Quantidade kWh consumido durante o mês: |");
   consumo = teclado.nextDouble();
   System.out.println("------------------------");
   System.out.println("| Tipo de código do consumidor: |");
   codigo = teclado.nextInt();
   System.out.println("------------------------");
   System.out.println("");
   System.out.println("");

   while (num_consumidor != 0)
   {
      switch (codigo) 
      {
        case 1:
            preco_KWh = 0.3;
            break;

        case 2:
            preco_KWh = 0.5;
            break;

        case 3:
            preco_KWh = 0.7;
            break;
        
        default:
        System.out.println("Código inválido");
            break;
      }
      System.out.println("------------------------");
      custototal = preco_KWh * consumo;
      System.out.printf("Custo total: %.2f \n", custototal);
      System.out.println("------------------------");
      
      if(codigo == 1) 
      {
        total1 = total1 + consumo;
        cont1 = cont1 + 1;
      }
      else if (codigo == 2)
      {
        total2 = total2 + consumo;
        cont2 = cont2 + 1;
      }
      else if (codigo == 3)
      {
        total3 = total3 + consumo;
      }
        System.out.println("| Número do consumidor: |");
        num_consumidor = teclado.nextInt();
        validador = num_consumidor;

        if (validador != 0)
        {
            System.out.println("------------------------");
            System.out.println("| Quantidade kWh consumido durante o mês: |");
            consumo = teclado.nextDouble();
            System.out.println("------------------------");
            System.out.println("| Tipo de código do consumidor: |");
            codigo = teclado.nextInt();
            System.out.println("------------------------");
            System.out.println("");
        }
   }

   if(cont1 == 0)
   {
    System.out.print("Não digitou nenhum consumidor do tipo residencial");
   }
   else
   {
    System.out.printf("Total de consumo tipo residencial: %.2f \n", total1);
    media1 = total1 / cont1;
    System.out.println("------------------------");
    System.out.printf("Média de consumo tipo residencial: %.2f \n", media1);
   }

   System.out.println("------------------------");

   if(cont2 == 0)
   {
    System.out.print("Não digitou nenhum consumidor do tipo residencial");
   }
   else
   {
    System.out.printf("Total de consumo tipo comercial: %.2f \n", total2);
    media2 = total2 / cont2;
    System.out.println("------------------------");
    System.out.printf("Média de consumo tipo comercial: %.2f \n", media2);
   }
   System.out.println("------------------------");
   System.out.printf("Total de consumo tipo industrial: %.2f \n", total3);
   System.out.println("------------------------");
  
   teclado.close();
   }
}