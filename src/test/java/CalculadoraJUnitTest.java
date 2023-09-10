import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraJUnitTest {

    //@SuppressWarnings("deprecation")
    @Test
    public void somarDoisValores() {
        Calculadora c = new Calculadora();

        // Soma de 4 e 6. Resultado esperado: 10
        Assertions.assertEquals(10, c.soma(4, 6));

        // Soma de 0 e 37. Resultado esperado: 37
        Assertions.assertEquals(37, c.soma(0, 37));

        // Soma de 2 e 0. Resultado esperado: 2
        Assertions.assertEquals(2, c.soma(2, 0));

        // Soma de 0 e 0. Resultado esperado: 0
        Assertions.assertEquals(0, c.soma(0, 0));

        // Soma de -4 e 3. Resultado esperado: -1
        Assertions.assertEquals(-1, c.soma(-4, 3));

        // Soma de 6 e -10. Resultado esperado: -4
        Assertions.assertEquals(-4, c.soma(6, -10));

        // Soma de -3 e -12. Resultado esperado: -15
        Assertions.assertEquals(-15, c.soma(-3, -12));
    }
    @Test
    public void subtrairDoisValores() {
        Calculadora c = new Calculadora();

        // Subtração de 4 e 6. Resultado esperado: -2
        Assertions.assertEquals(-2, c.subtracao(4, 6));

        // Subtração de 0 e 6. Resultado esperado: -6
        Assertions.assertEquals(-6, c.subtracao(0, 6));

        // Subtração de 2 e 0. Resultado esperado: 2
        Assertions.assertEquals(2, c.subtracao(2, 0));

        // Subtração de 0 e 0. Resultado esperado: 0
        Assertions.assertEquals(0, c.subtracao(0, 0));

        // Subtração de -4 e 3. Resultado esperado: -7
        Assertions.assertEquals(-7, c.subtracao(-4, 3));

        // Subtração de 13 e -6. Resultado esperado: 19
        Assertions.assertEquals(19, c.subtracao(13, -6));

        // Subtração de -3 e -12. Resultado esperado: 9
        Assertions.assertEquals(9, c.subtracao(-3, -12));
    }
    @Test
    public void multiplicarDoisValores() {
        Calculadora c = new Calculadora();

        // Multiplicação de 4 e 13. Resultado esperado: 52
        Assertions.assertEquals(52, c.multiplicacao(4, 13));

        // Multiplicação de 0 e 6. Resultado esperado: 0
        Assertions.assertEquals(0, c.multiplicacao(0, 6));

        // Multiplicação de 2 e 0. Resultado esperado: 0
        Assertions.assertEquals(0, c.multiplicacao(2, 0));

        // Multiplicação de 0 e 0. Resultado esperado: 0
        Assertions.assertEquals(0, c.multiplicacao(0, 0));

        // Multiplicação de -4 e 3. Resultado esperado: -12
        Assertions.assertEquals(-12, c.multiplicacao(-4, 3));

        // Multiplicação de 8 e -9. Resultado esperado: -72
        Assertions.assertEquals(-72, c.multiplicacao(8, -9));

        // Multiplicação de -3 e -12. Resultado esperado: 36
        Assertions.assertEquals(36, c.multiplicacao(-3, -12));
    }

    @Test
    public void dividirDoisValores() {
        Calculadora c = new Calculadora();

        // Divisão de 100 e 5. Resultado esperado: 20
        Assertions.assertEquals(20, c.divisao(100, 5));

        // Divisão de 0 e 6. Resultado esperado: 0
        Assertions.assertEquals(0, c.divisao(0, 6));

        // Divisão de 2 e 0. Resultado esperado: [tratamento de exceção - divisão por zero]
        Assertions.assertEquals(3, c.divisao(2, 0));

        // Divisão de 0 e 0. Resultado esperado: [tratamento de exceção - divisão por zero]
        Assertions.assertEquals(3, c.divisao(0, 0));

        // Divisão de -25 e 5. Resultado esperado: -2
        Assertions.assertEquals(-2, c.divisao(-4, 2));

        // Divisão de -10 e 6. Resultado esperado: -1
        Assertions.assertEquals(-1, c.divisao(-10, 6));

        // Divisão de -30 e -10. Resultado esperado: 3
        Assertions.assertEquals(3, c.divisao(-30, 10));
    }

}
