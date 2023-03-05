
// 1 - pacote ; conjunto de classes

package br.com.iterasys;

// 2 - Bibliotecas

// 3- Classes
public class Calculadora {
    // 3.1 - Atributos - Características
    // 3.2 - Funções e Métodos

    public static double somarDoisNumeros(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrairDoisNumeros(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicarDoisNumeros(double num1, double num2) {
        return num1 * num2;
    }

    public static String dividirDoisNumerosInteiros(int numA, int numB){

        try{
            return String.valueOf(numA/numB);
        }
        catch(Exception e) {
            return "Não é possível dividir por Zero";
        }


    }



    public static double dividirDoisNumeros(double num1, double num2) {

        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Não é possível dividir por zero");
        }
        return 0;
    }


 }



