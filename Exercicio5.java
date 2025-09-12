import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args) {
        System.out.println("Qual a primeira nota?");
        Scanner in = new Scanner(System.in);
        Double nota1 = in.nextDouble();
        System.out.println("Qual a segunda nota?");
        Double nota2 = in.nextDouble();
        var media = (nota1 + nota2) / 2;
        System.out.println("A média das duas notas é: " + media);
        in.close();
    }
}
