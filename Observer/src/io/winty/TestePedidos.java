package io.winty;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import io.winty.orcamento.Orcamento;
import io.winty.pedido.GeraPedido;
import io.winty.pedido.GeraPedidoHandler;
import io.winty.pedido.Pedido;
import io.winty.pedido.acao.EnviarEmailPedido;
import io.winty.pedido.acao.SalvarPedidoBancoDeDados;

public class TestePedidos {
    public static void main(String[] args) {
        String cliente = "";
        BigDecimal valorOrcamento = new BigDecimal("600");
        int quantidadeItens = 4;
        
        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler( Arrays.asList(new EnviarEmailPedido() ,new SalvarPedidoBancoDeDados()));   
        handler.execute(gerador);
    }
}
