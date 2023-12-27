import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Menu---------- \nEscolha uma opcão \n0 - Sair \n1 - Nível Fácil ");
        int opcao = sc.nextInt();

        while(opcao != 0) {
            if (opcao == 1) {
                NivelFacil nivelFacil = new NivelFacil();
                nivelFacil.jogar();
            }
            if (sc.hasNextInt()){
                opcao = sc.nextInt();
            } else {
                opcao = 0;
            }

        }

    }
}