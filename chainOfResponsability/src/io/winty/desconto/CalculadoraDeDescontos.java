package io.winty.desconto;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {

        Desconto desconto = new DescontoParaOrcamentosCincoItems(
                new DescontoParaOrcamentoMaior500(
                        new SemDesconto()));

        return desconto.calcular(orcamento);

    }
}
