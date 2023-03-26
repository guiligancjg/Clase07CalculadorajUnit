package Clase07CalculadorajUnit;

public class Main {

    public static void main(String[] args) {
	   Calculadora calculadora = new Calculadora();

        System.out.println("------------------------------------------------");
        System.out.println("1. El resultado de multiplicar 80 por 3 da 240");
        System.out.println("Su resultado es: " + calculadora.multiplicar(80,3));

        System.out.println("------------------------------------------------");
        System.out.println("2. El resultado de sumar 150 y 180, dividido por 3, da 110");
        System.out.println("Su resultado es: " + calculadora.dividir(calculadora.sumar(150,180),3));

        System.out.println("------------------------------------------------");
        System.out.println("3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.");
        System.out.println("Su resultado es: " + calculadora.multiplicar(calculadora.restar(90,50),15));

        System.out.println("------------------------------------------------");
        System.out.println("4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.");
        System.out.println("Su resultado es: " + calculadora.multiplicar(calculadora.sumar(70,40),25));

    }
}
