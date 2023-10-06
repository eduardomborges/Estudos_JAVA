import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = sc.nextInt();
        // int numero2 = sc.nextInt();
        // int numero3 = sc.nextInt();

        // if (!(numero > 10 && numero2 > 10 && numero3 > 10)){
        //     System.out.println("If deu certo");
        //     System.out.println("Algum valor é maior que 10");
        // } else {
        //     System.out.println("Número incorreto, tente novamente");
        // }

        String condicao = (numero > 10) ? "True" : "False";
        System.out.println(condicao);

        //(numero > 10) ? System.out.println("É maior"); : System.out.println("Não é maior");

        sc.close();
    }    
}
