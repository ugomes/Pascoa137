import br.com.iterasys.Calculadora;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Bibliotecas
public class TesteCalculadora {
    // Atributos

    // Funções e Métodos

    @Test
    public void testeSomarDoisNumeros() {
        // Configura
        // Valores de Entrada
        double num1 = 7;
        double num2 = 5;

        //Valores de saída

        double resultadoEsperado = 12;


        // Executa
        double resultadoAtual = Calculadora.somarDoisNumeros(num1, num2);

        // Valida

        assertEquals(resultadoEsperado, resultadoAtual);

    }

    // Este é um teste de unidade data driven , direcionado por dados
    @ParameterizedTest
    @CsvSource(value = {
            "7,5,12.0",
            "56,44,100.0",
            "10,0,10.0",
            "15,-5,10.0",
            "-8,-6,-14.0"

    }, delimiter = ',')
    public void testeSomarDoisNumerosLendoLista(String num1, String num2, String resultadoEsperado) {
        // Configura
        // Os dados de entrada e os resultados esperado vem da lista
        //Valores de saída


        // Executa
        double resultadoAtual = Calculadora.somarDoisNumeros(Integer.valueOf(num1), Integer.valueOf(num2));

        // Valida

        assertEquals(Double.valueOf(resultadoEsperado), Double.valueOf(resultadoAtual));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/massaSomar.csv", numLinesToSkip = 1)

    public void testeSomarDoisNumerosLendoArquivo(double num1, double num2, double resultadoEsperado) {

        double resultadoAtual = Calculadora.somarDoisNumeros(num1, num2);


        assertEquals(resultadoEsperado, resultadoAtual);

    }

    @Test
    public void testeSubtrairDoisNumeros() {
        double num1 = 10;
        double num2 = 5;

        double resultadoEsperado = 5;

        double resultadoAtual = Calculadora.subtrairDoisNumeros(num1, num2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "10,5,5.0",
            "25,5,20.0",
            "-10,-10,00.0",
            "15,-6,21.0",
            "-8,-6,-2.0"

    }, delimiter = ',')

    public void testeSubtarirDoisNumerosLendoLista(String num1, String num2, String resultadoEsperado) {
        // Configura
        // Os dados de entrada e os resultados esperado vem da lista
        //Valores de saída


        // Executa
        double resultadoAtual = Calculadora.subtrairDoisNumeros(Integer.valueOf(num1), Integer.valueOf(num2));

        // Valida

        assertEquals(Double.valueOf(resultadoEsperado), Double.valueOf(resultadoAtual));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/massaSubtrair.csv", numLinesToSkip = 1)

    public void testeSubtrairDoisNumerosLendoArquivo(double num1, double num2, double resultadoEsperado) {

        double resultadoAtual = Calculadora.subtrairDoisNumeros(num1, num2);


        assertEquals(resultadoEsperado, resultadoAtual);

    }

    @Test
    public void testeMultiplicarDoisNumeros() {
        double num1 = 3;
        double num2 = 5;

        double resultadoEsperado = 15;

        double resultadoAtual = Calculadora.multiplicarDoisNumeros(num1, num2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "5,5,25.0",
            "10,5,50.0",
            "-10,-10,100.0",
            "3,9,27.0",
            "-8,-6,48"

    }, delimiter = ',')

    public void testeMultiplicarDoisNumerosLendoLista(String num1, String num2, String resultadoEsperado) {
        // Configura
        // Os dados de entrada e os resultados esperado vem da lista
        //Valores de saída


        // Executa
        double resultadoAtual = Calculadora.multiplicarDoisNumeros(Integer.valueOf(num1), Integer.valueOf(num2));

        // Valida

        assertEquals(Double.valueOf(resultadoEsperado), Double.valueOf(resultadoAtual));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/massaMultiplicar.csv", numLinesToSkip = 1)

    public void testeMultiplicarDoisNumerosLendoArquivo(double num1, double num2, double resultadoEsperado) {

        double resultadoAtual = Calculadora.multiplicarDoisNumeros(num1, num2);


        assertEquals(resultadoEsperado, resultadoAtual);

    }

    @ParameterizedTest
    @CsvSource(value = {
            "15,3,5.0",
            "10,5,2.0",
            "10,2,5,4.0",
            "10,3,3.3333333333333335",
            "-10,10,-1.0"

    }, delimiter = ',')

    public void testeDividirDoisNumerosLendoLista(String num1, String num2, String resultadoEsperado) {
        // Configura
        // Os dados de entrada e os resultados esperado vem da lista
        //Valores de saída


        // Executa
        double resultadoAtual = Calculadora.dividirDoisNumeros(Integer.valueOf(num1),Integer.valueOf(num2));


        // Valida

        assertEquals(Double.valueOf(resultadoEsperado),Double.valueOf(resultadoAtual));

    }


    @ParameterizedTest
    @CsvFileSource(resources = "csv/massaDividir.csv", numLinesToSkip = 1)

    public void testeDividirDoisNumerosLendoArquivo(double num1, double num2, double resultadoEsperado) {

        double resultadoAtual = Calculadora.dividirDoisNumeros(num1, num2);


        assertEquals(resultadoEsperado, resultadoAtual);

    }

    @Test
    public void testeDividirDoisNumeros(){
        double num1 = 10;
        double num2 = 0;

        double resultadoEsperado = 0;

        double resultadoAtual = Calculadora.dividirDoisNumeros(num1,num2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testeDividirPorZero(){
        double num1 = 10;
        double num2 = 0;

        double resultadoEsperado = 0;

        double resultadoAtual = Calculadora.dividirDoisNumeros(num1,num2);

        assertEquals(resultadoEsperado, resultadoAtual);

    }

    @Test

    public void testeDividirDoisNumerosInteiros(){

        int numA = 10;
        int numB =  0;
        String resultadoEsperado = "Não é possível dividir por Zero";
        String resultadoAtual = Calculadora.dividirDoisNumerosInteiros(numA,numB);

        assertEquals(resultadoEsperado,(resultadoAtual));
        System.out.println(numA + " / " + numB + " = " + resultadoAtual);
        System.out.println(resultadoAtual);

    }

}



