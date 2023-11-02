import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NivelFacil {

    int pontos = 25;

    void jogar() {
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        ArrayList<Integer> numerosEscolhidos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero entre 0 e 30: ");
        int numero = sc.nextInt();

        numerosEscolhidos.add(numero);


        for (int i = 0; i < numerosEscolhidos.size() ; i++) numerosEscolhidos.add(numerosEscolhidos.indexOf(i));




        int upperbound = 30;
        Random random = new Random();
        numerosAleatorios.add(random.nextInt(upperbound));

        for (int i = 0; i < numerosAleatorios.size(); i++) {
            for (int j = 0; j < numerosEscolhidos.size(); i++) {
                if (numerosAleatorios.indexOf(i) == numerosEscolhidos.indexOf(j)) {
                    System.out.println("Numero incorreto! Tente Novamente! Numero: " + numerosEscolhidos.indexOf(j));
                    pontos = pontos - 1;
                } else {
                    System.out.println("Parábens! Você acertou! Número: " + numerosEscolhidos.indexOf(j));
                    pontos = pontos + 1;
                }
                System.out.println("Pontuação: " + pontos);
                jogar();
            }
        }







    }

}
