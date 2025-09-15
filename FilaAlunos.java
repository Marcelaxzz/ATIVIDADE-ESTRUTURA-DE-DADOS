
import java.util.LinkedList;
import java.util.Queue;

public class FilaAlunos {
    public static void main(String[] args) {
        // Criação da fila
        Queue<String> fila = new LinkedList<>();

        // Adicionando três alunos à fila
        fila.add("Marcela");
        fila.add("Rafael");
        fila.add("Sandro");

        // Imprimindo a fila
        System.out.println("Fila inicial: " + fila);

        // Removendo o primeiro aluno da fila
        String alunoRemovido = fila.poll();
        System.out.println("Aluno removido da fila: " + alunoRemovido);

        // Adicionando mais dois alunos
        fila.add("Ana");
        fila.add("Lucas");

        // Imprimindo a fila novamente
        System.out.println("Fila após adição: " + fila);
    }
}
    