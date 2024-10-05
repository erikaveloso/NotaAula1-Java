import java.util.Scanner;

public class Controle {

    int codigo, quantidade, quantidadeVendida, opcaoPagamento;
    double valor, valorTotal, valorFinal, valorPago;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public int getOpcaoPagamento() {
        return opcaoPagamento;
    }

    public void setOpcaoPagamento(int opcaoPagamento) {
        this.opcaoPagamento = opcaoPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public void cadastroProduto() {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Código do produto: ");
        codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Tamanho ou peso do produto: ");
        String tamanho = sc.nextLine();
        System.out.print("Cor do produto: ");
        String cor = sc.nextLine();
        System.out.print("Valor do produto: ");
        valor = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        quantidade = sc.nextInt();
    }

    public void vendaProduto() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos produtos você quer comprar? ");
        quantidadeVendida = sc.nextInt();
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
            System.out.println("Quantidade em estoque.");
        } else {
            System.out.println("Não temos essa quantidade no estoque.");
        }
    }

    public void formaPagamento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nFormas de pagamento:");
        System.out.println("1. Pix (5% de desconto)");
        System.out.println("2. Dinheiro (5% de desconto e troco)");
        System.out.println("3. Cartão de débito (5% de desconto)");
        System.out.println("4. Cartão de crédito (pode pagar em 3 vezes)");
        System.out.print("Escolha como você quer pagar: ");
        opcaoPagamento = sc.nextInt();

        valorTotal = valor * quantidadeVendida;
        valorFinal = valorTotal;

        if (opcaoPagamento == 1 || opcaoPagamento == 2 || opcaoPagamento == 3) {
            valorFinal = valorTotal * 0.95;
            System.out.println("Você ganhou um desconto! O valor final é: " + valorFinal);
        } else if (opcaoPagamento == 4) {
            System.out.println("Você pode pagar em 3 vezes de: " + (valorTotal / 3));
        }

        if (opcaoPagamento == 2) {
            System.out.print("Quanto você vai pagar em dinheiro? ");
            valorPago = sc.nextDouble();
            if (valorPago > valorFinal) {
                System.out.println("Seu troco é: " + (valorPago - valorFinal));
            } else if (valorPago < valorFinal) {
                System.out.println("Você deu menos dinheiro do que o valor total.");
            }
        }

        System.out.println("\nAgora temos " + quantidade + " produtos no estoque.");

    }
}