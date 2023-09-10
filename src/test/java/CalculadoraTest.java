public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        /* Os maiores e menores números inteiros suportados são 2147483647 e -2147483648, respectivamente.
        Caso o número digitado ultrapasse os limites, o código não compila corretamente. Entretanto, caso
        a soma dos valores sejam estejam no limite correto, mas o resultado ultrapasse, o resultado é
        retornado erroneamente. Portanto, é necessário se atentar a este tipo de tratamento de erro.

        Para as divisões, existe a possibilidade de os resultados serem do tipo double, no entanto, por conta
        do retorno ser necessariamente do tipo inteiro, o resultado é arredondado.
         */

        ////////////////////////////////////////////////////////////////////////

        // Soma de 4 e 6. Resultado esperado: 10
        System.out.println("Soma de 4 e 6: " + c.soma(4, 6));

        // Soma de 0 e 37. Resultado esperado: 37
        System.out.println("Soma de 0 e 37: " + c.soma(0, 37));

        // Soma de 2 e 0. Resultado esperado: 2
        System.out.println("Soma de 2 e 0: " + c.soma(2, 0));

        // Soma de 0 e 0. Resultado esperado: 0
        System.out.println("Soma de 0 e 0: " + c.soma(0, 0));

        // Soma de -4 e 3. Resultado esperado: -1
        System.out.println("Soma de -4 e 3: " + c.soma(-4, 3));

        // Soma de 6 e -10. Resultado esperado: -4
        System.out.println("Soma de 6 e -10: " + c.soma(6, -10));

        // Soma de -3 e -12. Resultado esperado: -15
        System.out.println("Soma de -3 e -12: " + c.soma(-3, -12));

        ////////////////////////////////////////////////////////////////////////

        // Subtração de 4 e 6. Resultado esperado: -2
        System.out.println("Subtração de 4 e 6: " + c.subtracao(4, 6));

        // Subtração de 0 e 6. Resultado esperado: -6
        System.out.println("Subtração de 0 e 6: " + c.subtracao(0, 6));

        // Subtração de 2 e 0. Resultado esperado: 2
        System.out.println("Subtração de 2 e 0: " + c.subtracao(2, 0));

        // Subtração de 0 e 0. Resultado esperado: 0
        System.out.println("Subtração de 0 e 0: " + c.subtracao(0, 0));

        // Subtração de -4 e 3. Resultado esperado: -7
        System.out.println("Subtração de -4 e 3: " + c.subtracao(-4, 3));

        // Subtração de 13 e -6. Resultado esperado: 19
        System.out.println("Subtração de 13 e -6: " + c.subtracao(13, -6));

        // Subtração de -3 e -12. Resultado esperado: 9
        System.out.println("Subtração de -3 e -12: " + c.subtracao(-3, -12));

        ////////////////////////////////////////////////////////////////////////

        // Multiplicação de 4 e 13. Resultado esperado: 52
        System.out.println("Multiplicação de 4 e 13: " + c.multiplicacao(4, 13));

        // Multiplicação de 0 e 6. Resultado esperado: 0
        System.out.println("Multiplicação de 0 e 6: " + c.multiplicacao(0, 6));

        // Multiplicação de 2 e 0. Resultado esperado: 0
        System.out.println("Multiplicação de 2 e 0: " + c.multiplicacao(2, 0));

        // Multiplicação de 0 e 0. Resultado esperado: 0
        System.out.println("Multiplicação de 0 e 0: " + c.multiplicacao(0, 0));

        // Multiplicação de -4 e 3. Resultado esperado: -12
        System.out.println("Multiplicação de -4 e 3: " + c.multiplicacao(-4, 3));

        // Multiplicação de 8 e -9. Resultado esperado: -72
        System.out.println("Multiplicação de 8 e -9: " + c.multiplicacao(8, -9));

        // Multiplicação de -3 e -12. Resultado esperado: 36
        System.out.println("Multiplicação de -3 e -12: " + c.multiplicacao(-3, -12));

        ////////////////////////////////////////////////////////////////////////

        // Divisão de 100 e 5. Resultado esperado: 20
        System.out.println("Divisão de 100 e 5: " + c.divisao(4, 6));

        // Divisão de 0 e 6. Resultado esperado: 0
        System.out.println("Divisão de 0 e 6: " + c.divisao(0, 6));

        // Divisão de 2 e 0. Resultado esperado: [tratamento de exceção - divisão por zero]
        // System.out.println("Divisão de 2 e 0: " + c.divisao(2, 0));

        // Divisão de 0 e 0. Resultado esperado: [tratamento de exceção - divisão por zero]
        // System.out.println("Divisão de 0 e 0: " + c.divisao(0, 0));

        // Divisão de -25 e 5. Resultado esperado: -5
        System.out.println("Divisão de -25 e 5: " + c.divisao(-4, 3));

        // Divisão de -10 e 6. Resultado esperado: -1
        System.out.println("Divisão de -10 e 6: " + c.divisao(-10, 6));

        // Divisão de -30 e -10. Resultado esperado: 3
        System.out.println("Divisão de -30 e -10: " + c.divisao(-30, -10));

        ////////////////////////////////////////////////////////////////////////
    }

}
