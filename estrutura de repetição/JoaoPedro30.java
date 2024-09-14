import java.util.Scanner; 
public class JoaoPedro30{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   /* despesa fixa = 200
    ingressos a 5$ serão vendidos 120 entradas
    a cada 0,50$ de diminuição aumento de 26 vendas
    
    imprima uma tabela contendo os valores dos lucros esperados em função do valor dos ingressos, fazendo uma variação nos ingressos de R$5,00 à R$1,00 de R$0,50 em R$0,50.

    Escreva ainda o lucro máximo esperado, o preço do ingresso e quantidade de ingressos vendidos para obtenção desse lucro máximo estimado.

    */

    double despesafixa, valor_ingresso, lucro, lucro_maximo, preco_ingressolucromaximo;
    int num_ingressosvendidos, num_ingressoslucromaximo;

    valor_ingresso = 5;
    lucro = 600;
    num_ingressosvendidos = 120;
    lucro_maximo = 0;
    preco_ingressolucromaximo = 0;
    num_ingressoslucromaximo = 0;

    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("=====================================================");
    System.out.println("|SISTEMA PARA ANÁLISE DE LUCROS E DESPESAS DO TEATRO|");
    System.out.println("=====================================================");
    System.out.println("|DIGITE A DESPESA FIXA DA SUA COMPANHIA DE TEATRO:  |");
    despesafixa = teclado.nextDouble();
    
    while (valor_ingresso >= 1) 
    {
        lucro = (num_ingressosvendidos * valor_ingresso) - despesafixa;

        System.out.println("===================================");
        System.out.println("|PREÇO INGRESSO    |LUCRO         |");
        System.out.println("===================================");
        System.out.println("|  "+valor_ingresso+"             |"+ lucro+"         |");
        System.out.println("===================================");

        if (lucro > lucro_maximo)
        {
            lucro_maximo = lucro;
            preco_ingressolucromaximo = valor_ingresso;
            num_ingressoslucromaximo = num_ingressosvendidos;
        }
        
        valor_ingresso -= 0.5;
        num_ingressosvendidos += 26;
    }

    System.out.printf("O lucro máximo obtido utilizando a tabela: %.2f \n", lucro_maximo);
    System.out.printf("Com um valor de ingresso de: %.2f \n", preco_ingressolucromaximo);
    System.out.println("Quantidade de ingressos vendidas para o lucro máximo: "+ num_ingressoslucromaximo);
    System.out.println("");
    System.out.println("");

   
    teclado.close();
   }
}