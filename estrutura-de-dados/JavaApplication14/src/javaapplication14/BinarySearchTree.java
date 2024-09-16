package javaapplication14;

public class BinarySearchTree {
    private Node raiz;

    public BinarySearchTree() {
        raiz = null;
    }

    // Método para inserir um valor na árvore
    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private Node inserirRec(Node raiz, int valor) {
        // Se a árvore estiver vazia, crie um novo nó
        if (raiz == null) {
            raiz = new Node(valor);
            return raiz;
        }

        // Caso contrário, desça na árvore
        if (valor < raiz.valor) {
            raiz.esq = inserirRec(raiz.esq, valor);
        } else if (valor > raiz.valor) {
            raiz.dir = inserirRec(raiz.dir, valor);
        }

        // Retorna o nó (inalterado)
        return raiz;
    }

    // Método para exibir os valores da árvore em ordem
    public void exibirEmOrdem() {
        exibirEmOrdemRec(raiz);
    }

    private void exibirEmOrdemRec(Node raiz) {
        if (raiz != null) {
            exibirEmOrdemRec(raiz.esq);
            System.out.print(raiz.valor + " ");
            exibirEmOrdemRec(raiz.dir);
        }
    }
}
