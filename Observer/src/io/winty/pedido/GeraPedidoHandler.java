package io.winty.pedido;

import java.time.LocalDateTime;
import java.util.List;

import io.winty.orcamento.Orcamento;
import io.winty.pedido.acao.Acao;
import io.winty.pedido.acao.EnviarEmailPedido;
import io.winty.pedido.acao.SalvarPedidoBancoDeDados;

public class GeraPedidoHandler {
    
    private List<Acao> acoes;
    
    public GeraPedidoHandler( List<Acao> acoes){
        this.acoes = acoes;
    }
    
    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        
        acoes.forEach(a -> a.executar(pedido));
    }
}
