import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Controle c = new Controle();

        int r;

        do {
            System.out.println("Digite 1 para cadastrar produto, 2 para venda de produto e 3 para pagamento: ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    c.cadastroProduto();;
                    break;

                case 2:
                    c.vendaProduto();
                    break;

                case 3 :
                    c.formaPagamento();;
                    break;

                default:
                    System.out.println("Opção inválida.");

            }
            System.out.println("Para ver novamente digite 0");
            r = sc.nextInt();
        } while (r ==0);
        sc.close();
    }
}