import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraJUnitTest {
    Calculadora c = new Calculadora();

    @SuppressWarnings("deprecation")
    @Test
    public void somarPositivosMaioresQueZero() {
        // Soma de 4 e 6. Resultado esperado: 10
        Assertions.assertEquals(10, c.soma(4, 6));
    }
    @Test
    public void somarNegativoNegativo() {
        // Soma de -3 e -12. Resultado esperado: -15
        Assertions.assertEquals(-15, c.soma(-3, -12));
    }
    @Test
    public void somarNegativoPositivo() {
        // Soma de -4 e 3. Resultado esperado: -1
        Assertions.assertEquals(-1, c.soma(-4, 3));
    }
    @Test
    public void somarPositivoNegativo() {
        // Soma de 6 e -10. Resultado esperado: -4
        Assertions.assertEquals(-4, c.soma(6, -10));
    }
    @Test
    public void somarZeroPositivo() {
        // Soma de 0 e 37. Resultado esperado: 37
        Assertions.assertEquals(37, c.soma(0, 37));
    }
    @Test
    public void somarPositivoEZero() {
        // Soma de 20 e 0. Resultado esperado: 20
        Assertions.assertEquals(20, c.soma(20, 0));
    }
    @Test
    public void somarZeroZero() {
        // Soma de 0 e 0. Resultado esperado: 0
        Assertions.assertEquals(0, c.soma(0, 0));
    }
    ////////////////////////////////////////////////////////////////
    @Test
    public void subtrairPositivoPositivo() {
        // Subtração de 4 e 6. Resultado esperado: -2
        Assertions.assertEquals(-2, c.subtracao(4, 6));
    }
    @Test
    public void subtrairZeroPositivo() {
        // Subtração de 0 e 16. Resultado esperado: -16
        Assertions.assertEquals(-16, c.subtracao(0, 16));
    }
    @Test
    public void subtrairPositivoZero() {
        // Subtração de 2 e 0. Resultado esperado: 2
        Assertions.assertEquals(2, c.subtracao(2, 0));
    }
    @Test
    public void subtrairZeroZero() {
        // Subtração de 0 e 0. Resultado esperado: 0
        Assertions.assertEquals(0, c.subtracao(0, 0));
    }
    @Test
    public void subtrairNegativoPositivo() {
        // Subtração de -4 e 3. Resultado esperado: -7
        Assertions.assertEquals(-7, c.subtracao(-4, 3));
    }
    @Test
    public void subtrairPositivoNegativo() {
        // Subtração de 13 e -6. Resultado esperado: 19
        Assertions.assertEquals(19, c.subtracao(13, -6));
    }
    @Test
    public void subtrairNegativoNegativo() {
        // Subtração de -3 e -12. Resultado esperado: 9
        Assertions.assertEquals(9, c.subtracao(-3, -12));
    }
    ////////////////////////////////////////////////////////////////
    @Test
    public void multiplicarPositivosMaioresQueZero() {
        // Multiplicação de 4 e 13. Resultado esperado: 52
        Assertions.assertEquals(52, c.multiplicacao(4, 13));
    }
    @Test
    public void multiplicarZeroPositivo() {
        // Multiplicação de 0 e 6. Resultado esperado: 0
        Assertions.assertEquals(0, c.multiplicacao(0, 6));
    }
    @Test
    public void multiplicarPositivoZero() {
        // Multiplicação de 2 e 0. Resultado esperado: 0
        Assertions.assertEquals(0, c.multiplicacao(2, 0));
    }
    @Test
    public void multiplicarZeroZero() {
        // Multiplicação de 0 e 0. Resultado esperado: 0
        Assertions.assertEquals(0, c.multiplicacao(0, 0));
    }
    @Test
    public void multiplicarNegativoPositivo() {
        // Multiplicação de -4 e 3. Resultado esperado: -12
        Assertions.assertEquals(-12, c.multiplicacao(-4, 3));
    }
    @Test
    public void multiplicarPositivoNegativo() {
        // Multiplicação de 8 e -9. Resultado esperado: -72
        Assertions.assertEquals(-72, c.multiplicacao(8, -9));
    }
    @Test
    public void multiplicarNegativoNegativo() {
        // Multiplicação de -3 e -12. Resultado esperado: 36
        Assertions.assertEquals(36, c.multiplicacao(-3, -12));
    }
    ////////////////////////////////////////////////////////////////
    @Test
    public void subtrairPositivosMaioresQueZero() {
        // Divisão de 100 e 5. Resultado esperado: 20
        Assertions.assertEquals(20, c.divisao(100, 5));
    }
    @Test
    public void dividirZeroPositivo() {
        // Divisão de 0 e 6. Resultado esperado: 0
        Assertions.assertEquals(0, c.divisao(0, 6));
    }
    @Test
    public void dividirPositivoZero() {
        // Divisão de 2 e 0. Resultado esperado: [tratamento de exceção - divisão por zero]
        Assertions.assertEquals(0, c.divisao(2, 0));
    }
    @Test
    public void dividirZeroZero() {
        // Divisão de 0 e 0. Resultado esperado: [tratamento de exceção - divisão por zero]
        Assertions.assertEquals(0, c.divisao(0, 0));
    }
    @Test
    public void dividirNegativoPositivo() {
        // Divisão de -25 e 5. Resultado esperado: -5
        Assertions.assertEquals(-5, c.divisao(-25, 5));
    }
    @Test
    public void dividirPositivoNegativo() {
        // Divisão de -10 e 6. Resultado esperado: -1
        Assertions.assertEquals(-1, c.divisao(-10, 6));
    }
    @Test
    public void dividirNegativoNegativo() {
        // Divisão de -30 e -10. Resultado esperado: 3
        Assertions.assertEquals(3, c.divisao(-30, -10));
    }
}
