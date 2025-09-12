import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        System.out.println("Qual o valor do salário atual?");
        Scanner in = new Scanner(System.in);
        Double salario = in.nextDouble();
        Double aumento = salario * 0.15;
        Double salarioFinal = salario + aumento;
        System.out.println("O valor do salário com aumento é de: R$ " + salarioFinal);
        in.close();
    }
}
