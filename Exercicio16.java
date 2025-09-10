import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos cigarros você fuma por dia?");
        int cigarros = in.nextInt();
        System.out.println("A quantos anos você fuma?");
        int anos = in.nextInt();

        int diasFumados = anos * 365;
        int totalCigarros = cigarros * diasFumados;
        int minutosPerdidos = totalCigarros * 10;
        int diasPerdidos = minutosPerdidos / 1440;

        System.out.println("Você perdeu " + diasPerdidos + " dias de vida.");

        in.close();
    }







}
