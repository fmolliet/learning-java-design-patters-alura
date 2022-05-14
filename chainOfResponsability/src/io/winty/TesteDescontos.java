package io.winty;

import java.math.BigDecimal;

import io.winty.desconto.Orcamento;
import io.winty.desconto.CalculadoraDeDescontos;

public class TesteDescontos {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadoraDeDesconto = new CalculadoraDeDescontos();

        System.out.println(calculadoraDeDesconto.calcular(orcamento));
    }
}
