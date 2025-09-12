import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        System.out.println("Qual a altura da parede?");
        Scanner in = new Scanner(System.in);
        Double altura = in.nextDouble();
        System.out.println("Qual a largura da parede?");
        Double largura = in.nextDouble();
        double area = altura * largura;
        double tinta = area / 2;
        System.out.printf("A área da parede é de: %.2f m²%n", area);
        System.out.printf("A quantidade de tinta necessária é de: %.2f litros%n",tinta);
        in.close();
    }

}
