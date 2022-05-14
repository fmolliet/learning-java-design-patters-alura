package io.winty.orcamento.situacao;

import java.math.BigDecimal;

import io.winty.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
    
    public BigDecimal calcularValorDescontoExtra( Orcamento orcamento ){
        return BigDecimal.ZERO;
    }

    public void aprovar( Orcamento orcamento ){
        throw new RuntimeException("O orcamento nao pode ser aprovado");
    }
    
    public void reprovar( Orcamento orcamento ){
        throw new RuntimeException("O orcamento nao pode ser reprovado");
    }
    
    public void finalizar( Orcamento orcamento ){
        throw new RuntimeException("O orcamento nao pode ser finalizado");
    }
}
