import java.util.Scanner;
public class entradaDeUsuario {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print(" digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print(" digite sua idade: ");
        Integer idade = entrada.nextInt();
        System.out.print("digite sua altura: ");
        Double altura = entrada.nextDouble();
        
        System.out.println("---------------------");
        System.out.println(" seu nome e: " + nome );
        
        System.out.println("--------------------");
        System.out.println(" sua idade e: " + idade);
        
        System.out.println("--------------------");
        System.out.print(" sua altura e: " + altura);
        
        
    }
    
}