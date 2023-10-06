package entities;

public class Produto {
    private String nomeProduto;
    private double preco;
    private int qtdParcelas;

    public Produto(String nomeProduto, double preco, int qtdParcelas) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.qtdParcelas = qtdParcelas;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    @Override
    public String toString() {
        return "Produto [nomeProduto=" + nomeProduto + ", preco=" + preco + ", qtdParcelas=" + qtdParcelas + "]";
    }
}
