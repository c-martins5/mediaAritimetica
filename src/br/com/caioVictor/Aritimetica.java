package br.com.caioVictor;

import java.util.Scanner;

public class Aritimetica {

    public static void main(String[] args) {

        double primeiraNota, segundaNota, mediaAluno, precisaRecuperacao, precisaFinal;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        primeiraNota = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        segundaNota = entrada.nextDouble();

        mediaAluno = (primeiraNota + segundaNota) / 2;
        System.out.println("A média do aluno é: " + String.format("%,.2f", mediaAluno));

        precisaRecuperacao = (10 - mediaAluno) + 2;
        precisaFinal = 10 - mediaAluno;

        if (mediaAluno >= 7) {
            System.out.println("O aluno foi APROVADO!");
        } else if (mediaAluno >= 5) {
            System.out.println("O aluno está na prova final precisando da nota " + String.format("%,.2f", precisaFinal));
        } else {
            System.out.println("O aluno está em recuperação precisando da nota " + String.format("%,.2f", precisaRecuperacao));
        }
    }
}
