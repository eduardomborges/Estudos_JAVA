import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //sc.next() -> obtém a primeira String que o usuário digitar
        //sc.nextLine() -> similar ao next(), mas obtém tudo que o usuário digitar ate o primeiro enter
        //sc.nextInt() -> obtém um número inteiro
        //sc.nextDouble() -> obtém um número com casas decimais
        //sc.nextBoolean() -> obtém verdadeiro ou falso 
        
        System.out.println("Digite o seu primeiro nome:");
        String nome = sc.next();

        sc.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.println("Digite qual genêro vc se identifica:");
        char genero = sc.next().charAt(0);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();

        System.out.println("Pode ser promovido?: ");
        boolean podeSerPromovido = sc.nextBoolean();

            Funcionario funcionario = new Funcionario(nome, sobrenome, genero, idade, salario, podeSerPromovido);

            System.out.println(funcionario);
        sc.close();
    }
}
