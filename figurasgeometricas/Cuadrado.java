
package com.mycompany.figurasgeometricas;

public class Cuadrado {
    
    public static double Perimetro(double lado){
        double perimetro = 4 * lado;
        return perimetro;
    }
    
    public static double Area(double lado){
        double area = Math.pow(lado,2);
        return area;
    }
    
}
