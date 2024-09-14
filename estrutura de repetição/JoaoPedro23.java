import java.util.Scanner; 
public class JoaoPedro23{
   public static void main(String []args){
   Scanner teclado = new Scanner(System.in);

   double velocidadeA = 30.0; 
    double velocidadeB = 40.0; 
    double distanciaTotalKm = 400.0; 
    double distanciaTotalM = distanciaTotalKm * 1000; 
    


    double distanciaPercorridaA = 0.0;
    double distanciaPercorridaB = 0.0;
    double tempo = 0.0;
    double Tempo = 0.1; 

    
    while ((distanciaPercorridaA + distanciaPercorridaB) < distanciaTotalM) 
    {
        distanciaPercorridaA += velocidadeA * Tempo;
        distanciaPercorridaB += velocidadeB * Tempo;
        tempo += Tempo;
    }

    
    double distanciaA = velocidadeA * tempo;
    double distanciaB = velocidadeB * tempo;

    System.out.printf("Tempo para o cruzamento: %.2f segundos%n", tempo);
    System.out.printf("Distância percorrida pela locomotiva A: %.2f metros%n", distanciaA);
    System.out.printf("Distância percorrida pela locomotiva B: %.2f metros%n", distanciaB);

   teclado.close();
   }
}