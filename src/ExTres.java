import java.util.Scanner;

public class ExTres {
    public static Scanner digite = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite a nota do aluno: ");
        System.out.println(notaDoAluno(digite.nextDouble()));
    }
    public static char notaDoAluno(double nota) {

        if (nota >= 9.0) {
            return 'A';
        } else if (nota >= 8.0 && nota < 9.0) {
            return 'B';
        } else if (nota >= 7.0 && nota < 8.0) {
            return 'C';
        } else if (nota >= 6.0 && nota < 7.0) {
            return 'D';
        } else {
            return 'E';
        }
    }
}

