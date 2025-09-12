import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        System.out.println("Qual q medida em metros?");
        Scanner in = new Scanner(System.in);
        Double metros = in.nextDouble();
        double centimetros = metros * 100;
        System.out.println("Em centímetros é: " + centimetros);
        in.close();
    

    }
    

}
