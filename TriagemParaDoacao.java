import java.util.Scanner;
public class TriagemParaDoacao {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.print("digite seu peso: ");
        double peso = entrada.nextDouble();
        final double PESO_MINIMO = 50;
        System.out.print(peso >= PESO_MINIMO && idade >= 18? "apto para doar" : "nao apto");
    }
    
}