package io.winty.desconto;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaior500 extends Desconto {
    public DescontoParaOrcamentoMaior500(Desconto proximo) {
        super(proximo);
    }
    
    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.15"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

}
