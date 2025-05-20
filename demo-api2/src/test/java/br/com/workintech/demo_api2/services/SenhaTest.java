package br.com.workintech.demo_api2.services;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class SenhaTest {
    @Test
    public void validarASenha(){
        Senha senha=new Senha();
        String password="Teste12";

        assertThat(password).hasSizeGreaterThanOrEqualTo(6)
                .hasSizeLessThanOrEqualTo(12)
                .matches(".*[A-Z].*")
                .matches(".*\\d.*");
    }
}
