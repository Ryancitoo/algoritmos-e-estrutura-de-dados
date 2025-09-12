import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
       System.out.println("Qual o valor do protuto?");
       Scanner in = new Scanner(System.in);
       Double valor = in.nextDouble();
       Double desconto = valor * 0.05;
       Double valorFinal = valor - desconto;
       System.out.printf("O valor do desconto produto com desconto é de: R$ %.2f%n",valorFinal);
       in.close();
    } 
}
