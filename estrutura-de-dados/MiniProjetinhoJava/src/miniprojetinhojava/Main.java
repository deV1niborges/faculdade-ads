package miniprojetinhojava;

// Classe Nó para representar um nó da árvore
class No {
    int valor;
    No esquerdo, direito;

    public No(int valor) {
        this.valor = valor;
        esquerdo = direito = null;
    }
}

// Classe Árvore Binária
class ArvoreBinaria {
    No raiz;

    // Construtor
    public ArvoreBinaria() {
        raiz = null;
    }

    // Método para adicionar um valor na árvore
    public void adicionar(int valor) {
        raiz = adicionarRecursivo(raiz, valor);
    }

    // Função recursiva para inserir um nó
    private No adicionarRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor) {
            atual.esquerdo = adicionarRecursivo(atual.esquerdo, valor);
        } else if (valor > atual.valor) {
            atual.direito = adicionarRecursivo(atual.direito, valor);
        }

        return atual;
    }

    // Método para percorrer a árvore em ordem (in-order)
    public void percorrerInOrder(No no) {
        if (no != null) {
            percorrerInOrder(no.esquerdo);
            System.out.print(no.valor + " ");
            percorrerInOrder(no.direito);
        }
    }

    // Método para buscar um valor na árvore
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    // Função recursiva para buscar um valor
    private boolean buscarRecursivo(No atual, int valor) {
        if (atual == null) {
            return false;
        }

        if (valor == atual.valor) {
            return true;
        }

        return valor < atual.valor
                ? buscarRecursivo(atual.esquerdo, valor)
                : buscarRecursivo(atual.direito, valor);
    }

    // Método principal para testar a árvore binária
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Adicionando valores na árvore
        arvore.adicionar(50);
        arvore.adicionar(30);
        arvore.adicionar(20);
        arvore.adicionar(40);
        arvore.adicionar(70);
        arvore.adicionar(60);
        arvore.adicionar(80);

        // Percorrendo a árvore
        System.out.print("Percurso em ordem: ");
        arvore.percorrerInOrder(arvore.raiz);
        System.out.println();

        // Buscando um valor
        int valorParaBuscar = 40;
        if (arvore.buscar(valorParaBuscar)) {
            System.out.println("Valor " + valorParaBuscar + " encontrado na árvore.");
        } else {
            System.out.println("Valor " + valorParaBuscar + " não encontrado na árvore.");
        }
    }
}
