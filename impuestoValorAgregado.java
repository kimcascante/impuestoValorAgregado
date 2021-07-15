package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: Definir si una persona debe pagar impuesto al valor agregado por su consumo mensual
de electricidad. El programa recibe el consumo mensual de la persona.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej5w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 

        double consumoRealizado;
        String pagaImpuesto;

        escribir.println("Digite el consumo mensual de electricidad de la persona en kilovatios:");
        consumoRealizado = Double.parseDouble(leer.readLine());

        if (consumoRealizado >= 280){
            pagaImpuesto = "La persona debe pagar el impuesto al valor agregado";
        } else {
            pagaImpuesto = "La persona no debe pagar el impuesto al valor agregado";
        }

        escribir.println(pagaImpuesto);
    }
}