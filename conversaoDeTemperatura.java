import java.util.Scanner;

public class conversaoDeTemperatura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        int graus = entrada.nextInt(); 

        double conversaoF = (graus * 9.0 / 5.0) + 32; 

        System.out.println("Conversão de Celsius para Fahrenheit: " + conversaoF + " °F");

        entrada.close(); 
    }
}