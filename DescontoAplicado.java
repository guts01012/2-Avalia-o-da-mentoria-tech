public class DescontoAplicado {
    public static void main(String[] args) {
        
        boolean produtoEmDesconto = true; 
        boolean clienteTemCupom = false;   
        
        boolean descontoAplicado = produtoEmDesconto || clienteTemCupom;
        
        System.out.println("Desconto aplicado: " + descontoAplicado);
    }
}