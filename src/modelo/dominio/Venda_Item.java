package modelo.dominio;

import java.math.BigDecimal;

public class Venda_Item {
    private Venda venda;
    private Produto produto;
    private Integer quantidade;
    private BigDecimal total;
    private BigDecimal desconto;

    public Venda_Item() {
    }

    public Venda_Item(Venda venda,Produto produto, Integer quantidade, BigDecimal total,BigDecimal desconto){
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.total = total;
        this.desconto = desconto;
        }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }
}
