package io.winty.pedido.acao;

import io.winty.pedido.Pedido;

public class SalvarPedidoBancoDeDados implements Acao{
    public void executar(Pedido pedido){
        System.out.println("salva no banco");
    }
}
