import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        System.out.println("Qual o número?");
        Scanner in = new Scanner(System.in);
        Double num = in.nextDouble();
        double dobro = num * 2;
        double terceiraParte = num/3;
        System.out.println("O dobro é: " + dobro);
        System.out.println("A terça parte é : " + terceiraParte);
        in.close();

    }

}