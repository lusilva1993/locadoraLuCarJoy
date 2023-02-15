package br.com.lucar.utils;

import br.com.lucar.interfaces.Calculadora;

import java.math.BigDecimal;

public class CalculoPortePequeno implements Calculadora {


    @Override
    public BigDecimal calcularTotal(long diarias) {
        BigDecimal diaria = new BigDecimal(100.0);
        BigDecimal total = diaria.multiply(BigDecimal.valueOf(diarias));
        return total;
    }
}