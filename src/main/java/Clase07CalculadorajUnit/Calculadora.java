package Clase07CalculadorajUnit;

public class Calculadora {
    private double unNumero;
    private double otroNumero;


    public Calculadora() {
        this.unNumero = 0;
        this.otroNumero = 0;
    }

    public double sumar(double unNumero, double otroNumero){
        return unNumero + otroNumero;
    }

    public double restar(double unNumero, double otroNumero){
        return unNumero - otroNumero;
    }

    public double multiplicar(double unNumero, double otroNumero){
        return unNumero * otroNumero;
    }

    public double dividir(double unNumero, double otroNumero){
        try{
            return unNumero / otroNumero;
        } catch (ArithmeticException e){
            System.out.println("No existe la division en cero..." + e.getMessage());
            return 0;
        }
    }
}
