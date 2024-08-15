package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    // Metodo que retorna la suma de dos valores
    public int add(int a, int b) {
        return a + b;
    }

    // Metodo que retorna el area de un rectangulo
    public int calculateArea(int a, int b) {
        return a * b;
    }

    // Metodo que retorna un booleano si es que el string es nulo o vacio
    public boolean isValidString(String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
