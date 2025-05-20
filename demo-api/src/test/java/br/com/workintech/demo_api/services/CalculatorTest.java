package br.com.workintech.demo_api.services;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void shouldAddTwoNumbers(){
        Calculator calc=new Calculator();
        int resultado=calc.add(2, 2);

        assertThat(resultado)
                .isNotNegative()
                .isEqualTo(4);
    }
}
