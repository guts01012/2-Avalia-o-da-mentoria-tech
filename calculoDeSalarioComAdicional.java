import java.util.Scanner;

public class calculoDeSalarioComAdicional {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); 

        System.out.print("Digite seu salário: ");
        double salarioBase = entrada.nextDouble();

        System.out.print("Digite a porcentagem de aumento: ");
        int porcentagem = entrada.nextInt(); 

        double salarioFinal = salarioBase + (salarioBase * (porcentagem / 100.0));

        System.out.println("Seu salário final com aumento é: " + salarioFinal); 

        entrada.close(); 
    }
}