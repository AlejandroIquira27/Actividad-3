
package com.mycompany.figurasgeometricas;

public class Rectangulo {
    
    public static double Calcular_Perimetro(double base, double altura){
        double perimetro = (2 * base) + (2 * altura);
        return perimetro;
    }
    
    public static double Calcular_Area(double base, double altura){
        double area = base * altura;
        return area;
    }
    
}
