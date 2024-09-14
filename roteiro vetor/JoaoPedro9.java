import java.util.Scanner;

public class JoaoPedro9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        double[] altura = new double[50];
        int[] sexo = new int[50];
        
        int tam = altura.length;
        double somaAltura = 0, mediaAlturaTurma = 0, maiorAltura = 0, menorAltura = Double.MAX_VALUE;

        double somaAlturaHomens = 0, somaAlturaMulheres = 0;
        int contHomens = 0, contMulheres = 0;

       
        for (int i = 0; i < tam; i++) 
        {
            System.out.println("Digite a altura do aluno " + (i+1) + ":");
            altura[i] = teclado.nextDouble();

            System.out.println("Digite o sexo do aluno (código 1 para masculino e 2 para feminino):");
            sexo[i] = teclado.nextInt();

            somaAltura += altura[i];

            if (altura[i] > maiorAltura) 
            {
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura) 
            {
                menorAltura = altura[i];
            }

            if (sexo[i] == 1) 
            { 
                somaAlturaHomens += altura[i];
                contHomens++;
            } 
            else if (sexo[i] == 2) 
            { 
                somaAlturaMulheres += altura[i];
                contMulheres++;
            }
        }

        mediaAlturaTurma = somaAltura / tam;
        double mediaAlturaHomens = (contHomens > 0) ? somaAlturaHomens / contHomens : 0;
        double mediaAlturaMulheres = (contMulheres > 0) ? somaAlturaMulheres / contMulheres : 0;

        System.out.println("\nMaior altura da turma: " + maiorAltura);
        System.out.println("Menor altura da turma: " + menorAltura);
        System.out.println("Média das alturas da turma: " + mediaAlturaTurma);

        System.out.println("\nMulheres com altura acima da média dos homens:");
        for (int i = 0; i < tam; i++)
        {
            if (sexo[i] == 2 && altura[i] > mediaAlturaHomens) 
            {
                System.out.println("Mulher na posição " + (i+1) + " com altura " + altura[i]);
            }
        }

        System.out.println("\nHomens com altura abaixo da média das mulheres:");
        for (int i = 0; i < tam; i++) 
        {
            if (sexo[i] == 1 && altura[i] < mediaAlturaMulheres) {
                System.out.println("Homem na posição " + (i+1) + " com altura " + altura[i]);
            }
        }

        System.out.println("\nPessoas com altura abaixo da média da turma:");
        for (int i = 0; i < tam; i++) 
        {
            if (altura[i] < mediaAlturaTurma) {
                System.out.println("Pessoa na posição " + (i+1) + " com altura " + altura[i]);
            }
        }

        teclado.close();
    }
}