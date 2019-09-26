
package modelo;

public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora() {
    }

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int sumar(){
        return this.num1+this.num2;
    }
    public int restar(){
        return this.num1-this.num2;
    }
    public int multiplicar(){
        return this.num1*this.num2;
    }
    public int dividir(){
        return this.num1/this.num2;
    }

    
}
