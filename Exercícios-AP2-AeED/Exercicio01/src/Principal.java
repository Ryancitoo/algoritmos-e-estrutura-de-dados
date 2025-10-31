import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Inicializa as estruturas de dados e o scanner para leitura
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        
        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                executarOpcao(opcao, scanner, lista, pilha, fila);
            } else {
                System.out.println("\nOPÇÃO INVÁLIDA: Por favor, digite um número.");
                scanner.next(); // Consome a entrada inválida para evitar loop infinito
                opcao = -1; // Garante que o loop continue
            }
        }

        System.out.println("\nPrograma encerrado. Até mais!");
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n--- MENU DE ESTRUTURAS DE DADOS ---");
        System.out.println("1. Lista: Inserir");
        System.out.println("2. Lista: Mostrar");
        System.out.println("-----------------------------------");
        System.out.println("3. Pilha: Empilhar");
        System.out.println("4. Pilha: Desempilhar");
        System.out.println("5. Pilha: Mostrar");
        System.out.println("-----------------------------------");
        System.out.println("6. Fila: Enfileirar");
        System.out.println("7. Fila: Desenfileirar");
        System.out.println("8. Fila: Mostrar");
        System.out.println("-----------------------------------");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opcao: ");
    }

    private static void executarOpcao(int opcao, Scanner scanner, Lista lista, Pilha pilha, Fila fila) {
        int valor;

        switch (opcao) {
            case 1: // Lista: Inserir
                System.out.print("Digite o valor a ser inserido na Lista: ");
                if (scanner.hasNextInt()) {
                    valor = scanner.nextInt();
                    lista.inserir(valor);
                } else {
                    System.out.println("Valor inválido.");
                    scanner.next();
                }
                break;
            case 2: // Lista: Mostrar
                lista.mostrar();
                break;
            case 3: // Pilha: Empilhar
                System.out.print("Digite o valor a ser empilhado: ");
                if (scanner.hasNextInt()) {
                    valor = scanner.nextInt();
                    pilha.empilhar(valor);
                } else {
                    System.out.println("Valor inválido.");
                    scanner.next();
                }
                break;
            case 4: // Pilha: Desempilhar
                pilha.desempilhar();
                break;
            case 5: // Pilha: Mostrar
                pilha.mostrar();
                break;
            case 6: // Fila: Enfileirar
                System.out.print("Digite o valor a ser enfileirado: ");
                if (scanner.hasNextInt()) {
                    valor = scanner.nextInt();
                    fila.enfileirar(valor);
                } else {
                    System.out.println("Valor inválido.");
                    scanner.next();
                }
                break;
            case 7: // Fila: Desenfileirar
                fila.desenfileirar();
                break;
            case 8: // Fila: Mostrar
                fila.mostrar();
                break;
            case 0:
                // O programa sairá no loop 'while' principal
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA: Por favor, escolha uma opção entre 0 e 8.");
        }
    }
}
