package application;

import entities.Produto;

public class Program {
    public static void main(String[] args) {
        Produto computador = new Produto("Computador", 2600.99, 10);
        Produto moto = new Produto("Motocileta", 18600.20, 48);
        Produto casa = new Produto("Casa", 200000.20, 200);

        System.out.println("Computador: " + computador);
        System.out.printf("Comprei uma: %s por: R$ %.2f e parcelei em: %d vezes%n", moto.getNomeProduto(), moto.getPreco(), moto.getQtdParcelas());
        System.out.printf("Eu e meu marido compramos uma %s o valor dela foi de aproximadamente: %.2f e parcelmos em apenas: %d vezes%n", casa.getNomeProduto(), casa.getPreco(), casa.getQtdParcelas());
    }
}
