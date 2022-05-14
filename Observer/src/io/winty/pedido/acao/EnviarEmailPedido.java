package io.winty.pedido.acao;

import io.winty.pedido.Pedido;

public class EnviarEmailPedido implements Acao{
    
    public void  executar(Pedido pedido){
        System.out.println("Enviar email com dados "  + pedido.getCliente() );
    }
}