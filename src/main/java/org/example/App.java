package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Bend b = new Bend("Rock stars", 100);
        double result = b.izracunajZaradu(2);
        System.out.println(result);
    }
}
