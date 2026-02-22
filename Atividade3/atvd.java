import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // 1
        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};
        double soma = 0;
        int totalNotas = 0;
        for (double n : notas) {
            soma += n;
            totalNotas += 1;
        }

        double media = soma / totalNotas;
        System.out.println(media);

        int acimaMedia = 0;
        for (double n : notas) {
            if (n > media) {
                acimaMedia += 1;
            }
        }
        System.out.println(acimaMedia);

        double maiorNota = notas[0];
        for (double n : notas) {
            if (n > maiorNota) {
                maiorNota = n;
            }
        }
        System.out.println(maiorNota);

        // 2
        int valorSaque = leitor.nextInt();

        int qtd50 = valorSaque / 50;
        int restoCaixa = valorSaque % 50;

        int qtd20 = restoCaixa / 20;
        int restoFinal = restoCaixa % 20;

        int qtd10 = restoFinal / 10;

        System.out.println(qtd50);
        System.out.println(qtd20);
        System.out.println(qtd10);

        //  3
        leitor.nextLine(); 
        String senhaUser = leitor.nextLine();
        String especiais = "@#$%&*";
        int temEspecial = 0;
        int tamanho = 0;

        for (int i = 0; i < senhaUser.length(); i++) {
            tamanho++;
            char c = senhaUser.charAt(i);
            if (especiais.indexOf(c) != -1) {
                temEspecial = 1;
            }
        }

        if (tamanho < 8) {
            System.out.println("Invalida");
            System.out.println("Tamanho");
        } else if (temEspecial == 0) {
            System.out.println("Invalida");
            System.out.println("Especial");
        } else {
            System.out.println("Valida");
        }

        // 4
        int segundosTotal = leitor.nextInt();

        int h = segundosTotal / 3600;
        int r = segundosTotal % 3600;
        int m = r / 60;
        int sFinal = r % 60;

        System.out.println(h);
        System.out.println(m);
        System.out.println(sFinal);

        //  5
        int[] listaNumeros = {1, 2, 3, 4, 5, 2};
        int temRepetido = 0;

        for (int num1 : listaNumeros) {
            int cont = 0;
            for (int num2 : listaNumeros) {
                if (num1 == num2) {
                    cont++;
                }
            }
            if (cont > 1) {
                temRepetido = 1;
            }
        }

        if (temRepetido == 1) {
            System.out.println("Repetido");
        } else {
            System.out.println("Unico");
        }
    }
}