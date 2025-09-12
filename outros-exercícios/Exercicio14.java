import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        System.out.println("Quantos Km foram percorridos?");
        Scanner in = new Scanner(System.in);
        Double km = in.nextDouble();
        System.out.println("Quantos dias o carro foi alugado?");
        Double dias = in.nextDouble();
        Double valor = (km * 0.20) + (dias * 90);
        System.out.printf("O valor total a ser pago é de R$ %.2f",valor);
        in.close();
    }
}
