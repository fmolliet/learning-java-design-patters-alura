package io.winty.pedido.acao;

import io.winty.pedido.Pedido;

public interface Acao {
    public void executar(Pedido pedido);
}
