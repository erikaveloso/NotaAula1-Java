import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String nome;
        double nota1, nota2, nota3, media;

        System.out.println("Nome do aluno: ");
        nome = sc2.nextLine();
        System.out.println("Primeira nota:");
        nota1 = sc.nextDouble();
        System.out.println("Segunda nota:");
        nota2 = sc.nextDouble();
        System.out.println("Terceira nota:");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println(nome + " está aprovado (a).");
        } else if (media < 4) {
            System.out.println(nome + " está reprovado (a).");
        } else {
            System.out.println(nome + " está na final");
        }
    }
}