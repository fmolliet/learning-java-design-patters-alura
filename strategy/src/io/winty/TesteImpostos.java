package io.winty;

import java.math.BigDecimal;

import io.winty.imposto.CalculadoraDeImpostos;
import io.winty.imposto.ISS;
import io.winty.orcamento.Orcamento;

public class TesteImpostos {
    public static void main(String[] args) throws Exception {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"));
        
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));
    }
}
