package modelo.dominio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Venda {
    private Long id;
    private Cliente cliente;
    private Usuario usuario;
    private BigDecimal totalDaVenda;
    private BigDecimal valorPago;
    private BigDecimal troco;
    private LocalDateTime data_Hora_Criacao;
    private LocalDateTime ultimaAtualizacao;

    public Venda() {
    }

    public Venda(Long id,Cliente cliente,Usuario usuario,BigDecimal totalDaVenda,BigDecimal valorPago,BigDecimal troco,LocalDateTime data_Hora_Criacao,LocalDateTime ultimaAtualizacao) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getTotalDaVenda() {
        return totalDaVenda;
    }

    public void setTotalDaVenda(BigDecimal totalDaVenda) {
        this.totalDaVenda = totalDaVenda;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    public LocalDateTime getData_Hora_Criacao() {
        return data_Hora_Criacao;
    }

    public void setData_Hora_Criacao(LocalDateTime data_Hora_Criacao) {
        this.data_Hora_Criacao = data_Hora_Criacao;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
}

