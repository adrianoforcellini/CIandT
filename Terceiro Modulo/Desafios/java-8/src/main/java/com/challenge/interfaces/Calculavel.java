package com.challenge.interfaces;

import java.math.BigDecimal;

public interface Calculavel {
    public BigDecimal somar(Object classe) throws IllegalAccessException;
    public BigDecimal subtrair(Object Classe);
    public BigDecimal totalizar(Object Classe);
}
