package classes;
import java.util.Scanner;

public class CalculoIMC {
    
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        
        // Recebendo os valores da pessoa
        System.out.println("Digite o nome da pessoa:");
        String nome = sc.nextLine();
        
        System.out.println("Digite o sobrenome da pessoa:");
        String sobrenome = sc.nextLine();
        
        System.out.println("Digite a idade da pessoa:");
        int idade = sc.nextInt();
        
        System.out.println("Digite a altura da pessoa em metros:");
        double altura = sc.nextDouble();
        
        System.out.println("Digite o peso da pessoa em kg:");
        double peso = sc.nextDouble();
        
        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);
        
        
        double imc = pessoa.getImc();
        System.out.printf("O IMC da pessoa %s %s é %.2f.\n", pessoa.getNome(), pessoa.getSobrenome(), imc);
        pessoa.informaObesidade();
        
        sc.close();
    }
}


    

