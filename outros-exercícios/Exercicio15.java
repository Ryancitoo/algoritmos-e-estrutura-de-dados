import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        System.out.println("Quantos dias você trabalhou no mês?");
        Scanner in = new Scanner(System.in);
        Double dias = in.nextDouble();
        double horas = dias *8;
        double salario = horas * 25;
        System.out.printf("O valor do seu salário é de: R$ %.2f",salario);
        in.close();
    }
}