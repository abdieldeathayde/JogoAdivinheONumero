import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Menu---------- \nEscolha uma opcão \n0 - Sair \n1 - Nível Fácil ");
        String opcao = sc.next();
        NivelFacil nivelFacil = new NivelFacil();

        switch (opcao) {
            case "0" -> System.out.println("Encerrando jogo! Obrigado por utilizar este sistema");
            case "1" -> nivelFacil.jogar();
            default -> throw new IllegalStateException("Unexpected value: " + opcao);
        }
    }
}