
import java.util.Scanner;

public class VerificaçaoDeCompra {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print(" digite o valor do produto: ");
        double preçoDoProduto = entrada.nextDouble();
        System.out.print(" digite o valor que voce tem na conta: ");
         double valorDisponivel = entrada.nextDouble();
        final double TAXA_DE_DESCONTO = 0.10;
        double precoComDesconto = preçoDoProduto - (preçoDoProduto + TAXA_DE_DESCONTO);
         boolean compraPermitida = valorDisponivel >= preçoDoProduto;
        System.out.print("compra permitida"+compraPermitida);
        
    }
    
}