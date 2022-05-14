package io.winty.desconto;

import java.math.BigDecimal;

public class DescontoParaOrcamentosCincoItems extends Desconto {

    public DescontoParaOrcamentosCincoItems(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
