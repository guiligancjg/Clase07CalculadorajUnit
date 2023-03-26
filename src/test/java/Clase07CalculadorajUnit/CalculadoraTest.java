package Clase07CalculadorajUnit;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void pruebaUno() {
        //1. El resultado de multiplicar 80 por 3 da 240.
        Calculadora calc = new Calculadora();
        assertEquals(240, calc.multiplicar(80,3), 0.001);
    }

    @Test
    public void pruebaDos() {
        //2. El resultado de sumar 150 y 180, dividido por 3, da 110.
        Calculadora calc = new Calculadora();
        assertEquals(110, calc.dividir(calc.sumar(150, 180), 3), 0.001);
    }

    @Test
    public void pruebaTres() {
        //3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
        Calculadora calc = new Calculadora();
        assertEquals(605, calc.multiplicar(calc.restar(90,50), 15), 0.001);
    }

    @Test
    public void pruebaCuatro() {
        //4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.
        Calculadora calc = new Calculadora();
        assertEquals(2700, calc.multiplicar(calc.sumar(70,40),25), 0.001);
    }

}
