import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, resultado;
        
        System.out.println("=== Suma de Dos Numeros ===");
        System.out.println();
        
        System.out.print("Ingresa el primer numero: ");
        num1 = sc.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        num2 = sc.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println();
        System.out.println("El resultado es: " + resultado);
        
        sc.close();
    }
}
