import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        System.out.println("Qual o número?");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int antecessor = num - 1;
        int sucessor = num + 1;
        System.out.println("O antecessor é: " + antecessor);    
        System.out.println("O sucessor é: " + sucessor);
        in.close();
    }




}
