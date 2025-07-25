package Estoque;

public class Produto {
    private String name;
    private double preco;
    private int qntd;

    public Produto(String name, double preco, int qntd) {
        this.name = name;
        this.preco = preco;
        this.qntd = qntd;
    }

    public String getName() {
        return name;
    }

    public double getPreco() {
        return preco;
    }

    public int getQntd() {
        return qntd;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", preco=" + preco +
                ", qntd=" + qntd +
                '}';
    }
}
