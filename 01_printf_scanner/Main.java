public class Main {
    public static void main(String[] args) {
        String nome = "sicrano";
        int numero = 10;
        double numeroComVirgula = 10.567849841;

        /* print e variações 
            System.out.print(); -> imprime o conteúdo na tela
            Sysyem.out.printf(); -> imprime o conteéudo na tela com formatação
            System.out.println(); -> imprime o conteúdo na tela com quebra de linha
         */
        /* print() */
        System.out.print(nome);
        System.out.print(numero);
        System.out.print(numeroComVirgula);

        /* println() */
        System.out.println(nome);
        System.out.println(numero);
        System.out.println(numeroComVirgula);

        /* printf() */
        System.out.printf("O nome da pessoa é: %s, e o numero da pessoa é: %d e ela possui R$ %.2f", nome, numero, numeroComVirgula);
        // System.out.printf("%d", numero);
        // System.out.printf("%f", numeroComVirgula);

    }
}
