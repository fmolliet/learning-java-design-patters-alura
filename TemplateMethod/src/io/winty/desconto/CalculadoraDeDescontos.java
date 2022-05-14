package io.winty.desconto;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {

        Desconto cadeiaDeDescontos = new DescontoParaOrcamentosCincoItems(
                new DescontoParaOrcamentoMaior500(
                        new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);

    }
}
