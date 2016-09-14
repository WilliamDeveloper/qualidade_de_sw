package br.com.calculadora;


public class Calculadora {


    int doSomar(int pNumero1, int pNumero2) {
        return pNumero1 + pNumero2;
    }
    
    int doSubtrair(int pNumero1, int pNumero2) {
        return pNumero1 - pNumero2;
    }
    
    int doMultiplicar(int pNumero1, int pNumero2) {
        return pNumero1 * pNumero2;
    }
    
    int doDividir(int pNumero1, int pNumero2) {
        return pNumero1 / pNumero2;
    }
    
    int doRaiz(double pNumero, double pExpoente) {
        return (int) Math.pow(pNumero, (1/pExpoente));
    }
    
    int doPotencia(double pBase, double pElevado) {
        return (int)Math.pow(pBase, pElevado);
    }
}
