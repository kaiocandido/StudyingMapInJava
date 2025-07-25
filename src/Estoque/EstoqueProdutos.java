package Estoque;

import java.util.HashMap;
import java.util.IllegalFormatCodePointException;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String name, double preco, int qntd){
        estoqueMap.put(codigo, new Produto(name, preco, qntd));
    }

    public void exibir(){
        System.out.println(estoqueMap);
    }

    public double calValorTotal(){
        double valorTotalEstoque = 0;
        if(!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()){
                valorTotalEstoque += p.getQntd() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()){
                if (p.getPreco() < menorPreco){
                    produMaisBarato = p;
                }
            }
        }
        return produMaisBarato;
    }

    public double valorTotalEstoque(){
        double totalEstoque = 0;
        if (!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()){
                totalEstoque += p.getPreco() * p.getQntd();
            }
        }
        return totalEstoque;
    }
}
