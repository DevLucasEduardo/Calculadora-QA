/**
 * A classe Calculadora realiza operações matemáticas.
 *
 * @author Lucas Eduardo Pereira
 * @version 1.0
 * @since 2023-11-07
 */
public class Calculadora {

    /**
     * Método para fazer a soma de dois números inteiros.
     *
     * @param a O primeiro número inteiro a ser somado.
     * @param b O segundo número inteiro a ser somado.
     * @return O resultado da soma dos números passados como argumento.
     */
    public int soma(int a, int b) {
        return a + b;
    }

    /**
     * Método para fazer a subtração de dois números inteiros.
     *
     * @param a O número inteiro do qual deseja subtrair.
     * @param b O número inteiro que será subtraído.
     * @return O resultado da subtração dos números passados como argumento.
     */
    public int subtracao(int a, int b) {
        return a - b;
    }

    /**
     * Método para fazer a multiplicação de dois números inteiros.
     *
     * @param a O primeiro número inteiro a ser multiplicado.
     * @param b O segundo número inteiro a ser multiplicado.
     * @return O resultado da multiplicação dos números passados como argumento.
     */
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    /**
     * Método para fazer a divisão de dois números inteiros.
     *
     * @param a O número inteiro a ser dividido.
     * @param b O número inteiro pelo qual dividir.
     * @return O resultado da divisão dos números passados como argumento.
     */
    public int divisao(int a, int b) {
        return a / b;
    }
}
