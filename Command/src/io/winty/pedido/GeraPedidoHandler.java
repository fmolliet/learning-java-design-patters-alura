package io.winty.pedido;

import java.time.LocalDateTime;

import io.winty.orcamento.Orcamento;

public class GeraPedidoHandler {
    
    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        
        System.out.println("salva no banco");
        System.out.println("Enviar email com dados");
    }
}
