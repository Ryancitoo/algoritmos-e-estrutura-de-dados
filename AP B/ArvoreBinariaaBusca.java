import java.lang.Math;

class ArvoreBinariaBusca {

    private No raiz;

    public ArvoreBinariaBusca() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        this.raiz = inserirRec(this.raiz, valor);
    }

    private No inserirRec(No noAtual, int valor) {
        if (noAtual == null) {
            return new No(valor);
        }

        if (valor < noAtual.valor) {
            noAtual.esquerda = inserirRec(noAtual.esquerda, valor);
        } else if (valor > noAtual.valor) {
            noAtual.direita = inserirRec(noAtual.direita, valor);
        }
        

        return noAtual;
    }


    public void percursoEmOrdem() {
        percursoEmOrdemRec(this.raiz);
    }

    private void percursoEmOrdemRec(No noAtual) {
        if (noAtual != null) {
            percursoEmOrdemRec(noAtual.esquerda);
            System.out.print(noAtual.valor + " ");
            percursoEmOrdemRec(noAtual.direita);
        }
    }