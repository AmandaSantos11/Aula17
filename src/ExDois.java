import java.util.Scanner;

public class ExDois {
    public static Scanner digite = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite seu nome: ");
        System.out.println(dizerInformacao(digite.next()));

        System.out.println("Digite sua idade: ");
        System.out.println(dizerInformacao(digite.nextInt()));

        System.out.println("Digite seu peso e sua altura: ");
        System.out.printf(dizerInformacao(digite.nextDouble(), digite.nextDouble()));
    }
    public static String dizerInformacao (String nome){
        return "Meu nome é: " +nome;
    }
    public static String dizerInformacao(int idade){
        return "Minha idade é: " +idade;
    }
    public static String dizerInformacao(double peso, double altura){
        return "Meu peso é " + peso + " e minha altura é " +altura;
    }
}
