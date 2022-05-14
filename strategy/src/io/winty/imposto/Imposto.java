package io.winty.imposto;

import java.math.BigDecimal;

import io.winty.orcamento.Orcamento;

public interface Imposto {
     BigDecimal calcular(Orcamento orcamento);
}
