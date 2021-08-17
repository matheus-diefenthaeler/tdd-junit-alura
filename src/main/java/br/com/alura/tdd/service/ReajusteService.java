package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {

        BigDecimal reajuste;

        switch (desempenho) {
            case A_DESEJAR:
                reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
                funcionario.reajustarSalario(reajuste);
                break;
            case BOM:
                reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
                funcionario.reajustarSalario(reajuste);
                break;
            case OTIMO:
                reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));
                funcionario.reajustarSalario(reajuste);
                break;
        }

    }
}
