public class Lista {
    private int[] vetor;
    private int tamanho;
    private final int capacidade = 5;

    public Lista() {
        this.vetor = new int[capacidade];
        this.tamanho = 0;   

    }

    public void inserir(int valor){
        if(tamanho < capacidade){
            vetor[tamanho] = valor;
            tamanho++;
            System.out.println("Valor " + valor + " inserido na Lista.");
        } else {
            System.out.println("ERRO: A lista está cheia! (Capacidade máxima de " + capacidade + " elementos).");
        }
    }

    public void mostrar(){
        if (tamanho == 0) {
            System.out.println("A lista está vazia.");
            return;
        }

        System.out.println("Lista: [");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
            System.out.println("]");
        }






    }









}
