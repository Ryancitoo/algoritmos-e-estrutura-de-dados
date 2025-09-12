import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        System.out.println("Qual o valor que você tem em reais?");
        Scanner in = new Scanner(System.in);
        double reais = in.nextDouble();
        double dolar = reais / 3.45;
        System.out.printf("Você opode comprar: U$ %.2f", dolar);
        in.close();

    }




}