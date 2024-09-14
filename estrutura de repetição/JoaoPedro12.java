import java.util.Scanner; 
public class JoaoPedro12{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in, "ISO-8859-1");

   double razao, soma200, mediaveiculos, mediaacidentes, maior, menor, nveiculos, nacidentes, somaveiculos, somaacidentes;
   int cont, contnovo;
   
   contnovo = 0;
   cont = 1;
   razao = 0;
   mediaveiculos = 0;
   mediaacidentes = 0;
   nveiculos = 0;
   nacidentes = 0;
   maior = 0;
   menor = 9000000;
   somaveiculos = 0;
   somaacidentes = 0;
   soma200 = 0;
   
   String maiorindice = "";
   String menorindice = "";
   
   System.out.println("-------------------------------------");
   System.out.println("       Estudo sobre acidentes");
   System.out.println("---------------------------------------");

   while (cont <= 5 )
   {
      System.out.println("Digite o nome da cidade: ");
      String nomecidade = teclado.nextLine();
      
      System.out.println("Digite o número de veículos dessa cidade: ");
      nveiculos = teclado.nextInt(); 
      teclado.nextLine();
      
      somaveiculos = somaveiculos + nveiculos; 
      
      if (nveiculos < 200)
      {
         contnovo = contnovo + 1;
         soma200 = soma200 + nveiculos; 
      }

      
      System.out.println("Digite o número de acidentes de trânsito dessa cidade: ");
      nacidentes = teclado.nextInt(); 
      teclado.nextLine();
      
      somaacidentes = somaacidentes + nacidentes;
      
      razao = nacidentes / nveiculos;

      if (nacidentes > maior)
      {
         maior = nacidentes;
         maiorindice = nomecidade;
      }
      else if (nacidentes < menor)
      {
         menor = nacidentes;
         menorindice = nomecidade;
      }
      System.out.printf("A razão entre a quantidade de acidentes por quantidade de veículos dessa cidade é de: %.2f \n", razao);          
      System.out.println("");
      
      cont = cont + 1;
   }
   
   mediaveiculos = somaveiculos / 5;
   
   System.out.println("");
   System.out.printf("O maior índice de acidentes foi: %.2f \n", maior);
   System.out.println("Na cidade de: "+ maiorindice);
   System.out.println("");
   System.out.printf("O menor índice de acidentes foi: %.2f \n", menor);
   System.out.println("Na cidade de: "+ menorindice);
   System.out.println("");
   System.out.printf("Média de veículos nas cincos cidades:  %.2f \n", mediaveiculos);
   System.out.println("");

   if (contnovo == 0)
   {
      System.out.println("Não há cidades com menos de 200 veículos!");
   }
   else
   {
   mediaacidentes = soma200 / contnovo;
   System.out.printf("Média de acidentes de trânsito nas cidades com menos de 200 veículos: %.2f \n", mediaacidentes);
   }
   

   teclado.close();
   }
}