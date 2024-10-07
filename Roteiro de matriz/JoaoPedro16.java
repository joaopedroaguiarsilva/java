import java.util.Scanner;
public class JoaoPedro16 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String nomeplanta[] = new String[50];
    int codigo_planta[] = new int[50];
    int estoqueideal[] = new int[50];
    int estoqueatual[] = new int[50];
    int operacao;

    do {
        System.out.println("============================");
        System.out.println("  FLORICULTURA MARIASFLOR");
        System.out.println("============================");
        System.out.println("  1. CADASTRAR NOVA PLANTA");
        System.out.println("  2. RETIRAR PLANTA");
        System.out.println("  3. INSERIR PLANTA");
        System.out.println("  4. IMPRIMIR RELATÓRIO");
        System.out.println("  5. SAIR ");
        System.out.println("============================");

        System.out.println("Qual operação você quer realizar?");
        operacao = teclado.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("CADASTRAR NOVA PLANTA: ");
                for (int i = 0; i < nomeplanta.length; i++) 
                {
                    System.out.println("Digite o código da planta " + (i + 1) + ": ");
                    codigo_planta[i] = teclado.nextInt();
                    teclado.nextLine();  
                    System.out.println("Digite o nome da planta " + (i + 1) + ": ");
                    nomeplanta[i] = teclado.nextLine();
                    System.out.println("Digite o estoque ideal da planta " + (i + 1) + ": ");
                    estoqueideal[i] = teclado.nextInt();
                    System.out.println("Digite o estoque atual da planta " + (i + 1) + ": ");
                    estoqueatual[i] = teclado.nextInt();
                }
                break;

            case 2:
                System.out.println("RETIRAR PLANTA: ");
                System.out.println("Digite o código da planta: ");
                int codigoRetirar = teclado.nextInt();
                boolean plantaEncontrada = false;

                for (int i = 0; i < codigo_planta.length; i++) {
                    if (codigo_planta[i] == codigoRetirar) 
                    {
                        plantaEncontrada = true;
                        System.out.println("Estoque atual da planta " + nomeplanta[i] + ": " + estoqueatual[i]);
                        System.out.println("Digite a quantidade a retirar: ");
                        int quantidade = teclado.nextInt();

                        if (quantidade <= estoqueatual[i]) 
                        {
                            estoqueatual[i] -= quantidade;
                            System.out.println("Retirada feita com sucesso!");
                        } 
                        else 
                        {
                            System.out.println("Estoque insuficiente!");
                        }
                        break;
                    }
                }
                if (!plantaEncontrada) 
                {
                    System.out.println("Planta não encontrada.");
                }
                break;

            case 3:
                System.out.println("INSERIR PLANTA: ");
                System.out.println("Digite o código da planta: ");
                int codigoInserir = teclado.nextInt();
                plantaEncontrada = false;

                for (int i = 0; i < codigo_planta.length; i++) {
                    if (codigo_planta[i] == codigoInserir) 
                    {
                        plantaEncontrada = true;
                        System.out.println("Estoque atual da planta " + nomeplanta[i] + ": " + estoqueatual[i]);
                        System.out.println("Digite a quantidade a inserir: ");
                        int quantidade = teclado.nextInt();
                        estoqueatual[i] += quantidade;
                        System.out.println("Inserção feita com sucesso!");
                        break;
                    }
                }
                if (!plantaEncontrada) 
                {
                    System.out.println("Planta não encontrada.");
                }
                break;

            case 4:
                System.out.println("IMPRIMINDO RELATÓRIO...");
                for (int i = 0; i < nomeplanta.length; i++) 
                {
                    if (estoqueatual[i] < estoqueideal[i]) 
                    {
                        int falta = estoqueideal[i] - estoqueatual[i];
                        System.out.println("Planta: " + nomeplanta[i] + " | Estoque atual: " + estoqueatual[i] + " | Necessário comprar: " + falta);
                    }
                }
                break;

            case 5:
                System.out.println("Saindo do Sistema...");
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    } while (operacao != 5);

    teclado.close();
}
}
