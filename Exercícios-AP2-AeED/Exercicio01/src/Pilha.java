public class Pilha {
    private int[] vetor;
    private int topo;
    private final int capacidade = 5; 

    public Pilha(){
        this.vetor = new int[capacidade];
        this.topo = -1;
    }

    public void empilhar(int valor){
        if (topo < capacidade -1){
            topo++;
            vetor[topo] = valor;
            System.out.println("Valor " + valor + " empilhado");
        } else {
            System.out.println("ERRO: A pilha está cheia! Não é possível empilhar "+ valor);




        }
    }

    public int desempilhar(){
        if (topo >= 0){
            int valorRemovido = vetor[topo];
            topo--;
            System.out.println("Valor " + valorRemovido + " desempilhado");
            return valorRemovido;
        } else {
            System.out.println("ERRO: A pilha está vazia! Não é possível desempilhar.");
            return -1;
        }

    }

    public void mostrar() {
        if (topo == -1) {
            System.out.println("Pilha: [] (Vazia)");
            return;
        }

        System.out.print("Pilha (Topo -> Base): [");
        for (int i = topo; i >= 0; i--) {
            System.out.print(vetor[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

