package io.winty.orcamento.situacao;

import io.winty.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
