 import java.util.Scanner; 

public class Exercicio2 {   
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");

        String nome = in.nextLine();
        
        in.close();
        System.out.println("Olá, " + nome + " é um prazer te conhecer!");
        
        
}   
}