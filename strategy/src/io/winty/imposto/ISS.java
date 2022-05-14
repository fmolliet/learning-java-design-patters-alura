package io.winty.imposto;

import java.math.BigDecimal;

import io.winty.orcamento.Orcamento;

public class ISS implements Imposto {
    public BigDecimal calcular( Orcamento orcamento ){
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
