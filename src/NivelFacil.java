import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NivelFacil {

    int pontos = 25;

    void jogar() {
        int numerosAleatorios;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero entre 0 e 30: ");
        int numero = sc.nextInt();



        int upperbound = 10;
        Random random = new Random();
        numerosAleatorios = random.nextInt(upperbound);




        if (numero != numerosAleatorios) {
            --pontos;
            System.out.println("Numero incorreto! Tente novamente \nPontuação: " + pontos);


        } else {
            ++pontos;
            System.out.println("Você acertou! Numero: " + numero + "\nPontuação: " + pontos);

        }

        System.out.println("Digite um numero entre 0 e 30: ");
        numero = sc.nextInt();

        if (numero != 0) {
            jogar();
        } else {
            System.out.println("Encerrando jogo!");
        }

    }

}


