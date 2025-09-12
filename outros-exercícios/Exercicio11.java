import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        System.out.println("Qual o valor de a?");
        Scanner in = new Scanner(System.in);
        Double a = in.nextDouble();
        System.out.println("Qual o valor de b?");
        Double b = in.nextDouble();
        System.out.println("Qual o valor de c?");
        Double c = in.nextDouble();
        double delta = Math.pow(b, 2) - 4*a*c;
        System.out.println("Delta é igual a: " + delta);
        in.close();
    }
}
