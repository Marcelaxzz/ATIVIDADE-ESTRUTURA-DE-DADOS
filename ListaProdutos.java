
class Produto {
    String nome;
    double preco;

   
    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome  + ", preco=" + preco + '}';
    }
}

class No {
    Produto produto;
    No anterior;
    No proximo;

    // Construtor
    No(Produto produto) {
        this.produto = produto;
    }
}

class ListaDuplamenteEncadeada {
    No cabeca;
    No cauda;

    public void adicionarInicio(Produto produto) {
        No novoNo = new No(produto);
        if (cabeca == null) {
            cabeca = cauda = novoNo;
        } else {
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
            cabeca = novoNo;
        }
    }

    public void adicionarFim(Produto produto) {
        No novoNo = new No(produto);
        if (cauda == null) {
            cabeca = cauda = novoNo;
        } else {
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            cauda = novoNo;
        }
    }

    public void adicionarNoIndice(Produto produto, int indice) {
        No novoNo = new No(produto);
        No atual = cabeca;
        for (int i = 0; i < indice && atual != null; i++) {
            atual = atual.proximo;
        }
        if (atual != null) {
            novoNo.anterior = atual.anterior;
            novoNo.proximo = atual;
            if (atual.anterior != null) {
                atual.anterior.proximo = novoNo;
            }
            atual.anterior = novoNo;
        } else {
            adicionarFim(produto);
        }
    }

    public void removerProduto(int indice) {
        No atual = cabeca;
        for (int i = 0; i < indice && atual != null; i++) {
            atual = atual.proximo;
        }
        if (atual != null) {
            if (atual.anterior != null) {
                atual.anterior.proximo = atual.proximo;
            } else {
                cabeca = atual.proximo;
            }
            if (atual.proximo != null) {
                atual.proximo.anterior = atual.anterior;
            } else {
                cauda = atual.anterior;
            }
        }
    }

    public void imprimirLista() {
        No atual = cabeca;
        while (atual != null) {
            System.out.println(atual.produto);
            atual = atual.proximo;
        }
    }
}

public class ListaProdutos {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        // Criando produtos
        Produto p1 = new Produto("Camiseta", 29.90);
        Produto p2 = new Produto("Calça", 89.90);
        Produto p3 = new Produto("Tênis", 149.90);

        // Adicionando produtos
        lista.adicionarInicio(p1);
        lista.adicionarFim(p2);
        lista.adicionarNoIndice(p3, 1);

        // Imprimindo a lista
        System.out.println("Lista de Produtos:");
        lista.imprimirLista();

        // Removendo o segundo produto
        lista.removerProduto(1);
        System.out.println("Lista após remoção do segundo produto:");
        lista.imprimirLista();

        // Adicionando novos produtos
        Produto p4 = new Produto("Jaqueta", 199.90);
        Produto p5 = new Produto("Óculos", 79.90);
        lista.adicionarInicio(p4);
        lista.adicionarFim(p5);

        // Imprimindo a lista novamente
        System.out.println("Lista após adição de novos produtos:");
        lista.imprimirLista();
    }
}
    