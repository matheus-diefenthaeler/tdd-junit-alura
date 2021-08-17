package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @Test
    public void bonusDeveriaSerZeroParaFuncionarioComSalarioAlto() {
        Funcionario funcionario = new Funcionario("Fulano", LocalDate.now(), new BigDecimal("11000"));
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(funcionario);

        assertEquals(new BigDecimal("0.00"), bonus);
    }

    @Test
    public void bonusDeveriaSer10PorCentoDoSalario() {
        Funcionario funcionario = new Funcionario("Fulano", LocalDate.now(), new BigDecimal("1000"));
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(funcionario);

        assertEquals(new BigDecimal("100.00"), bonus);
    }

    @Test
    public void bonusDeveriaSer10PorCentoParaSalarioDeDezMil() {
        Funcionario funcionario = new Funcionario("Fulano", LocalDate.now(), new BigDecimal("10000"));
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(funcionario);

        assertEquals(new BigDecimal("1000.00"), bonus);
    }

}