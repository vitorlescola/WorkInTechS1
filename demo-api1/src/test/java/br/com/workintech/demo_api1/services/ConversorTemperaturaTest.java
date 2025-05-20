package br.com.workintech.demo_api1.services;
import br.com.workintech.demo_api1.controller.ConversorTemperatura;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ConversorTemperaturaTest {
    @Test
    public void shouldConvertToC(){
        ConversorTemperatura ct=new ConversorTemperatura();
        int resultado=ct.converterParaC(75);
        assertThat(resultado).isNotNegative().isEqualTo(23);
    }
    @Test
    public void shouldConvertToF(){
        ConversorTemperatura ct=new ConversorTemperatura();
        int resultado=ct.converterParaF(20);
        assertThat(resultado).isNotNegative().isEqualTo(68);
    }
}
