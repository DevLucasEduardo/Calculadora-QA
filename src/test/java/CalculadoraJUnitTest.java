import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Classe de teste JUnit para a classe Calculadora.
 *
 * @author Lucas Eduardo Pereira
 * @version 1.0
 * @since 2023-11-07
 */
public class CalculadoraJUnitTest {
    Calculadora c = new Calculadora();

    /**
     * Testa a soma de números positivos maiores que zero.
     */
    @Test
    public void somarPositivosMaioresQueZero() {
        // Soma de 4 e 6. Resultado esperado: 10
        Assertions.assertEquals(10, c.soma(4, 6));
    }

    /**
     * Testa a soma de números negativos.
     */
    @Test
    public void somarNegativoNegativo() {
        // Soma de -3 e -12. Resultado esperado: -15
        Assertions.assertEquals(-15, c.soma(-3, -12));
    }

    /**
     * Testa a soma de número negativo e número positivo.
     */
    @Test
    public void somarNegativoPositivo() {
        // Soma de -4 e 3. Resultado esperado: -1
        Assertions.assertEquals(-1, c.soma(-4, 3));
    }

    /**
     * Testa a soma de número positivo e número negativo.
     */
    @Test
    public void somarPositivoNegativo() {
        // Soma de 6 e -10. Resultado esperado: -4
        Assertions.assertEquals(-4, c.soma(6, -10));
    }

    /**
     * Testa a soma de zero e número positivo.
     */
    @Test
    public void somarZeroPositivo() {
        // Soma de 0 e 37. Resultado esperado: 37
        Assertions.assertEquals(37, c.soma(0, 37));
    }

    /**
     * Testa a soma de número positivo e zero.
     */
    @Test
    public void somarPositivoEZero() {
        // Soma de 20 e 0. Resultado esperado: 20
        Assertions.assertEquals(20, c.soma(20, 0));
    }

    /**
     * Testa a soma de zero e zero.
     */
    @Test
    public void somarZeroZero() {
        // Soma de 0 e 0. Resultado esperado: 0
        Assertions.assertEquals(0, c.soma(0, 0));
    }

    // Os comentários e testes para subtrair, multiplicar e dividir seguem a mesma lógica.
}


