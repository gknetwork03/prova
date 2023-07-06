import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Informe a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.println("Informe o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        double total = precoUnitario * quantidade;

        System.out.println("\n----- Detalhes do Pedido -----");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Unitário: R$ " + precoUnitario);
        System.out.println("Total do item: R$ " + total);

        System.out.println("\nValor total: R$ " + total);

        System.out.println("\nInforme o percentual de desconto desejado: ");
        double percentualDesconto = scanner.nextDouble();

        double desconto = total * (percentualDesconto / 100.0);
        double valorFinal = total - desconto;

        System.out.println("\n----- Resumo do Pedido -----");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Unitário: R$ " + precoUnitario);
        System.out.println("Total do item: R$ " + total);
        System.out.println("Valor total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);
    }
}
		     

	

