import java.util.Scanner;

public class ExUm {
    public static Scanner digite = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escolha uma opção do controle: ");
        System.out.println("1-Controlar o volume, 2-Trocar de canal, 3- Consultar status da TV");
        opcoesDoControle(digite.nextInt());

        System.out.println(controlarVolume());
    }
    public static void opcoesDoControle (int opcaoControle){

        switch (opcaoControle){
            case 1:
                controlarVolume();
                break;

           // case 2:
                //trocarCanal();
                //break;

           // case 3:
               // statusTv();
               // break;

            default:
                System.out.println("Opção inválida");
        }
    } public static int som =5;
    public static int controlarVolume(){

        System.out.println("Você deseja: 1-Aumentar volume, 2-Diminuir volume");
        som = digite.nextInt();

        if ((som >=0) && (som <=50)){
            som++;
            System.out.println("Som: "+som);
        }
        return som;
    }
}
        // Não consegui terminar
