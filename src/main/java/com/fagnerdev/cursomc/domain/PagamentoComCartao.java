package com.fagnerdev.cursomc.domain;

import com.fagnerdev.cursomc.domain.Pagamento;
import com.fagnerdev.cursomc.domain.Pedido;
import com.fagnerdev.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.Entity;


@Entity
public class PagamentoComCartao extends Pagamento {

    private static final long serialVersionUID = 5587217647321071722L;
    private Integer numeroDeParcelas;

    public PagamentoComCartao(){
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }


    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
}