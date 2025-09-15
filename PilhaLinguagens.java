
import java.util.Stack;

public class PilhaLinguagens {
    public static void main(String[] args) {
        // Criação da pilha
        Stack<String> pilha = new Stack<>();

        // Adicionando três linguagens de programação
        pilha.push("Java");
        pilha.push("Python");
        pilha.push("JavaScript");

        // Imprimindo a pilha
        System.out.println("Pilha inicial: " + pilha);

        // Removendo o topo da pilha
        String topo = pilha.pop();
        System.out.println("Elemento removido do topo: " + topo);

        // Adicionando mais duas linguagens
        pilha.push("C++");
        pilha.push("Ruby");

        // Imprimindo a pilha novamente
        System.out.println("Pilha após adição: " + pilha);
    }
}
    