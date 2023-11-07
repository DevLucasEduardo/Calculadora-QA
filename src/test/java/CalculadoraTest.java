/**
 * Classe de teste para a classe Calculadora.
 *
 * Esta classe realiza testes das operações matemáticas de soma, subtração, multiplicação e divisão
 * da classe Calculadora.
 *
 * Os maiores e menores números inteiros suportados são 2147483647 e -2147483648, respectivamente.
 * Caso o número digitado ultrapasse os limites, o código não compila corretamente. Entretanto, caso
 * a soma dos valores esteja no limite correto, mas o resultado ultrapasse, o resultado é
 * retornado erroneamente. Portanto, é necessário se atentar a este tipo de tratamento de erro.
 *
 * Para as divisões, existe a possibilidade de os resultados serem do tipo double, no entanto, por conta
 * do retorno ser necessariamente do tipo inteiro, o resultado é arredondado.
 *
 * @author Lucas Eduardo Pereira
 * @version 1.0
 * @since 2023-11-07
 */
public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        ////////////////////////////////////////////////////////////////////////
        // Testes de Soma

        // Soma de 4 e 6. Resultado esperado: 10
        System.out.println("Soma de 4 e 6: " + c.soma(4, 6) + ". Resultado esperado: 10.");

        // Soma de 0 e 37. Resultado esperado: 37
        System.out.println("Soma de 0 e 37: " + c.soma(0, 37) + ". Resultado esperado: 37.");

        // Soma de 2 e 0. Resultado esperado: 2
        System.out.println("Soma de 2 e 0: " + c.soma(2, 0) + ". Resultado esperado: 2.");

        // Soma de 0 e 0. Resultado esperado: 0
        System.out.println("Soma de 0 e 0: " + c.soma(0, 0) + ". Resultado esperado: 0.");

        // Soma de -4 e 3. Resultado esperado: -1
        System.out.println("Soma de -4 e 3: " + c.soma(-4, 3) + ". Resultado esperado: -1.");

        // Soma de 6 e -10. Resultado esperado: -4
        System.out.println("Soma de 6 e -10: " + c.soma(6, -10) + ". Resultado esperado: -4.");

        // Soma de -3 e -12. Resultado esperado: -15
        System.out.println("Soma de -3 e -12: " + c.soma(-3, -12) + ". Resultado esperado: -15.");

        ////////////////////////////////////////////////////////////////////////
        // Testes de Subtração

        // Subtração de 4 e 6. Resultado esperado: -2
        System.out.println("Subtração de 4 e 6: " + c.subtracao(4, 6) + ". Resultado esperado: -2.");

        // Subtração de 0 e 6. Resultado esperado: -6
        System.out.println("Subtração de 0 e 6: " + c.subtracao(0, 6) + ". Resultado esperado: -6.");

        // Subtração de 2 e 0. Resultado esperado: 2
        System.out.println("Subtração de 2 e 0: " + c.subtracao(2, 0) + ". Resultado esperado: 2.");

        // Subtração de 0 e 0. Resultado esperado: 0
        System.out.println("Subtração de 0 e 0: " + c.subtracao(0, 0) + ". Resultado esperado: 0.");

        // Subtração de -4 e 3. Resultado esperado: -7
        System.out.println("Subtração de -4 e 3: " + c.subtracao(-4, 3) + ". Resultado esperado: -7.");

        // Subtração de 13 e -6. Resultado esperado: 19
        System.out.println("Subtração de 13 e -6: " + c.subtracao(13, -6) + ". Resultado esperado: 19.");

        // Subtração de -3 e -12. Resultado esperado: 9
        System.out.println("Subtração de -3 e -12: " + c.subtracao(-3, -12) + ". Resultado esperado: 9.");

        ////////////////////////////////////////////////////////////////////////
        // Os comentários e testes para multiplicação e divisão seguem a mesma lógica.
    }

}

