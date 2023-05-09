import java.util.Scanner;
public class ExUm {
    public static Scanner digite = new Scanner(System.in);
    public static void main(String[] args) {
        menuDoControle();
    }
    public static int menuDoControle (){
        System.out.println("----------------------");
        System.out.println("Menu do controle: ");
        System.out.println("1-Controlar o volume | 2-Trocar de canal | 3- Consultar status da TV | 4-Sair");
        System.out.println("Digite a opção que deseja: ");
        opcoesDoControle(digite.nextInt());

        return menuDoControle();
    }
    public static int opcoesDoControle (int opcaoControle){
        switch (opcaoControle){
            case 1:
                controlarVolume();
                break;

            case 2:
                trocarDeCanal();
                break;

            case 3:
               statusTv();
               break;

            case 4:
                System.exit(0);
                break;

            default:
                System.out.println("Opção inválida");
        }
        return opcaoControle;
    }
    public static int volume;
    public static int controlarVolume(){
        System.out.println("----------------------");
        System.out.println("Você deseja: ");
        System.out.println("1-Aumentar volume | 2-Diminuir volume | 3-Voltar ao menu");
        int escolhaDoUsuario= digite.nextInt();

        int volumeMax=10;
        int volumeMin=1;

        switch (escolhaDoUsuario){
            case 1:
                if (volume < volumeMax){
                    volume++;
                    System.out.println("O volume foi aumentado em uma unidade");
                    System.out.println("Volume atual: "+volume);
                }
                else {
                    System.out.println("O volume está no máximo");
                }
            break;

            case 2:
                if (volume >= volumeMin && volume <=volumeMax){
                    volume --;
                    System.out.println("O volume foi diminuído em uma unidade");
                    System.out.println("Volume atual: " +volume);
                }
                else {
                    System.out.println("A TV está no mudo");
                }
            break;

            case 3:
                menuDoControle();
            break;

            default:
                System.out.println("Opção inválida");
        }
        return controlarVolume();
    }
    public static int canal;
    public static int trocarDeCanal(){
        System.out.println("----------------------");
        System.out.println("Você deseja: ");
        System.out.println("1-Avançar um canal | 2-Voltar um canal | 3-Voltar ao menu");
        int escolhaDoUsuario= digite.nextInt();

        int canalMax=10;
        int canalMin=1;

        switch (escolhaDoUsuario){
            case 1:
                if (canal < canalMax){
                    canal++;
                    System.out.println("O canal foi avançado em uma unidade");
                    System.out.println("Canal atual: "+canal);
                }
                else {
                    System.out.println("Não é possível avançar mais");
                }
                break;

            case 2:
                if (canal >= canalMin && canal <=canalMax){
                    canal --;
                    System.out.println("O canal foi voltado em uma unidade");
                    System.out.println("Canal atual: " +canal);
                }
                else {
                    System.out.println("Não é possível voltar mais");
                }
                break;

            case 3:
                menuDoControle();
                break;

            default:
                System.out.println("Opção inválida");
        }
     return trocarDeCanal();
    }
    public static int statusTv(){

        System.out.println("Status da TV:");
        System.out.println("Volume " +volume);
        System.out.println("Canal " +canal);

    return menuDoControle();
    }
}






