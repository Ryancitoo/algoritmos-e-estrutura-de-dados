import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nome do funcionário e salário:");

        String linha = in.nextLine();
        String[] partes = linha.split(" ");

        String nome = "";
        for (int i = 0; i < partes.length - 1; i++){
            nome += partes[i] + " ";
        }
        nome = nome.trim();

        int salario = Integer.parseInt(partes[partes.length - 1]);

        System.out.println("O funcionário " + nome + " tem um salário de R$" + salario);

        in.close();
    
    }


}