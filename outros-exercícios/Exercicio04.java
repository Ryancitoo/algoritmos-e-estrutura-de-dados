import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
        System.out.println("Qual o primeiro número da soma?");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Qual o segundo número da soma?");
        int num2 = in.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos dois números é: " + soma);
        in.close();

    }
}
