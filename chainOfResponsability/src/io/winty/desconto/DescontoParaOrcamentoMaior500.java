package io.winty.desconto;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaior500 extends Desconto {
    public DescontoParaOrcamentoMaior500(Desconto proximo) {
        super(proximo);

    }

    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.15"));
        }

        return proximo.calcular(orcamento);

    }
}
