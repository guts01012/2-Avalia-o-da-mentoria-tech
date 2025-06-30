import java.util.Scanner;
public class CalculoDeNotaFinal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print(" digite sua primeira nota: ");
        double nota1 = entrada.nextDouble();
            System.out.print("digite sua segunda nota: ");
            double nota2 = entrada.nextDouble();
        double resultado = ( nota1 + nota2 /2);
            System.out.print( resultado>=7 ?"aprovado" : "reprovado");
        
    }
    
}