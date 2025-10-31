public class Fila {
    private int[] vetor;
    private int inicio;
    private int fim;
    private int total;
    private final int  capacidade = 5;


    public Fila() {
        this.vetor = new int[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.total = 0;
    }

    public void enfileirar(int valor){
        if (total < capacidade){
            vetor[fim] = valor;
            fim = (fim + 1) % capacidade;
            total++;
            System.out.println("Valor " + valor + " enfileirado");
        } else {
            System.out.println("ERRO: A fila esta cheia! Nao e possivel enfileirar " + valor);
        }

    }

    public int desenfileirar(){
        if (total > 0){
            int valorRemovido = vetor[inicio];
            inicio = (inicio + 1) % capacidade;
            total--;
            System.out.println("Valor " + valorRemovido + " desenfileirado");
            return valorRemovido;
        } else {
            System.out.println("ERRO: A fila esta vazia! Nao e possivel desenfileirar.");
            return -1;
        }
    }

    public void mostrar() {
        if (total == 0) {
            System.out.println("Fila: [] (Vazia)");
            return;
        }

        System.out.print("Fila (Início -> Fim): [");
        int pos = inicio;
        for (int i = 0; i < total; i++) {
            System.out.print(vetor[pos]);
            if (i < total - 1) {
                System.out.print(", ");
            }
            pos = (pos + 1) % capacidade; // Move para a próxima posição de forma circular
        }
        System.out.println("]");
    }

}


